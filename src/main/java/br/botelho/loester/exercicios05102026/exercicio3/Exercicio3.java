
package br.botelho.loester.exercicios05102026.exercicio3;

import java.util.Objects;

public class Exercicio3 {

    public static String gerarNomeStarWars(Pessoa pessoa) {

        if (ehValido(pessoa)) {

            String parteSobrenome = pessoa.sobrenome().substring(0, 3);

            String parteNome = pessoa.nome().substring(0, 2);

            String primeiroNomeStarWars = parteSobrenome + parteNome;

            String parteMae = pessoa.sobrenomeMaeSolteira().substring(0, 2);

            String parteCidade = pessoa.cidadeNascimento().substring(0, 3);

            String sobrenomeStarWars = parteMae + parteCidade;

            return primeiroNomeStarWars + " " + sobrenomeStarWars;
        }

        throw new IllegalArgumentException("Pessoa inválida.");
    }

    private static boolean ehValido(Pessoa pessoa) {

        Objects.requireNonNull(pessoa, "Pessoa não pode ser null.");

        validarParametro(pessoa.nome(), "nome");
        validarParametro(pessoa.sobrenome(), "sobrenome");
        validarParametro(pessoa.sobrenomeMaeSolteira(), "sobrenomeMaeSolteira");
        validarParametro(pessoa.cidadeNascimento(), "cidadeNascimento");

        if (pessoa.sobrenome().length() < 3) {
            throw new IllegalArgumentException(
                    "O sobrenome deve possuir pelo menos 3 caracteres."
            );
        }

        if (pessoa.nome().length() < 2) {
            throw new IllegalArgumentException(
                    "O nome deve possuir pelo menos 2 caracteres."
            );
        }

        if (pessoa.sobrenomeMaeSolteira().length() < 2) {
            throw new IllegalArgumentException(
                    "O sobrenome materno deve possuir pelo menos 2 caracteres."
            );
        }

        if (pessoa.cidadeNascimento().length() < 3) {
            throw new IllegalArgumentException(
                    "A cidade de nascimento deve possuir pelo menos 3 caracteres."
            );
        }

        return true;
    }

    private static void validarParametro(String valor, String nomeParametro) {

        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(
                    "O parâmetro '" + nomeParametro + "' não pode ser null ou vazio."
            );
        }
    }
}