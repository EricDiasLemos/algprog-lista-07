import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercício 2
 * Faz 5 perguntas a uma pessoa sobre um crime e, ao final,
 * emite uma classificação sobre sua participação:
 *   2 respostas positivas  -> Suspeita
 *   3 ou 4 positivas       -> Cúmplice
 *   5 positivas            -> Assassino
 *   caso contrário         -> Inocente
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lista com as perguntas
        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        // Lista que guarda as respostas informadas
        ArrayList<String> respostas = new ArrayList<>();
        int positivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (sim/não): ");
            String resposta = entrada.nextLine().trim().toLowerCase();
            respostas.add(resposta);

            if (resposta.equals("sim") || resposta.equals("s")) {
                positivas++;
            }
        }

        // Classificação da pessoa
        String classificacao;
        if (positivas == 5) {
            classificacao = "Assassino";
        } else if (positivas >= 3) {
            classificacao = "Cúmplice";
        } else if (positivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("\nRespostas positivas: " + positivas);
        System.out.println("Classificação: " + classificacao);

        entrada.close();
    }
}
