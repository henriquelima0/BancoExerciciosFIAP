import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ex05 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[][] primeiroSem = {
                {10, 10, 10},
                {10, 20, 10},
                {10, 10, 10},
                {10, 10, 10},
                {10, 30, 10}
        };

        int[][] segundoSem = {
                {20, 200, 20},
                {20, 20, 20},
                {20, 20, 20},
                {20, 20, 20},
                {20, 20, 20}
        };

        int resultadoAnual[][] = new int[5][3];



        System.out.println("========= QUANTIDADE DE MATRÍCULAS DE CADA CURSO POR UNIDADE NO ANO ======");
        // A) SOMAR AS DUAS MATRIZES E CARREGAR NA MATRIZ ATUAL
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                resultadoAnual[i][j] = primeiroSem[i][j] + segundoSem[i][j];

                System.out.print("Curso: " + resultadoAnual[i][j] + "|\t");
            }
            System.out.println();
        }

        // B
        int somaColuna = 0;
        System.out.println("");
        System.out.println("====== O TOTAL DE MATRICULAS POR UNIDADE ====");
        for(int i = 0; i < 3; i++){
            somaColuna = 0;
            for(int j = 0; j < 5; j++){
                somaColuna += resultadoAnual[j][i];
            }
            System.out.println("Soma unidade " + (i+1) + ": " + somaColuna);
        }

        // C
        int somaCursoTotal = 0;
        System.out.println("");
        System.out.println("====== O TOTAL DE MATRICULAS DE CADA CURSO NO ANO ====");
        for(int i = 0; i < 5; i++){
            somaCursoTotal = 0;
            for(int j = 0; j < 3; j++){
                somaCursoTotal += resultadoAnual[i][j];
            }
            System.out.println("Soma de cursos por ano: " + somaCursoTotal);
        }

        // D
        int maiorNum = 0;
        int indUni = 0;
        System.out.println("");
        System.out.println("====== O MAIOR NÚMERO DE MATRÍCULAS POR CURSO NO ANO ====");
        for(int i = 0; i < 5; i++){
            maiorNum = 0;
            indUni = 0;
            for(int j = 0; j < 3; j++){
                if(resultadoAnual[i][j] > maiorNum){
                    maiorNum = resultadoAnual[i][j];
                    indUni = j;
                }
            }
            System.out.println("Curso: " + " " + maiorNum + " Unidade: " + (indUni+1));
        }
        ler.close();
    }
}