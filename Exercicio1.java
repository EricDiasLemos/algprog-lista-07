import java.util.Scanner;

/**
 * Exercício 1
 * Imprime, para um n informado pelo usuário:
 *   1
 *   2 2
 *   3 3 3
 *   ...
 *   n n n ... n
 * Cada linha i contém o número i repetido i vezes.
 */
public class Exercicio1 {

    // Função que recebe um valor n inteiro e imprime até a n-ésima linha
    public static void imprimirTriangulo(int n) {
        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(linha + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor de n: ");
        int n = entrada.nextInt();

        imprimirTriangulo(n);

        entrada.close();
    }
}
