import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercício 1
 * Recebe a temperatura média de cada mês do ano, armazena em uma lista,
 * calcula a média anual e mostra as temperaturas acima dessa média,
 * indicando o mês por extenso.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Leitura das 12 temperaturas
        for (int i = 0; i < 12; i++) {
            System.out.print("Informe a temperatura média de " + meses[i] + ": ");
            double temperatura = entrada.nextDouble();
            temperaturas.add(temperatura);
        }

        // Cálculo da soma e da média anual
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        double mediaAnual = soma / temperaturas.size();

        // Exibição dos resultados
        System.out.printf("%nMédia anual das temperaturas: %.2f%n", mediaAnual);
        System.out.println("Temperaturas acima da média anual:");

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.printf("%s: %.2f%n", meses[i], temperaturas.get(i));
            }
        }

        entrada.close();
    }
}
