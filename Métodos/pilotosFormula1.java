import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static String[] nomePiloto =  {"Daniel Ricciador", "Kimi Raikkonen", "Lewis Hamilton", "Nico Rosberg", "Sebastian Vettel"};
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
    String[] paises = {"Bélgica", "Itália", "Cingapura", "Malásia", "Japão"};
    relatorioGerencial(paises);
    }
    public static void relatorioGerencial(String[] paises) {
        int[][] matrizPontuacao = entradaDados(paises);
        exibirMatriz(matrizPontuacao);

        int[] totalPontosPorPiloto = somaPontos(matrizPontuacao);
        exibirTotalPontos(totalPontosPorPiloto);

        String[] pilotoVencedorPorGP = identificaVencedorPorGP(matrizPontuacao);
        exibirVencedoresPorGP(pilotoVencedorPorGP);

        exibirMelhorPiloto(totalPontosPorPiloto);
    }

    public static int[][] entradaDados(String[] paises) {
        int[][] dados = new int[5][5];

        System.out.println("------ CAPTAÇÃO DE PONTUAÇÃO ----------");

        for (int i = 0; i < nomePiloto.length; i++) {
            System.out.println("Piloto " + nomePiloto[i]);
            for (int j = 0; j < paises.length; j++) {
                System.out.println("- Digite a pontuação GP " + paises[j]);
                dados[i][j] = entrada.nextInt();
            }
        }
        return dados;
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("------ MATRIZ DE PONTUAÇÃO ----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-8d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] somaPontos(int[][] matriz) {
        int[] totalPontosPorPiloto = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                totalPontosPorPiloto[i] += matriz[i][j];
            }
        }
        return totalPontosPorPiloto;
    }

    public static void exibirTotalPontos(int[] totalPontos) {
        System.out.println("------ TOTAL DE PONTOS POR PILOTO ----------");

        for (int i = 0; i < 5; i++) {
            System.out.println(nomePiloto[i] + ": " + totalPontos[i] + " pontos");
        }
    }

    public static String[] identificaVencedorPorGP(int[][] matriz) {
        String[] pilotoVencedorPorGP = new String[5];

        for (int j = 0; j < 5; j++) {
            int indiceVencedor = 0;
            for (int i = 1; i < 5; i++) {
                if (matriz[i][j] > matriz[indiceVencedor][j]) {
                    indiceVencedor = i;
                }
            }
            pilotoVencedorPorGP[j] = nomePiloto[indiceVencedor];
        }
        return pilotoVencedorPorGP;
    }

    public static void exibirVencedoresPorGP(String[] vencedoresPorGP) {
        System.out.println("------ PILOTO VENCEDOR POR GP ----------");

        for (int i = 0; i < 5; i++) {
            System.out.println("GP " + (i + 1) + ": " + vencedoresPorGP[i]);
        }
    }

    public static void exibirMelhorPiloto(int[] totalPontos) {
        int indiceMelhorPiloto = 0;

        for (int i = 1; i < 5; i++) {
            if (totalPontos[i] > totalPontos[indiceMelhorPiloto]) {
                indiceMelhorPiloto = i;
            }
        }

        System.out.println("------ MELHOR PILOTO ----------");
        System.out.println("Melhor Piloto: " + nomePiloto[indiceMelhorPiloto]);
        System.out.println("Pontuação: " + totalPontos[indiceMelhorPiloto] + " pontos");
    }
}