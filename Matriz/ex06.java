import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        DecimalFormat moeda = new DecimalFormat("$,##0.00");
        // Vetor
        String produtos[] = new String [] { "Camisa", "Blusa", "Calça", "Vestido", "Meia"};
        double custo[] = new double [] {10, 15, 20, 10, 5};

        //Criação matriz 5x4
        double precos[][] = new double[5][4];
        double impostos[][] = new double[5][4];

        double precoFinal = 0;

        //Carregar matriz preços
        for(int linha = 0; linha < 5; linha++){
            System.out.println("Informe o preço do produto: " + produtos[linha]);
            for(int coluna = 0; coluna < 4; coluna++){
                System.out.print("Preço do produto na loja " + (coluna+1) + ":");
                precos[linha][coluna] = ler.nextDouble();


                // VERIFICAR IMPOSTO SELEÇÃO ENCADEADA
                if(precos[linha][coluna] <= 50){
                    impostos[linha][coluna] = precos[linha][coluna] * 0.05;
                }
                else if(precos[linha][coluna] > 50 && precos[linha][coluna] <= 100){
                    impostos[linha][coluna] = precos[linha][coluna] * 0.10;
                }
                else {
                    impostos[linha][coluna] = precos[linha][coluna] * 0.20;
                }
            }
        }
        // relatório

        System.out.println("");
        System.out.println("========= Relatório Final ============");
        // produtos
        for(int linha = 0; linha < 5; linha++){
            // produtos
            System.out.println("Nome do produto: " + produtos[linha] + " Custo transporte: " + custo[linha]);
            for(int coluna = 0; coluna < 4; coluna++){
                //lojas
                System.out.println("----- Loja: " + (coluna+1));
                System.out.println("----- Imposto:" + moeda.format(impostos[linha][coluna]));
                System.out.println("----- Preço: " + moeda.format(precos[linha][coluna]));

                precoFinal = precos[linha][coluna] + impostos[linha][coluna] + custo[linha];
                System.out.println("----- Preço final: " + moeda.format(precoFinal));
                System.out.println();
            }
        }
    }
}
