import java.util.Scanner;

/**
 * Exercício 2
 * Imprime, para um n informado pelo usuário:
 *   1
 *   1 2
 *   1 2 3
 *   ...
 *   1 2 3 ... n
 * Cada linha i contém a sequência de 1 até i.
 */
public class Exercicio2 {

    // Função que recebe um valor n inteiro e imprime até a n-ésima linha
    public static void imprimirSequencia(int n) {
        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor de n: ");
        int n = entrada.nextInt();

        imprimirSequencia(n);

        entrada.close();
    }
}
