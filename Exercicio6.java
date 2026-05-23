import java.util.Scanner;

/**
 * Exercício 6
 * Converte um horário da notação de 24 horas para a notação de 12 horas.
 * Exemplo: 14:25 é convertido em 2:25 P.M.
 * Possui uma função para fazer a conversão e outra para a saída.
 * O indicador A.M./P.M. é registrado como 'A' (A.M.) ou 'P' (P.M.).
 */
public class Exercicio6 {

    /*
     * Função de conversão.
     * Recebe a hora no formato 24h e retorna a hora no formato 12h.
     * O parâmetro 'meridiano' (vetor de uma posição) registra se é A.M. ou P.M.
     */
    public static int converter(int hora24, char[] meridiano) {
        if (hora24 == 0) {
            meridiano[0] = 'A';
            return 12;
        } else if (hora24 < 12) {
            meridiano[0] = 'A';
            return hora24;
        } else if (hora24 == 12) {
            meridiano[0] = 'P';
            return 12;
        } else {
            meridiano[0] = 'P';
            return hora24 - 12;
        }
    }

    // Função de saída: exibe o horário já convertido para o formato 12h
    public static void exibir(int hora12, int minuto, char meridiano) {
        String sufixo;
        if (meridiano == 'A') {
            sufixo = "A.M.";
        } else {
            sufixo = "P.M.";
        }
        System.out.printf("Horário no formato 12h: %d:%02d %s%n", hora12, minuto, sufixo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Informe a hora (0 a 23): ");
            int hora = entrada.nextInt();

            System.out.print("Informe os minutos (0 a 59): ");
            int minuto = entrada.nextInt();

            char[] meridiano = new char[1];
            int hora12 = converter(hora, meridiano);
            exibir(hora12, minuto, meridiano[0]);

            System.out.print("Deseja converter outro horário? (sim/não): ");
            continuar = entrada.next().trim().toLowerCase();

        } while (continuar.equals("sim") || continuar.equals("s"));

        System.out.println("Programa encerrado.");

        entrada.close();
    }
}
