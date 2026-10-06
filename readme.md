# Troubleshooting — JUnit 6 Runner no Eclipse

## Erro

Ao executar um teste JUnit 6 pelo Eclipse, pode ocorrer o seguinte erro:

```text
Error opening zip file or JAR manifest missing :

Error occurred during initialization of VM

agent library failed Agent_OnLoad: instrument
```

Esse erro pode acontecer quando o Eclipse está tentando iniciar a JVM com um parâmetro `-javaagent` inválido.

---

# 1. Identificando o problema

Ao executar o teste pelo Eclipse, observe o comando Java apresentado no Console.

Um exemplo de configuração incorreta:

```text
C:\dev\jdk-25.0.3\bin\javaw.exe
-ea
-javaagent:
-Dfile.encoding=UTF-8
...
```

O problema está exatamente aqui:

```text
-javaagent:
```

O parâmetro `-javaagent` precisa receber o caminho de um arquivo JAR.

Por exemplo:

```text
-javaagent:C:\caminho\agente.jar
```

Porém, neste caso existe apenas:

```text
-javaagent:
```

Ou seja, o caminho do agente está vazio.

---

# 2. Por que esse erro acontece?

A opção:

```text
-javaagent:
```

é uma opção da JVM utilizada para carregar um Java Agent.

A estrutura correta é:

```text
-javaagent:caminho-do-arquivo.jar
```

Quando o Eclipse executa:

```text
-javaagent:
```

a JVM tenta carregar um agente cujo caminho está vazio.

Consequentemente, a JVM falha antes mesmo de iniciar o teste:

```text
Error opening zip file or JAR manifest missing :

Error occurred during initialization of VM

agent library failed Agent_OnLoad: instrument
```

Portanto, **o teste JUnit ainda nem começou a executar**.

---

# 3. Corrigindo no Eclipse

No Eclipse, acesse:

```text
Run
→ Run Configurations...
```

Depois selecione:

```text
JUnit
→ AtletaTest
```

ou a configuração do teste que está apresentando o erro.

Acesse a aba:

```text
Arguments
```

Procure o campo:

```text
VM arguments
```

Você poderá encontrar algo parecido com:

```text
-ea
-javaagent:
```

Remova completamente:

```text
-javaagent:
```

Deixe somente:

```text
-ea
```

Depois clique em:

```text
Apply
```

e:

```text
Run
```

---

# 4. Como deve ficar

### Configuração incorreta

```text
VM arguments:

-ea
-javaagent:
```

### Configuração correta

```text
VM arguments:

-ea
```

O `-javaagent:` não deve permanecer vazio.

---

# 5. Verificando o comando gerado pelo Eclipse

Depois da correção, o início do comando Java deve ser semelhante a:

```text
C:\dev\jdk-25.0.3\bin\javaw.exe
-ea
-Dfile.encoding=UTF-8
-Dstdout.encoding=UTF-8
-Dstderr.encoding=UTF-8
```

E **não deve existir**:

```text
-javaagent:
```

---

# 6. JUnit 6 Runner

Se o projeto estiver utilizando JUnit 6, o Eclipse deverá executar o teste utilizando o JUnit 6 Test Loader.

No comando de execução, pode aparecer:

```text
-testLoaderClass org.eclipse.jdt.internal.junit6.runner.JUnit6TestLoader
```

e:

```text
-loaderpluginname org.eclipse.jdt.junit6.runtime
```

Isso indica que o Eclipse está utilizando o runner do JUnit 6.

Exemplo:

```text
-testLoaderClass org.eclipse.jdt.internal.junit6.runner.JUnit6TestLoader
-loaderpluginname org.eclipse.jdt.junit6.runtime
-classNames br.botelho.loester.exercicios05102026.exercicio4.AtletaTest
```

---

# 7. Não confundir `Mockito` com `-javaagent`

O projeto pode possuir Mockito como dependência:

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.20.0</version>
    <scope>test</scope>
</dependency>
```

Isso não significa que o Eclipse precisa necessariamente executar:

```text
-javaagent:
```

Ter o Mockito no `classpath` é diferente de configurar um Java Agent.

Por exemplo, o classpath pode conter:

```text
mockito-core-5.20.0.jar
```

e isso não significa que devemos adicionar:

```text
-javaagent:
```

manualmente na configuração do Eclipse.

---

# 8. Verificando o `pom.xml`

O `pom.xml` também deve ser verificado.

Se o projeto não precisa de configuração especial de Java Agent, evite configurações como:

```xml
<argLine>
    -javaagent:...
</argLine>
```

ou:

```xml
<argLine>
    @{argLine}
</argLine>
```

Para um projeto utilizando JUnit 6 normalmente é suficiente ter o Surefire configurado, por exemplo:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.5.4</version>
</plugin>
```

---

# 9. Eclipse x Maven

É importante entender que existem duas formas diferentes de executar os testes.

## Eclipse

Quando utilizamos:

```text
Run As
→ JUnit Test
```

o Eclipse inicia diretamente a JVM utilizando o seu próprio JUnit Runner.

Nesse caso, a configuração:

```text
Run Configurations
→ JUnit
→ Arguments
→ VM arguments
```

é importante.

---

## Maven

Quando utilizamos:

```bash
mvn clean test
```

os testes são executados pelo:

```text
Maven Surefire Plugin
```

Portanto, uma configuração incorreta no Eclipse pode afetar:

```text
Run As → JUnit Test
```

sem necessariamente afetar:

```bash
mvn clean test
```

Da mesma forma, uma configuração i

---


# Debugging

Projeto Java 25 com Maven, JUnit 6 e Mockito.

## Executar

```bash
docker run --rm -it loesterbotelho/debugging:1.0.0
```
