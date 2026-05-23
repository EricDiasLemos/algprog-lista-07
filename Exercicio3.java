import java.util.Scanner;

/**
 * Exercício 3
 * Possui uma função que recebe três argumentos e retorna a soma deles.
 */
public class Exercicio3 {

    // Função que necessita de três argumentos e fornece a soma deles
    public static double somar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double v1 = entrada.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double v2 = entrada.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double v3 = entrada.nextDouble();

        double resultado = somar(v1, v2, v3);
        System.out.printf("A soma dos três valores é: %.2f%n", resultado);

        entrada.close();
    }
}
