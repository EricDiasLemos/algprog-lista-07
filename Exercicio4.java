import java.util.Scanner;

/**
 * Exercício 4
 * Possui uma função que recebe um argumento e retorna o caractere 'P'
 * se o argumento for positivo, e 'N' se for zero ou negativo.
 */
public class Exercicio4 {

    // Função que necessita de um argumento e retorna 'P' ou 'N'
    public static char classificar(double valor) {
        if (valor > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = entrada.nextDouble();

        char resultado = classificar(valor);
        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
