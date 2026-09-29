# CONTRIBUTING.md — Guia de Contribuição

Este documento define as boas práticas para desenvolvimento, testes, Git, Pull Requests e Code Review em projetos Java.

O objetivo é manter o código **legível, testável, seguro, sustentável e fácil de manter**.

---

## 1. Tecnologias

O projeto utiliza:

* Java
* Maven
* JUnit
* Mockito

As versões devem ser consultadas no `pom.xml`.

---

## 2. Estrutura do Projeto

Preferencialmente, utilizar a estrutura padrão do Maven:

```text
projeto/
├── pom.xml
├── README.md
├── CONTRIBUTING.md
└── src/
    ├── main/
    │   └── java/
    └── test/
        └── java/
```

* `src/main/java`: código da aplicação.
* `src/test/java`: testes automatizados.

---

## 3. Pré-requisitos

Verifique as ferramentas instaladas:

```bash
java -version
mvn -version
git --version
```

As versões exigidas pelo projeto devem ser verificadas no `pom.xml`.

---

## 4. Compilação e Testes

Compilar:

```bash
mvn clean compile
```

Executar os testes:

```bash
mvn clean test
```

Validar o projeto completamente, quando aplicável:

```bash
mvn clean verify
```

Antes de abrir um Pull Request, os testes devem estar passando.

---

# 5. Branches

Não desenvolver diretamente na `main`.

Utilize branches específicas para cada alteração:

```text
feature/nova-funcionalidade
fix/correcao-de-bug
refactor/refatoracao
test/adicionar-testes
docs/atualizar-documentacao
chore/atualizacao-configuracao
build/alteracao-build
ci/alteracao-ci
```

### Criando uma branch

```bash
git checkout main
git pull origin main
git checkout -b refactor/exercicio-1
```

A branch deve possuir um objetivo claro e específico.

---

# 6. Conventional Commits

Os commits devem seguir:

```text
tipo: descrição
```

Principais tipos:

| Tipo       | Utilização                                          |
| ---------- | --------------------------------------------------- |
| `feat`     | Nova funcionalidade                                 |
| `fix`      | Correção de bug                                     |
| `refactor` | Refatoração sem alteração de comportamento          |
| `test`     | Testes                                              |
| `docs`     | Documentação                                        |
| `style`    | Formatação ou estilo sem alteração de comportamento |
| `build`    | Build e dependências                                |
| `ci`       | Integração contínua                                 |
| `chore`    | Manutenção                                          |

Exemplos:

```text
feat: adicionar cálculo de média
fix: corrigir divisão inteira
refactor: separar responsabilidade do serviço
test: adicionar testes para altura inválida
docs: atualizar guia de contribuição
```

O tipo do commit deve representar corretamente a alteração realizada.

---

# 7. Fluxo de Desenvolvimento

Fluxo recomendado:

```bash
git checkout main
git pull origin main

git checkout -b refactor/exercicio-1

# desenvolvimento

mvn clean test

git status
git diff

git add .
git commit -m "refactor: ajustar exercício 1"

git push -u origin refactor/exercicio-1
```

Depois do primeiro `push -u`, os comandos podem ser simplificados:

```bash
git push
git pull
```

O `-u` configura a branch remota como upstream da branch local.

---

# 8. Pull Request

O Pull Request deve:

* possuir objetivo claro;
* conter somente alterações relacionadas ao objetivo;
* incluir testes quando aplicável;
* informar como a alteração foi validada;
* facilitar a revisão;
* evitar alterações desnecessárias.

Evite Pull Requests excessivamente grandes.

### Modelo

```markdown
## Descrição

Solicito revisão das alterações realizadas neste Pull Request.

## Alterações

- Refatoração da implementação.
- Separação de responsabilidades.
- Ajustes na validação.
- Adição de testes.

## Testes

- [x] Testes unitários
- [x] Testes de integração
- [x] Testes de regressão
- [x] `mvn clean test`

## Code Review

Código revisado quanto a:

- Funcionalidade
- Validação
- Exceções
- Testes
- Legibilidade
- Segurança
- Manutenibilidade

## Resultado

Aguardando revisão.
```

