import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int cliente[][] = new int [4][5]; // Criação da matriz cliente 4x5
        int soma = 0;

        for(int i = 0; i < 4; i++){
            System.out.print("Digite o código: ");
            cliente[i][0] = ler.nextInt();

            System.out.print("Digite a quantidade de milhagem: ");
            cliente[i][1] = ler.nextInt();

            System.out.print("Digite a categoria (1- Diamante, 2- Ouro e 3- Prata) ");
            cliente[i][2] = ler.nextInt();

            while((cliente[i][2] != 1) && (cliente[i][2] != 2) &&(cliente[i][2] != 3)){
                System.out.println("Digite a categoria novamente 1/2/3/4");
                cliente[i][2] = ler.nextInt();
            }

            System.out.println("");

            if(cliente[i][2] == 1){ // Se Categoria for igual a DIAMANTE
                cliente[i][3] = 10000;
                cliente[i][4] = cliente[i][1] + cliente[i][3];
            }
            else if (cliente[i][2] == 2) {
                cliente[i][3] = 5000;
                cliente[i][4] = cliente[i][1] + cliente[i][3];
            }
            else {
                cliente[i][3] = 0;
                cliente[i][4] = cliente[i][1];
            }
        }

        System.out.println("");
        System.out.println("----- CLIENTES -------");
        for ( int i = 0; i < 4; i++) {
            System.out.println("Código: " + cliente[i][0] + " | Quantidade: " + cliente[i][1] + "|  Categoria " + cliente[i][2] + " | Bônus: " + cliente[i][3] + "  | Total: " + cliente[i][4]);
        }
    }
}