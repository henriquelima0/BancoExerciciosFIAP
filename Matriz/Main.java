import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criar matriz
        int [][] numeros = new int[3][3]; // Matriz 3x3


        // Carrega Matriz
        // O primeiro FOR está fixando a linha
        for( int linha = 0; linha < 3; linha ++ ){
            // O segundo FOR está movimentando a coluna
            for (int coluna = 0; coluna < 3; coluna ++){
                System.out.println("Informe o elemento da matriz - linha: " + linha + " - coluna: " + coluna);
                numeros[linha][coluna] = entrada.nextInt();
            }
        }

        //Exibir matriz
        for(int i = 0; i < 3; i++){
            for(int c = 0; c < 3; c++){
                System.out.print(numeros[i][c]+ "\t");
            }
            System.out.println("");
        }
    }
}