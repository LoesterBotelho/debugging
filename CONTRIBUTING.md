# CONTRIBUTING.md — Guia de Contribuição

Este documento define as boas práticas para desenvolvimento, testes, commits, branches e Pull Requests em projetos Java.

O objetivo é manter o código organizado, testável, seguro e fácil de manter.

---

## 1. Tecnologias

O projeto utiliza:

* Java
* Maven
* JUnit
* Mockito

As versões utilizadas devem ser consultadas diretamente no arquivo `pom.xml`.

---

## 2. Estrutura do Projeto

O projeto deve seguir, preferencialmente, a estrutura padrão do Maven:

```text
projeto/
├── pom.xml
├── README.md
├── CONTRIBUTING.md
└── src/
    ├── main/
    │   └── java/
    │       └── ...
    └── test/
        └── java/
            └── ...
```

### `src/main/java`

Contém o código-fonte da aplicação.

### `src/test/java`

Contém os testes automatizados.

---

## 3. Pré-requisitos

Antes de iniciar o desenvolvimento, verifique se estão instalados:

```bash
java -version
mvn -version
git --version
```

As versões esperadas de Java, Maven e das bibliotecas devem ser verificadas no `pom.xml`.

---

## 4. Clonar o Projeto

```bash
git clone <URL_DO_REPOSITORIO>
```

Entre no diretório:

```bash
cd <NOME_DO_PROJETO>
```

---

## 5. Compilação

Para compilar o projeto:

```bash
mvn clean compile
```

O comando `clean` remove arquivos gerados anteriormente.

O comando `compile` compila o código-fonte da aplicação.

---

## 6. Testes

Execute todos os testes automatizados:

```bash
mvn test
```

Antes de criar um Pull Request, todos os testes devem ser executados com sucesso.

---

## 7. Empacotamento

Para gerar o artefato da aplicação:

```bash
mvn clean package
```

O arquivo gerado normalmente estará no diretório:

```text
target/
```

Caso o projeto gere um arquivo JAR executável:

```bash
java -jar target/<ARQUIVO>.jar
```

---

# 8. Branches

As branches devem representar claramente o objetivo da alteração.

Exemplos:

```text
feature/nova-funcionalidade
fix/correcao-de-bug
refactor/refatoracao
test/adicionar-testes
docs/atualizar-documentacao
chore/atualizacao-configuracao
```

Evite utilizar diretamente a branch principal para desenvolver funcionalidades ou correções.

---

# 9. Criando uma Branch

Antes de criar uma nova branch, atualize a branch principal:

```bash
git checkout main
git pull origin main
```

Crie uma nova branch:

```bash
git checkout -b refactor/exercicio-1
```

A partir desse momento, o desenvolvimento deve ser realizado nessa branch.

---

# 10. Conventional Commits

Os commits devem seguir o padrão:

```text
tipo: descrição
```

Exemplos:

```text
feat: adicionar nova funcionalidade
fix: corrigir cálculo da média
refactor: reorganizar classe de serviço
test: adicionar testes unitários
docs: atualizar documentação
chore: atualizar configuração do projeto
```

## Principais tipos

| Tipo       | Utilização                               |
| ---------- | ---------------------------------------- |
| `feat`     | Nova funcionalidade                      |
| `fix`      | Correção de bug                          |
| `refactor` | Refatoração sem mudança de comportamento |
| `test`     | Criação ou alteração de testes           |
| `docs`     | Documentação                             |
| `chore`    | Tarefas de manutenção                    |
| `build`    | Alterações no processo de build          |
| `ci`       | Alterações em integração contínua        |

---

# 11. Fluxo de Desenvolvimento

O fluxo recomendado é:

### 1. Atualizar a branch principal

```bash
git checkout main
git pull origin main
```

### 2. Criar uma branch

```bash
git checkout -b refactor/exercicio-1
```

### 3. Desenvolver

Realize as alterações necessárias no código.

### 4. Executar os testes

```bash
mvn test
```

### 5. Verificar as alterações

```bash
git status
git diff
```

### 6. Adicionar os arquivos

```bash
git add .
```

### 7. Criar o commit

```bash
git commit -m "refactor: ajustar exercício 1"
```

### 8. Enviar a branch para o repositório remoto

No primeiro envio da branch:

