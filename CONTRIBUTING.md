# Guia de Contribuição

Obrigado por contribuir com o projeto **debugging**.

Este documento define as convenções utilizadas no projeto para desenvolvimento, organização de branches, commits, testes e manutenção do código.

O objetivo é manter um histórico Git organizado e uma estrutura de código consistente, facilitando o aprendizado e a evolução do projeto.

---

## 1. Sobre o projeto

O projeto **debugging** é uma aplicação Java desenvolvida para estudos práticos de:

* Java 25
* Maven
* JUnit 6
* Mockito
* Testes unitários
* Testes de integração
* Testes de regressão
* Debugging
* Refatoração
* Boas práticas de desenvolvimento
* Git e GitHub

A aplicação possui uma interface de console para execução dos exercícios.

---

## 2. Tecnologias

| Tecnologia | Versão  |
| ---------- | ------- |
| Java       | 25      |
| Maven      | 3.x     |
| JUnit      | 6.0.0   |
| Mockito    | 5.20.0  |
| H2         | 2.3.232 |

---

## 3. Estrutura do projeto

```text
debugging/
├── README.md
├── CONTRIBUTING.md
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── br/
    │           └── botelho/
    │               └── loester/
    │                   ├── MainClasse.java
    │                   ├── MenuExecutor.java
    │                   └── exercicios/
    │                       ├── Ex1.java
    │                       ├── Ex2.java
    │                       └── Ex3.java
    │
    └── test/
        └── java/
            └── br/
                └── botelho/
                    └── loester/
```

---

## 4. Pré-requisitos

Para executar o projeto, é necessário possuir:

* Java 25
* Maven
* Git

Verifique as instalações:

```bash
java -version
mvn -version
git --version
```

---

## 5. Clonando o projeto

Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
```

Entre no diretório:

```bash
cd debugging
```

---

## 6. Executando o projeto

Para compilar o projeto:

```bash
mvn clean compile
```

Para executar os testes:

```bash
mvn test
```

Para empacotar a aplicação:

```bash
mvn clean package
```

O arquivo `.jar` será gerado no diretório:

```text
target/
```

---

## 7. Executando o JAR

Após executar:

```bash
mvn clean package
```

o JAR poderá ser executado utilizando:

```bash
java -jar target/debugging-1.0.0.jar
```

---

# 8. Organização de Branches

As branches devem utilizar nomes em:

* letras minúsculas;
* palavras separadas por hífen;
* prefixo indicando o objetivo da alteração.

### Exemplos

```text
feat/menu-console
feat/exercicio-1
feat/exercicio-2

fix/calculo-media
fix/validacao-entrada

hotfix/erro-inicializacao

refactor/menu-executor

test/exercicio-1
test/exercicio-2

build/configuracao-maven

perf/calculo-temperatura

docs/readme

ci/github-actions
```

---

## 9. Tipos de Branch

### `feat`

Utilizada para desenvolvimento de novas funcionalidades.

```text
feat/menu-console
```

Exemplo:

```text
feat/exercicio-4
```

---

### `fix`

Utilizada para correção de bugs durante o desenvolvimento.

```text
fix/calculo-media
```

---

### `hotfix`

Utilizada para correções urgentes em uma versão já publicada ou em produção.

```text
hotfix/erro-inicializacao
```

---

### `refactor`

Utilizada quando o código é reorganizado sem alterar seu comportamento esperado.

```text
refactor/menu-executor
```

---

### `test`

Utilizada para criação ou alteração de testes.

```text
test/exercicio-1
```

---

### `build`

Utilizada para alterações relacionadas ao processo de build, dependências ou configuração do Maven.

```text
build/dependencias
```

---

### `perf`

Utilizada para alterações cujo objetivo é melhorar desempenho.

```text
perf/calculo-temperatura
```

---

### `docs`

Utilizada para documentação.

```text
docs/readme
```

---

### `ci`

Utilizada para alterações relacionadas à integração e entrega contínuas.

```text
ci/github-actions
```

---

# 10. Conventional Commits

Os commits devem seguir o padrão:

```text
tipo: descrição
```

A descrição deve ser curta, objetiva e representar a alteração realizada.

---

## 11. Tipos de Commit

### `feat`

Nova funcionalidade.

```text
feat: adiciona menu console
```

### `fix`

Correção de bug.

```text
fix: corrige cálculo da média
```

### `hotfix`

Correção urgente.

```text
hotfix: corrige erro de inicialização do jar
```

### `refactor`

Refatoração sem alteração de comportamento.

```text
refactor: separa execução dos exercícios do menu
```

### `test`

Criação ou alteração de testes.

```text
test: adiciona testes unitários do exercício 1
```

### `build`

Alterações de build ou dependências.

```text
build: adiciona junit 6 e mockito
```

### `chore`

Tarefas de manutenção que não alteram diretamente a funcionalidade da aplicação.

```text
chore: atualiza configuração do projeto
```

### `perf`

Melhorias de desempenho.

```text
perf: otimiza cálculo das temperaturas
```

### `docs`

Alterações na documentação.

```text
docs: atualiza instruções de execução
```

### `style`

Alterações exclusivamente relacionadas à formatação.

```text
style: ajusta formatação das classes
```

### `ci`

Alterações relacionadas à integração contínua.

```text
ci: adiciona workflow de testes
```

---

# 12. Exemplos de Commits

Exemplos válidos:

```text
feat: adiciona menu principal da aplicação

