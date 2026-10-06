package br.botelho.loester.exercicios05102026.exercicio3;

public class Exercicio3 {

    /**
     * Gera um nome completo no estilo Star Wars a partir dos dados de uma pessoa.
     *
     * <p>
     * A fórmula utilizada é:
     *
     * <p>
     * Primeiro nome Star Wars:
     * <ul>
     *     <li>3 primeiras letras do sobrenome;</li>
     *     <li>2 primeiras letras do nome.</li>
     * </ul>
     *
     * <p>
     * Sobrenome Star Wars:
     * <ul>
     *     <li>2 primeiras letras do sobrenome de solteira da mãe;</li>
     *     <li>3 primeiras letras da cidade de nascimento.</li>
     * </ul>
     *
     * @param pessoa pessoa contendo nome, sobrenome, sobrenome da mãe
     *               e cidade de nascimento
     * @return nome completo no formato Star Wars
     */
    public static String gerarNomeStarWars(Pessoa pessoa) {

        // ---------------------------------------------------------
        // Primeiro nome Star Wars
        // ---------------------------------------------------------

        // Pega as 3 primeiras letras do sobrenome.
        String parteSobrenome = pessoa.sobrenome().substring(0, 3);

        // Pega as 2 primeiras letras do nome.
        String parteNome = pessoa.nome().substring(0, 2);

        // Junta as duas partes.
        String primeiroNomeStarWars = parteSobrenome + parteNome;


        // ---------------------------------------------------------
        // Sobrenome Star Wars
        // ---------------------------------------------------------

        // Pega as 2 primeiras letras do sobrenome de solteira da mãe.
        String parteMae = pessoa.sobrenomeMaeSolteira().substring(0, 2);

        // Pega as 3 primeiras letras da cidade de nascimento.
        String parteCidade = pessoa.cidadeNascimento().substring(0, 3);

        // Junta as duas partes.
        String sobrenomeStarWars = parteMae + parteCidade;


        // ---------------------------------------------------------
        // Nome completo
        // ---------------------------------------------------------

        // Junta o primeiro nome e o sobrenome Star Wars.
        return primeiroNomeStarWars + " " + sobrenomeStarWars;
    }
}