---

# 9. Testes

Os testes devem ser:

* determinísticos;
* independentes;
* rápidos;
* legíveis;
* reproduzíveis.

Devem validar principalmente:

* cenários de sucesso;
* cenários de erro;
* valores de limite;
* regras de negócio;
* regressões conhecidas.

### Teste de regressão

Quando um bug for encontrado:

```text
Bug
 ↓
Teste que reproduz o bug
 ↓
Correção
 ↓
Teste passando
 ↓
Prevenção contra regressão
```

Um bug relevante corrigido deve possuir um teste que impeça sua reincidência.

---

# 10. JUnit

Os testes devem validar comportamento, não detalhes internos da implementação.

Exemplo:

```java
@Test
void deveLancarExceptionQuandoAlturaForNegativa() {

    assertThrows(
            AlturaInvalidaException.class,
            () -> executar(...)
    );
}
```

Evite testar métodos `private` diretamente através de Reflection apenas para aumentar cobertura.

Prefira testar o comportamento exposto pela API pública da classe.

---

# 11. Mockito

Mockito deve ser utilizado para isolar **dependências reais**.

Exemplos:

* repository;
* API externa;
* serviço externo;
* mensageria;
* dependências complexas.

Evite Mockito para lógica pura.

Exemplo desnecessário:

```java
when(calculadora.calcular(10, 20)).thenReturn(30);
```

Se `calculadora` contém apenas lógica matemática, teste a implementação real.

---

# 12. Testes de Integração

Testes de integração devem validar a comunicação entre componentes.

Exemplos:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

Podem utilizar recursos controlados, como:

* H2;
* Testcontainers;
* banco de teste;
* infraestrutura específica do projeto.

Testes de integração não devem depender de serviços externos não controlados sem justificativa.

---

# 13. Qualidade do Código

O código deve priorizar:

* legibilidade;
* simplicidade;
* coesão;
* baixo acoplamento;
* separação de responsabilidades;
* testabilidade;
* manutenibilidade.

Evite:

* duplicação;
* complexidade desnecessária;
* métodos excessivamente grandes;
* classes com responsabilidades demais;
* código morto;
* código comentado;
* abstrações desnecessárias;
* soluções excessivamente complexas.

---

# 14. Responsabilidades

Cada classe e método deve possuir responsabilidade clara.

Evite concentrar na mesma classe:

```text
Entrada
Regra de negócio
Persistência
Formatação
Comunicação externa
```

Quando aplicável, separar responsabilidades:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

A arquitetura deve ser proporcional à complexidade do projeto.

Evite tanto **overengineering** quanto **underengineering**.

---

# 15. Nomenclatura

### Classes

Utilizar `PascalCase`:

```java
CalculadoraMedia
UsuarioService
PedidoController
```

### Métodos e variáveis

Utilizar `camelCase`:

```java
calcularMedia()
quantidadeAlunos
nomeUsuario
```

Os nomes devem representar claramente sua finalidade.

Evite:

```java
int x;
double a;
String n;
```

quando nomes descritivos forem possíveis.

### Constantes

Utilizar `UPPER_SNAKE_CASE`:

```java
private static final int HORA_MAXIMA = 24;
```

### Packages

Utilizar letras minúsculas:

```java
package br.botelho.loester.exercicios;
```

---

# 16. Parâmetros de Métodos

Preferencialmente, métodos devem possuir **1 ou 2 parâmetros**.

Quando vários parâmetros representam uma mesma entidade ou conceito, considere encapsulá-los em um objeto.

Evite:

```java
criar(
    String nome,
    String cpf,
    String email,
    String telefone,
    String endereco,
    String cidade,
    String estado,
    String cep
);
```

Prefira:

```java
criar(Pessoa pessoa);
```

A quantidade de parâmetros não é uma regra absoluta: casos maiores devem possuir justificativa técnica.

Também evite parâmetros sem relação entre si.

---

# 17. Exceções

Exceções devem representar claramente o problema ocorrido.

Evite:

```java
throw new Exception("Erro.");
```

