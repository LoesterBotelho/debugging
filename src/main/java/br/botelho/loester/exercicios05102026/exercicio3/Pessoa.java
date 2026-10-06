package br.botelho.loester.exercicios05102026.exercicio3;

public record Pessoa(
String nome,
String sobrenome,
String sobrenomeMaeSolteira,
String cidadeNascimento
) {


public Pessoa {
    validarParametro(nome, "nome");
    validarParametro(sobrenome, "sobrenome");
    validarParametro(sobrenomeMaeSolteira, "sobrenomeMaeSolteira");
    validarParametro(cidadeNascimento, "cidadeNascimento");
}

public String gerarNomeStarWars() {

    validarTamanho(nome, 2,
            "O nome deve possuir pelo menos 2 caracteres.");

    validarTamanho(sobrenome, 3,
            "O sobrenome deve possuir pelo menos 3 caracteres.");

    validarTamanho(sobrenomeMaeSolteira, 2,
            "O sobrenome materno deve possuir pelo menos 2 caracteres.");

    validarTamanho(cidadeNascimento, 3,
            "A cidade de nascimento deve possuir pelo menos 3 caracteres.");

    String primeiraParte =
            sobrenome.substring(0, 3)
                    + nome.substring(0, 2);

    String segundaParte =
            sobrenomeMaeSolteira.substring(0, 2)
                    + cidadeNascimento.substring(0, 3);

    return primeiraParte + " " + segundaParte;
}

private static void validarParametro(
        String valor,
        String nomeParametro) {

    if (valor == null || valor.isBlank()) {
        throw new IllegalArgumentException(
                "O parâmetro '" + nomeParametro
                        + "' não pode ser null ou vazio."
        );
    }
}

private static void validarTamanho(
        String valor,
        int tamanhoMinimo,
        String mensagem) {

    if (valor.length() < tamanhoMinimo) {
        throw new IllegalArgumentException(mensagem);
    }
}

}