feat: adiciona execução do exercício 1 pelo menu

fix: corrige cálculo da média dos números

refactor: remove métodos main dos exercícios

test: adiciona testes unitários para exercício 1

test: adiciona teste de regressão para cálculo da média

build: configura junit 6 e mockito

docs: adiciona documentação de contribuição
```

Evite commits genéricos:

```text
alterações
mudanças
teste
ajustes
update
final
final2
corrigido
```

Prefira descrever exatamente o que foi alterado.

---

# 13. Fluxo de Desenvolvimento

Antes de iniciar uma alteração:

```bash
git checkout main
git pull
```

Crie uma nova branch:

```bash
git checkout -b feat/nova-funcionalidade
```

Faça as alterações necessárias.

Verifique o projeto:

```bash
mvn clean test
```

Verifique os arquivos modificados:

```bash
git status
```

Adicione os arquivos:

```bash
git add .
```

Crie o commit:

```bash
git commit -m "feat: adiciona nova funcionalidade"
```

Envie a branch para o repositório remoto:

```bash
git push -u origin feat/nova-funcionalidade
```

---

# 14. Testes

Toda alteração que modifica comportamento da aplicação deve considerar a necessidade de testes.

Execute todos os testes com:

```bash
mvn test
```

Para executar uma classe de teste específica:

```bash
mvn -Dtest=NomeDoTeste test
```

Antes de finalizar uma alteração, todos os testes existentes devem estar passando.

---

# 15. Testes de Regressão

Quando um bug for corrigido, deve-se avaliar a criação de um teste de regressão.

Exemplo:

```text
Bug:
A média dos números estava sendo calculada utilizando divisão inteira.

Correção:
Converter a soma para double antes da divisão.

Teste de regressão:
Verificar se a média de valores como 1, 2 e 4 resulta em 2.333...
```

O objetivo é garantir que o mesmo problema não volte a ocorrer após futuras alterações.

---

# 16. Refatoração

Refatorações devem preservar o comportamento esperado da aplicação.

Exemplo:

Antes:

```text
MenuExecutor
    ├── exibe menu
    ├── lê entrada
    ├── executa exercício
    ├── calcula média
    └── imprime resultado
```

Depois:

```text
MenuExecutor
    ├── exibe menu
    ├── lê entrada
    └── executa exercício

Ex1
    └── executa lógica do exercício
```

O objetivo é manter cada classe com responsabilidades bem definidas.

---

# 17. Responsabilidade das Classes

### `MainClasse`

Responsável pelo ponto de entrada da aplicação.

```text
MainClasse
    ↓