quando uma exceção específica for apropriada.

Evite também:

```java
catch (Exception e) {
}
```

ou:

```java
catch (Exception e) {
    // ignorar
}
```

Exceções não devem ser silenciosamente ignoradas.

O tratamento deve ocorrer no nível responsável por tratar o problema. Quando a camada atual não puder tratá-lo adequadamente, a exceção deve ser propagada.

---

# 18. Validação

Entradas inválidas devem ser tratadas de forma adequada.

Exemplo:

```java
if (altura < 0) {
    throw new AlturaInvalidaException(
            "A altura deve ser maior que zero."
    );
}
```

Validações importantes não devem depender exclusivamente da camada de apresentação.

---

# 19. Valores e Strings de Domínio

Evite valores mágicos relevantes:

```java
if (hora >= 24) {
}
```

Prefira:

```java
private static final int HORA_MAXIMA = 24;
```

Para estados finitos e conhecidos, considere `enum`:

```java
Status.ATIVO
```

em vez de strings arbitrárias:

```java
"ATIVO"
```

quando isso fizer parte do domínio da aplicação.

---

# 20. Recursos

Recursos devem ser corretamente gerenciados.

Exemplos:

* arquivos;
* streams;
* conexões JDBC;
* sockets;
* recursos de rede.

Utilize mecanismos apropriados, como `try-with-resources`, quando aplicável.

---

# 21. Segurança

Nunca versionar:

```text
Senhas
Tokens
API Keys
Credenciais
Chaves privadas
Segredos
```

Utilize variáveis de ambiente ou mecanismos apropriados de configuração.

Também devem ser evitados:

* SQL Injection;
* dados sensíveis em logs;
* credenciais em exceptions;
* desserialização insegura;
* validações de segurança insuficientes;
* exposição indevida de dados.

Exemplo inadequado:

```java
String sql =
        "SELECT * FROM usuario WHERE nome = '" + nome + "'";
```

Prefira queries parametrizadas ou mecanismos equivalentes.

---

# 22. Logging

Não registrar informações sensíveis:

```java
System.out.println(senha);
```

Aplicações que utilizam logging estruturado devem seguir o mecanismo definido pelo projeto.

`System.out` pode ser utilizado em aplicações console quando fizer parte do objetivo da aplicação.

Evite `System.exit()` para tratamento de erros de negócio.

---

# 23. Performance

A implementação deve possuir complexidade adequada ao problema.

Avaliar especialmente:

* loops desnecessários;
* operações `O(n²)` evitáveis;
* consultas repetidas;
* N+1 queries;
* estruturas de dados inadequadas;
* processamento duplicado;
* operações de I/O desnecessárias.

Exemplo: buscas frequentes podem justificar `Set` ou `Map` em vez de `List`, dependendo do caso.

Performance deve ser avaliada de acordo com o volume de dados e o contexto real da aplicação.

---

# 24. Concorrência

Quando houver execução concorrente, avaliar:

* race conditions;
* deadlocks;
* starvation;
* estado compartilhado;
* sincronização;
* consistência dos dados.

Código concorrente deve possuir estratégia explícita e adequada ao problema.

---

# 25. Dependências e Configuração

Dependências devem:

* possuir finalidade clara;
* ser compatíveis com o projeto;
* utilizar escopo adequado;
* evitar duplicidade;
* estar em versões compatíveis.

Dependências utilizadas somente em testes devem utilizar:

```xml
<scope>test</scope>
```

quando aplicável.

A configuração do projeto deve ser compatível com o código e com a versão de Java definida no `pom.xml`.

---

# 26. Documentação

Quando uma alteração modificar comportamento, configuração ou processo de execução, a documentação correspondente deve ser atualizada.

O `README.md` deve conter instruções funcionais e coerentes com o projeto.

---

# 27. Git e Escopo

O Pull Request deve conter somente alterações relacionadas ao objetivo declarado.

Evite versionar:

```text
target/
*.log
arquivos temporários
arquivos da IDE
credenciais
```

quando não fizerem parte do projeto.

