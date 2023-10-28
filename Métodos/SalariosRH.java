import java.util.Scanner;

public class SalariosRH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[4];
        double[] salarios = new double[4];
        int[] tempoServico = new int[4];

        // Preenchendo os vetores com informações dos funcionários
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            System.out.print("Digite o tempo de serviço (em anos) do funcionário " + (i + 1) + ": ");
            tempoServico[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
        }

        // Verificando os funcionários que têm direito ao aumento
        boolean[] temDireitoAumento = verificarAumento(salarios, tempoServico);

        // Exibindo o relatório
        exibirRelatorio(nomes, temDireitoAumento);
    }

    public static boolean[] verificarAumento(double[] salarios, int[] tempoServico) {
        boolean[] temDireitoAumento = new boolean[4];

        for (int i = 0; i < 4; i++) {
            if (salarios[i] < 700.00 || tempoServico[i] > 3) {
                temDireitoAumento[i] = true;
            }
        }

        return temDireitoAumento;
    }

    public static void exibirRelatorio(String[] nomes, boolean[] temDireitoAumento) {

        System.out.println("Relatório de Funcionários:");

        for (int i = 0; i < 4; i++) {
            String status = temDireitoAumento[i] ? "Tem direito ao aumento" : "Não tem direito ao aumento";
            System.out.println(nomes[i] + " - " + status);
        }
    }
}
