import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] distancia = new double[5][5];
        String [] cidades = new String[] {"Campinas", "Bauru", "Sorocaba", "Atibaia", "Santos"};

        double consumoVeiculo = 0, qtdCombustivel = 0;

        // Distância entre cidades
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5; j++){
                if(i == j){ // DIAGONAL
                    distancia[i][j] = 0;
                } else {
                    System.out.println("Informe a distância entre a cidade (" + cidades[i] + ") e (" + cidades[j] + ") :");
                    distancia[i][j] = entrada.nextDouble();
                }
            }
        }
        System.out.println("");
        System.out.println("Consumo de combustível");
        System.out.println("Informe o consumo do veículo: ");
        consumoVeiculo = entrada.nextDouble();

        System.out.println("");
        System.out.println("Percursos inferiores a 250KM");
        for(int i = 0; i < 5; i++) { // arrumar o if
            for (int j = 0; j < 5; j++) {
                if(distancia[i][j] <= 250){
                    System.out.println("Distância: " + distancia[i][j] + "\t KM - entre cidade (" +
                            cidades[i] + ") e ("+ cidades[j] + "): ");
                }
            }
        }
    }
}