O histórico deve ser compreensível e os commits devem representar corretamente as alterações realizadas.

---

# 28. Code Review — Critérios de Reprovação

Um Pull Request deve retornar para correção quando apresentar problema relevante em qualquer uma destas categorias:

### Funcionalidade

* requisito não atendido;
* comportamento incorreto;
* regressão funcional;
* contrato da API violado.

### Código

* responsabilidade excessiva;
* duplicação relevante;
* código morto;
* complexidade desnecessária;
* acoplamento inadequado;
* nomenclatura incompatível com o padrão;
* formatação incompatível com o projeto.

### Exceções e validação

* entrada inválida não tratada;
* exceção inadequada;
* `catch` genérico sem justificativa;
* exception silenciosamente ignorada;
* erro tratado no nível incorreto.

### Testes

* testes falhando;
* ausência de testes para regra relevante;
* cenário de sucesso não testado;
* cenário de erro não testado;
* regressão sem teste;
* assertions insuficientes;
* testes dependentes entre si;
* testes flaky;
* testes dependentes de ambiente não controlado;
* teste unitário utilizando dependência externa sem necessidade.

### Mockito

* mock desnecessário;
* mock incompatível com o contrato;
* teste excessivamente acoplado à implementação.

### Segurança

* segredo versionado;
* SQL Injection;
* exposição de dados sensíveis;
* vulnerabilidade conhecida;
* validação de segurança insuficiente.

### Performance

* complexidade desnecessária;
* consultas excessivas;
* processamento duplicado;
* estrutura de dados inadequada;
* degradação significativa e previsível.

### Git e PR

* alteração fora do escopo;
* arquivos desnecessários;
* branch incorreta;
* Conventional Commit incompatível;
* build quebrado;
* documentação obrigatória desatualizada.

---

# 29. Checklist Final

Antes de solicitar aprovação:

```text
[ ] Requisito funcional atendido
[ ] Código compila
[ ] mvn clean test executado com sucesso
[ ] mvn clean verify executado quando aplicável
[ ] Cenários de sucesso testados
[ ] Cenários de erro testados
[ ] Exceptions testadas
[ ] Testes de regressão adicionados quando necessário
[ ] Testes de integração executados quando aplicável
[ ] Mockito utilizado somente quando necessário
[ ] Testes independentes e determinísticos
[ ] Classes com responsabilidades claras
[ ] Métodos com responsabilidades claras
[ ] Parâmetros adequadamente agrupados
[ ] Nomenclatura correta
[ ] Packages em lowercase
[ ] Ausência de duplicação relevante
[ ] Ausência de código morto
[ ] Ausência de código comentado
[ ] Ausência de valores mágicos relevantes
[ ] Exceções tratadas adequadamente
[ ] Recursos corretamente gerenciados
[ ] Sem secrets ou credenciais
[ ] Sem vulnerabilidades conhecidas
[ ] Performance adequada
[ ] Documentação atualizada quando necessário
[ ] Alterações dentro do escopo do PR
[ ] Branch correta
[ ] Conventional Commit correto
[ ] Nenhuma regressão identificada
```

---

# 30. Resultado do Code Review

### Aprovado

```text
Code Review concluído.

Nenhum problema impeditivo foi identificado.
Os critérios obrigatórios foram atendidos.

Pull Request aprovado para merge.
```

### Alterações solicitadas

```text
Code Review concluído.

Foram identificados pontos que precisam ser corrigidos antes do merge.

Após as correções, os testes devem ser executados novamente e o Pull Request deverá passar por nova revisão.
```

### Observação

Problemas exclusivamente cosméticos e sem impacto nas regras ou padrões obrigatórios do projeto podem ser registrados como **sugestões de melhoria**, em vez de motivo para reprovação.

---

# 31. Regra de Ouro

```text
Código funcionando
        +
Testes passando
        +
Código legível
        +
Alteração segura
        +
Commit organizado
        +
Pull Request claro
        =
Código sustentável
```

O objetivo não é apenas fazer o código funcionar.

O objetivo é produzir código **legível, testável, seguro, sustentável e fácil de evoluir**.