```bash
git push -u origin refactor/exercicio-1
```

O comando possui três partes principais:

```text
git push
```

Envia os commits locais para o repositório remoto.

```text
-u
```

Configura a branch remota como **upstream** da branch local.

Isso significa que o Git passa a associar a branch local à sua correspondente no repositório remoto.

```text
origin
```

É o nome padrão do repositório remoto.

```text
refactor/exercicio-1
```

É o nome da branch que será enviada.

Depois que o upstream estiver configurado, não é necessário informar novamente o repositório e a branch:

```bash
git push
```

Da mesma forma, para atualizar a branch local:

```bash
git pull
```

### Exemplo completo

```bash
git checkout main
git pull origin main

git checkout -b refactor/exercicio-1

mvn test

git status
git add .
git commit -m "refactor: ajustar exercício 1"

git push -u origin refactor/exercicio-1
```

### 9. Criar o Pull Request

Após enviar a branch, abra um Pull Request direcionado para a branch principal.

O Pull Request deve explicar:

* O que foi alterado
* Por que a alteração foi necessária
* Quais testes foram realizados
* Se existe alguma consideração importante para a revisão

---

# 12. Testes Unitários

Testes unitários devem validar uma unidade específica do código de forma isolada.

Exemplos:

* Métodos
* Classes
* Regras de negócio
* Validações
* Cálculos

Os testes devem ser:

* Determinísticos
* Independentes
* Fáceis de entender
* Rápidos de executar

---

# 13. Mockito

O Mockito deve ser utilizado quando for necessário criar mocks, stubs ou verificar interações entre objetos.

Exemplo de situações:

* Simular uma dependência
* Isolar uma classe
* Controlar o retorno de uma dependência
* Verificar se determinado método foi chamado

Evite utilizar mocks desnecessariamente.

O objetivo é testar o comportamento da unidade sob teste, não reproduzir a implementação interna de suas dependências.

---

# 14. Testes de Integração

Testes de integração devem validar a comunicação entre diferentes componentes da aplicação.

Exemplos:

* Serviço + banco de dados
* Repository + banco de dados
* API + camada de serviço
* Integração entre componentes

Esses testes devem verificar se as partes do sistema funcionam corretamente quando utilizadas em conjunto.

---

# 15. Testes de Regressão

Testes de regressão devem garantir que alterações realizadas no código não quebrem funcionalidades que anteriormente funcionavam.

Sempre que um bug for corrigido, considere adicionar um teste que reproduza o problema.

Exemplo:

```text
Bug encontrado
      ↓
Criar teste que reproduz o bug
      ↓
Corrigir implementação
      ↓
Executar teste
      ↓
Garantir que o bug não volte
```

---

# 16. Refatoração

Refatorações devem melhorar a estrutura interna do código sem alterar seu comportamento esperado.

Exemplos:

* Extrair métodos
* Separar responsabilidades
* Reduzir duplicação
* Melhorar nomes
* Reduzir complexidade
* Melhorar testabilidade

Sempre que possível, execute os testes antes e depois da refatoração.

```bash
mvn test
```

---

# 17. Responsabilidade das Classes

Cada classe deve possuir uma responsabilidade clara.

Evite classes que concentrem:

* Entrada de dados
* Regras de negócio
* Persistência
* Formatação
* Comunicação externa

na mesma classe.

Prefira separar responsabilidades.

Exemplo conceitual:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

---

# 18. Regras de Código

O código deve priorizar:

* Legibilidade
* Simplicidade
* Baixo acoplamento
* Alta coesão
* Separação de responsabilidades
* Testabilidade
* Manutenibilidade

Evite:

* Código duplicado
* Métodos excessivamente grandes
* Classes com muitas responsabilidades
* Variáveis com nomes genéricos
* Tratamento de exceções inadequado
* Complexidade desnecessária

---

# 19. Segurança

Nunca faça commit de informações sensíveis.

Não adicionar ao repositório:

```text
Senhas
Tokens
API Keys
Credenciais
Chaves privadas
Arquivos de configuração com dados sensíveis
```

Utilize variáveis de ambiente ou mecanismos apropriados de configuração.

Antes do commit:

```bash
git status
git diff
```

Verifique cuidadosamente os arquivos que serão enviados.

---

