import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercício 4
 * Uma empresa paga seus vendedores com $200 fixos por semana mais 9% das
 * vendas brutas. O programa usa uma lista de contadores para determinar
 * quantos vendedores recebem salário em cada faixa de valores.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Descrição de cada uma das 9 faixas salariais
        String[] faixas = {
            "$200 - $299",
            "$300 - $399",
            "$400 - $499",
            "$500 - $599",
            "$600 - $699",
            "$700 - $799",
            "$800 - $899",
            "$900 - $999",
            "$1000 em diante"
        };

        // Lista de contadores, todos iniciados em zero
        ArrayList<Integer> contadores = new ArrayList<>();
        for (int i = 0; i < faixas.length; i++) {
            contadores.add(0);
        }

        System.out.print("Quantos vendedores deseja informar? ");
        int quantidade = entrada.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Vendas brutas do vendedor " + (i + 1) + ": ");
            double vendas = entrada.nextDouble();

            // Cálculo do salário: $200 fixos + 9% das vendas
            double salario = 200 + (0.09 * vendas);

            // Determina o índice da faixa correspondente
            int indice;
            if (salario >= 1000) {
                indice = 8;
            } else {
                indice = (int) (salario / 100) - 2;
            }

            // Proteção contra índices inválidos
            if (indice < 0) {
                indice = 0;
            }

            // Incrementa o contador da faixa
            contadores.set(indice, contadores.get(indice) + 1);
        }

        // Exibição do resultado por faixa
        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        for (int i = 0; i < contadores.size(); i++) {
            System.out.println(faixas[i] + ": " + contadores.get(i));
        }

        entrada.close();
    }
}