MenuExecutor
```

### `MenuExecutor`

Responsável por:

* exibir o menu;
* receber a opção do usuário;
* direcionar a execução;
* controlar o encerramento da aplicação.

O `MenuExecutor` não deve concentrar a lógica dos exercícios.

### `Ex1`, `Ex2`, `Ex3` etc.

Responsáveis pela implementação dos respectivos exercícios.

---

# 18. Regras de Código

Durante o desenvolvimento:

* manter responsabilidades separadas;
* evitar métodos excessivamente grandes;
* evitar duplicação desnecessária;
* utilizar nomes claros para classes, métodos e variáveis;
* manter o código formatado;
* evitar comentários desnecessários;
* preferir código simples e legível;
* não adicionar complexidade sem necessidade;
* corrigir a causa do problema, e não apenas o sintoma.

---

# 19. Checklist antes do Commit

Antes de realizar um commit, verificar:

```text
[ ] O código compila?
[ ] Os testes estão passando?
[ ] A alteração possui testes quando necessário?
[ ] O código está formatado?
[ ] Não existem arquivos desnecessários?
[ ] Não existem credenciais ou informações sensíveis?
[ ] A alteração está na branch correta?
[ ] O commit possui o tipo correto?
[ ] A mensagem do commit descreve claramente a alteração?
```

Executar:

```bash
mvn clean test
```

Depois:

```bash
git status
```

E então realizar o commit.

---

# 20. Pull Request

Quando a alteração estiver concluída:

1. Execute os testes.
2. Verifique o histórico de commits.
3. Envie a branch para o GitHub.
4. Abra um Pull Request.
5. Descreva o que foi alterado.
6. Informe os testes realizados.
7. Aguarde a revisão antes do merge.

Exemplo de descrição:

```text
## Alteração

Adicionado o menu principal da aplicação.

## Implementação

- Adicionado MenuExecutor
- Adicionadas opções para os exercícios
- Adicionado controle de encerramento da aplicação

## Testes

- mvn clean test
```

---

# 21. Regra de Ouro

Antes de enviar uma alteração, pergunte:

> A alteração está funcionando, está testada e está clara para outra pessoa que precisar manter este código?

Se a resposta for sim, a alteração está pronta para ser compartilhada.

---

## 22. Objetivo do Projeto

Este projeto também possui finalidade educacional.

O processo de desenvolvimento deve permitir estudar não apenas a linguagem Java, mas também práticas utilizadas no desenvolvimento profissional de software:

```text
Código
  ↓
Debugging
  ↓
Teste
  ↓
Correção
  ↓
Refatoração
  ↓
Regressão
  ↓
Commit
  ↓
Pull Request
  ↓
Integração
```

A qualidade do projeto deve evoluir junto com o aprendizado.

---

# Fluxo de Branches

O desenvolvimento de novas alterações deve partir da branch `main`.

## 1. Criar uma branch

Atualize a `main` antes de iniciar uma nova alteração:

```bash
git checkout main
git pull
```

Crie uma branch de acordo com o tipo de alteração:

```bash
git checkout -b docs/contributing
```

Faça as alterações necessárias.

---

## 2. Commit

Adicione os arquivos alterados:

```bash
git add .
```

Crie o commit seguindo o padrão de Conventional Commits:

```bash
git commit -m "docs: adiciona guia de contribuição do projeto"
```

---

## 3. Publicar a branch

Envie a branch para o repositório remoto:

```bash
git push -u origin docs/contributing
```

---

## 4. Iniciar uma nova alteração

Depois de finalizar a alteração atual, volte para a `main`:

```bash
git checkout main
git pull
```

A partir da `main` atualizada, crie uma nova branch para a próxima alteração:

```bash
git checkout -b feat/nova-funcionalidade
```

Depois disso, o processo começa novamente:

```text
main
 ↓
git pull
 ↓
criar nova branch
 ↓
desenvolver
 ↓
git add
 ↓
git commit
 ↓
git push
 ↓
Pull Request
 ↓
merge
 ↓
main
```

### Exemplos de novas branches

```bash
git checkout -b feat/exercicio-4
```

```bash
git checkout -b fix/calculo-media
```

```bash
git checkout -b refactor/menu-executor
```

```bash
git checkout -b test/exercicio-1
```

```bash
git checkout -b docs/readme
```

```bash
git checkout -b build/dependencias
```

A regra principal é:

> **Toda nova alteração deve começar a partir da `main` atualizada e ser desenvolvida em uma branch própria.**