# 20. Checklist Antes do Commit

Antes de realizar um commit, verifique:

* [ ] O código compila
* [ ] Os testes passam
* [ ] A alteração possui uma responsabilidade clara
* [ ] Não existem arquivos desnecessários
* [ ] Não existem credenciais no código
* [ ] Não existem alterações acidentais
* [ ] O código segue o padrão do projeto
* [ ] A mensagem do commit segue Conventional Commits

Execute:

```bash
mvn clean test
```

Depois:

```bash
git status
git diff
```

---

# 21. Pull Request

Antes de abrir um Pull Request:

```bash
mvn clean test
```

Verifique também:

```bash
git status
```

O Pull Request deve:

* Ter uma descrição clara
* Possuir uma finalidade específica
* Conter testes quando aplicável
* Não incluir alterações não relacionadas
* Permitir uma revisão objetiva

Evite Pull Requests excessivamente grandes.

---

# 22. Fluxo de Branches

Fluxo recomendado:

```text
main
  │
  ├── feature/nova-funcionalidade
  │
  ├── fix/correcao
  │
  ├── refactor/refatoracao
  │
  ├── test/testes
  │
  └── docs/documentacao
```

Após a revisão e aprovação:

```text
branch de trabalho
        ↓
Pull Request
        ↓
revisão
        ↓
testes
        ↓
merge
        ↓
main
```

---

# 23. Regra de Ouro

Antes de enviar qualquer alteração:

```text
Código funcionando
       +
Testes passando
       +
Commit organizado
       +
Branch organizada
       +
Pull Request claro
```

O objetivo não é apenas fazer o código funcionar.

O objetivo é produzir código **legível, testável, seguro, sustentável e fácil de evoluir**.

---

# 24. Objetivo

Este guia estabelece um padrão comum para contribuição em projetos Java, facilitando:

* Desenvolvimento
* Testes
* Revisão de código
* Manutenção
* Colaboração
* Evolução do projeto

---

# 25. Pull Request e Code Review

Todo Pull Request deve apresentar uma descrição clara da alteração realizada e facilitar o processo de revisão do código.

## Descrição do Pull Request

Utilize uma estrutura semelhante:

```markdown
## Descrição

Solicito revisão e aprovação das alterações realizadas.

### Alterações

- Descrição da alteração 1
- Descrição da alteração 2
- Descrição da alteração 3

### Testes

- [x] Testes unitários executados
- [x] Testes de integração executados
- [x] `mvn clean test` executado com sucesso

### Code Review

Código revisado e validado.

### Resultado

Aprovado.
```

## Exemplo

```markdown
## Descrição

Solicito revisão e aprovação das alterações realizadas.

### Alterações

- Refatoração da implementação.
- Separação de responsabilidades.
- Ajustes na validação dos dados.
- Adição de testes automatizados.

### Testes

- [x] Testes unitários
- [x] Testes de integração
- [x] Testes de regressão
- [x] `mvn clean test`

### Code Review

Código analisado quanto a:

- Legibilidade
- Organização
- Separação de responsabilidades
- Tratamento de exceções
- Cobertura de testes
- Possíveis impactos em funcionalidades existentes

### Resultado

**Aprovado.**

Nenhum problema impeditivo identificado durante a revisão.
```

## Quando houver problemas no Code Review

Caso sejam encontrados problemas, registre-os explicitamente:

```markdown
### Code Review

Foram identificados os seguintes pontos:

- [ ] Melhorar validação de entrada.
- [ ] Adicionar teste para cenário de erro.
- [ ] Ajustar nome do método.
- [ ] Remover duplicação de código.

### Resultado

**Alterações solicitadas.**

O Pull Request deve ser atualizado antes da aprovação.
```

## Após a correção

Depois que os pontos forem corrigidos:

```markdown
### Code Review

Os pontos identificados na revisão foram corrigidos e os testes foram executados novamente.

### Resultado

**Aprovado.**

Código revisado e validado.
```

## Padrão resumido

Para Pull Requests simples, pode ser utilizado:

```markdown
## Descrição

Solicito revisão e aprovação das alterações realizadas.

## Testes

- [x] `mvn clean test`

## Code Review

Código revisado e validado.

## Resultado

**Aprovado.**
```

