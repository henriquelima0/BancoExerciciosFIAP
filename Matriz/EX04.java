import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num[][] = new int [5][2];
        double val[][] = new double [5][2];
        double totalGeral = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o código");
            num[i][0] = ler.nextInt(); // COLOCOU A COLUNA 0 POIS É ONDE GUARDA O CÓDIGO

            System.out.println("Digite o preço");
            val[i][0] = ler.nextDouble();

            System.out.println("Digite a quantidade");
            num[i][1] = ler.nextInt();

            val[i][1] = val[i][0]*num[i][1];
            totalGeral+=val[i][1];
        }

        System.out.println("");
        System.out.println("----- LISTA PRODUTOS -------");
        for ( int i = 0; i < 5; i++) {
            System.out.println("Código: " + num[i][0] + " | R$" + val[i][0] + " cada" + " |  Quantidade " + num[i][1] + " | Total R$" + val[i][1]);
        }
        System.out.println("Total R$" + totalGeral);
    }
}
