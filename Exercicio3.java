import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercício 3
 * Lê um número indeterminado de notas (encerrando com -1, que não é
 * armazenado) e, em seguida, apresenta diversas estatísticas sobre elas.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        // Leitura das notas até que -1 seja informado
        System.out.println("Digite as notas (-1 para encerrar):");
        double valor;
        do {
            System.out.print("Nota: ");
            valor = entrada.nextDouble();
            if (valor != -1) {
                notas.add(valor);
            }
        } while (valor != -1);

        // Quantidade de valores lidos
        System.out.println("\nQuantidade de valores lidos: " + notas.size());

        // Se nenhuma nota foi informada, encerra o programa
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi informada.");
            System.out.println("\nPrograma encerrado.");
            entrada.close();
            return;
        }

        // Valores na ordem informada (um ao lado do outro)
        System.out.print("Valores na ordem informada: ");
        for (double nota : notas) {
            System.out.print(nota + "  ");
        }
        System.out.println();

        // Valores na ordem inversa (um abaixo do outro)
        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Soma dos valores
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.printf("Soma dos valores: %.2f%n", soma);

        // Média dos valores
        double media = soma / notas.size();
        System.out.printf("Média dos valores: %.2f%n", media);

        // Quantidade de valores acima da média
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);

        // Quantidade de valores abaixo de sete
        int abaixoSete = 0;
        for (double nota : notas) {
            if (nota < 7) {
                abaixoSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);

        System.out.println("\nPrograma encerrado com sucesso!");
        entrada.close();
    }
}