A descrição do Pull Request deve permitir que outra pessoa compreenda **o que foi alterado, como foi validado e qual é o estado da revisão** sem precisar analisar todo o histórico de commits.

---

# Contributing

Obrigado por contribuir com este projeto.

Este documento define o fluxo de trabalho com Git, padrão de branches, commits e versionamento utilizado no projeto.

---

## 1. Branches principais

O projeto utiliza três branches principais:

```text
main
develop
staging
```

### `main`

Representa o código considerado **estável e pronto para produção**.

```text
main
```

A branch `main` deve conter apenas versões estáveis e oficialmente liberadas.

Exemplo:

```text
v1.0.0
v1.1.0
v2.0.0
```

---

### `develop`

É a branch de **desenvolvimento**.

```text
develop
```

Novas funcionalidades, refatorações e correções são integradas primeiro em `develop`.

---

### `staging`

É utilizada para **homologação e validação integrada** antes da publicação em produção.

```text
staging
```

Pode ser utilizada para testes de integração, validação da aplicação e preparação para uma release.

---

# 2. Branches de trabalho

As alterações devem ser realizadas em branches próprias.

Exemplo:

```text
refactor/exercicio-3-exceptions
```

Outros exemplos:

```text
feature/nova-funcionalidade
fix/corrige-validacao
refactor/melhora-excecoes
test/adiciona-testes
docs/atualiza-readme
```

## Convenção

Utilize um prefixo de acordo com o tipo da alteração:

| Prefixo     | Utilização                                 |
| ----------- | ------------------------------------------ |
| `feature/`  | Nova funcionalidade                        |
| `fix/`      | Correção de bug                            |
| `refactor/` | Refatoração sem alteração de comportamento |
| `test/`     | Criação ou alteração de testes             |
| `docs/`     | Documentação                               |
| `chore/`    | Tarefas de manutenção                      |
| `build/`    | Alterações de build/dependências           |

---

# 3. Criando uma branch

Antes de iniciar uma alteração, atualize a branch `main`:

```bash
git checkout main
git pull
```

Crie uma nova branch:

```bash
git checkout -b refactor/exercicio-3-exceptions
```

Faça as alterações necessárias.

---

# 4. Commit

Adicione os arquivos modificados:

```bash
git add src/main/java/br/botelho/loester/exercicios/Ex3.java
```

Crie o commit:

```bash
git commit -m "refactor: permite propagação das exceções no exercício 3"
```

O projeto utiliza mensagens de commit seguindo o padrão **Conventional Commits**.

Formato:

```text
tipo: descrição
```

Exemplos:

```text
feat: adiciona novo exercício
fix: corrige tratamento de exceção
refactor: simplifica implementação
test: adiciona testes para exercício 3
docs: atualiza documentação
chore: atualiza dependências
```

---

# 5. Enviando a branch para o GitHub

Após criar o commit:

```bash
git push -u origin refactor/exercicio-3-exceptions
```

Depois disso, deve ser criado um **Pull Request** para a branch de destino definida pelo fluxo do projeto.

---

# 6. Finalizando a branch

Depois que o Pull Request for integrado, volte para `main`:

```bash
git checkout main
git pull
```

Remova a branch local:

```bash
git branch -D refactor/exercicio-3-exceptions
```

Se necessário, a branch remota também pode ser removida:

```bash
git push origin --delete refactor/exercicio-3-exceptions
```

---

# 7. Fluxo de desenvolvimento

O fluxo básico do projeto é:

```text
main
  │
  └── develop
        │
        └── feature/*
        └── fix/*
        └── refactor/*
        └── test/*
        └── docs/*
        │
        ↓
     staging
        │
        ↓
      release
        │
        ↓
       main
```

De forma simplificada:

```text
Branch de trabalho
        ↓
     develop
        ↓
     staging
        ↓
     release
        ↓
      main
```

---

# 8. Release Branches

As branches de release seguem o seguinte padrão:

```text
release/1.0.0-alpha
release/1.0.0-beta
release/1.0.0-rc.1
release/1.0.0
```

Para novas versões de uma mesma etapa:

```text
release/1.0.0-alpha.2
release/1.0.0-beta.2
release/1.0.0-rc.2
```

---

# 9. Semantic Versioning

O projeto utiliza o padrão:

