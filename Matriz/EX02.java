import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[4][4]; // Matriz 4x4
        int somaColunas = 0;
        int somaLinhas = 0;
        int somaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe o elemento da matriz - linha: " + i + " - coluna: " + j);
                numeros[i][j] = entrada.nextInt();
                somaTotal += numeros[i][j]; // somando todos os valores
            }
        }

        //SOMA MATRIZ LINHA
        for (int i = 0; i < 4; i++) {
            somaLinhas = 0;
            somaColunas = 0;
            for (int j = 0; j < 4; j++) { // percorrendo a matriz
                somaLinhas += numeros[i][j];
                somaColunas += numeros[j][i]; // Na soma de colunas foi feita apenas a alteração, pois é 4x4 se fosse diferente (4x2) teria que ser feito mais for
            }
            System.out.println("Soma linha " + i + ": " + somaLinhas);
            System.out.println("Soma coluna " + i + ": " + somaColunas);
            System.out.println("");
        }
        System.out.println("Soma Total: " + somaTotal);
    }
}

