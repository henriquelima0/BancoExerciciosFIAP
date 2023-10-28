import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        int[][] chamados = new int[5][3]; // Matriz 5x3 para armazenar chamados

        capturarChamados(chamados);

        System.out.println("Chamados registrados:");
        exibirChamados(chamados);
    }

    public static void capturarChamados(int[][] chamados) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Chamado " + (i + 1) + ":");
            System.out.print("Identificação do funcionário: ");
            int identificacaoFuncionario = scanner.nextInt();

            System.out.print("Código do erro (1 a 3): ");
            int codigoErro = scanner.nextInt();
            while (codigoErro < 1 || codigoErro > 3) {
                System.out.println("Código do erro inválido. Deve ser 1, 2 ou 3.");
                System.out.print("Código do erro (1 a 3): ");
                codigoErro = scanner.nextInt();
            }

            System.out.print("Critério do chamado (0 a 3): ");
            int criterioChamado = scanner.nextInt();
            while (criterioChamado < 0 || criterioChamado > 3) {
                System.out.println("Critério do chamado inválido. Deve ser 0, 1, 2 ou 3.");
                System.out.print("Critério do chamado (0 a 3): ");
                criterioChamado = scanner.nextInt();
            }

            chamados[i][0] = identificacaoFuncionario;
            chamados[i][1] = codigoErro;
            chamados[i][2] = criterioChamado;
        }
    }

    public static void exibirChamados(int[][] chamados) {
        System.out.println("Identificação do Funcionário | Código do Erro | Critério do Chamado");

        for (int i = 0; i < 5; i++) {
            System.out.println(chamados[i][0] + " | " + chamados[i][1] + " | " + chamados[i][2]);
        }
    }
}