```text
MAJOR.MINOR.PATCH-PRERELEASE
```

Exemplo:

```text
1.0.0-alpha.1
```

Onde:

```text
MAJOR   = 1
MINOR   = 0
PATCH   = 0
PRE     = alpha.1
```

---

# 10. Ciclo de uma versão

| Versão          | Etapa                  | Objetivo                                |
| --------------- | ---------------------- | --------------------------------------- |
| `1.0.0-alpha.1` | **Alpha**              | Desenvolvimento e testes internos       |
| `1.0.0-alpha.2` | **Alpha 2**            | Nova rodada de desenvolvimento e testes |
| `1.0.0-beta.1`  | **Beta**               | QA e testes mais amplos                 |
| `1.0.0-beta.2`  | **Beta 2**             | Nova rodada de QA                       |
| `1.0.0-rc.1`    | **Release Candidate**  | Homologação e validação pelo cliente    |
| `1.0.0-rc.2`    | **RC 2**               | Nova rodada de homologação              |
| `1.0.0`         | **Final / Production** | Lançamento oficial em produção          |

---

# 11. Alpha

A versão **Alpha** representa uma versão ainda em desenvolvimento.

Exemplo:

```text
1.0.0-alpha.1
```

Objetivos:

* Desenvolvimento da funcionalidade;
* Testes internos;
* Identificação de problemas;
* Validação inicial da implementação.

A versão Alpha pode sofrer alterações significativas.

---

# 12. Beta

A versão **Beta** representa uma versão mais estável que a Alpha.

Exemplo:

```text
1.0.0-beta.1
```

Objetivos:

* Testes de QA;
* Testes de integração;
* Identificação de bugs;
* Validação das funcionalidades;
* Preparação para homologação.

---

# 13. Release Candidate

A versão **Release Candidate (RC)** é uma candidata à versão final.

Exemplo:

```text
1.0.0-rc.1
```

Objetivos:

* Homologação;
* Validação pelo cliente;
* Testes em ambiente semelhante à produção;
* Correção de problemas encontrados durante a homologação.

Se forem encontrados problemas, uma nova RC pode ser criada:

```text
1.0.0-rc.2
```

---

# 14. Final / Production

Quando a versão é aprovada para produção:

```text
1.0.0
```

A versão final não possui o identificador `alpha`, `beta` ou `rc`.

Exemplo:

```text
1.0.0-alpha.1
       ↓
1.0.0-beta.1
       ↓
1.0.0-rc.1
       ↓
1.0.0
```

A versão final deve ser marcada com uma tag Git:

```bash
git tag -a v1.0.0 -m "Release v1.0.0"
git push origin v1.0.0
```

---

# 15. Exemplo completo

Um ciclo completo pode seguir esta sequência:

```text
develop
   │
   ├── release/1.0.0-alpha.1
   │
   ├── release/1.0.0-alpha.2
   │
   ├── release/1.0.0-beta.1
   │
   ├── release/1.0.0-beta.2
   │
   ├── release/1.0.0-rc.1
   │
   ├── release/1.0.0-rc.2
   │
   ↓
 staging
   │
   ↓
 main
   │
   └── v1.0.0
```

---

# 16. Resumo do fluxo

```text
1. Atualizar main
   ↓
2. Criar branch de trabalho
   ↓
3. Desenvolver
   ↓
4. Criar commit
   ↓
5. Push da branch
   ↓
6. Pull Request
   ↓
7. Merge em develop
   ↓
8. Validar em staging
   ↓
9. Criar release
   ↓
10. Homologação
   ↓
11. Merge em main
   ↓
12. Criar tag da versão
```

Exemplo:

```text
feature/*
     ↓
 develop
     ↓
 staging
     ↓
release/1.0.0-rc.1
     ↓
   main
     ↓
  v1.0.0
```

---

## 17. Boas práticas

* Mantenha as branches pequenas e focadas em uma única alteração.
* Utilize nomes descritivos.
* Não faça commits diretamente em `main`.
* Não misture funcionalidades diferentes no mesmo commit.
* Escreva mensagens de commit claras.
* Execute os testes antes de abrir um Pull Request.
* Atualize sua branch antes de iniciar uma nova alteração.
* Remova branches de trabalho após o merge.
* Utilize tags para identificar versões oficialmente publicadas.
