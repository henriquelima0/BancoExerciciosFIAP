import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double [][] notas = new double[3][4]; // Matriz 3x4


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe as notas do " + (i+1) + "º aluno");
                notas[i][j] = entrada.nextDouble();
                // somar as 3 notas
                notas[i][3] += notas[i][j];
            }

            // NA ULTIMA COLUNA CALCULAR MEDIA
            notas[i][3] = notas[i][3]/3;
        }
// PRINT
        System.out.println(" ");
        System.out.println("------- lista média alunos -----------");
        //Exibir matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(notas[i][j]+ "\t");
            }
            System.out.println("");
        }
    }
}
