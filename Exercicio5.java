import java.util.Scanner;

/**
 * Exercício 5
 * Possui a função somaImposto, com dois parâmetros:
 *   - taxaImposto: imposto sobre vendas, expresso em porcentagem;
 *   - custo: custo do item antes do imposto.
 * A função "altera" o valor de custo para incluir o imposto sobre vendas.
 */
public class Exercicio5 {

    /*
     * Em Java os tipos primitivos são passados por valor, portanto não é
     * possível alterar diretamente o argumento original. Para reproduzir o
     * comportamento pedido no exercício, o custo é passado dentro de um vetor
     * de uma posição (objetos são passados por referência), permitindo que a
     * função realmente altere o valor armazenado.
     */
    public static void somaImposto(double taxaImposto, double[] custo) {
        custo[0] = custo[0] + (custo[0] * taxaImposto / 100);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a taxa de imposto (em %): ");
        double taxaImposto = entrada.nextDouble();

        System.out.print("Informe o custo do item (antes do imposto): ");
        double[] custo = new double[1];
        custo[0] = entrada.nextDouble();

        somaImposto(taxaImposto, custo);

        System.out.printf("Custo do item com o imposto incluído: %.2f%n", custo[0]);

        entrada.close();
    }
}
