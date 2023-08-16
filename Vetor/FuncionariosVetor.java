import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] salarios = new double[5];
        double novoSalario = 0;
        int[] tempoServico = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do funcionário: ");
            nomes[i] = entrada.nextLine();

            System.out.print("Informe o salário do funcionário: ");
            salarios[i] = entrada.nextDouble();

            System.out.print("Informe o tempo de serviço do funcionário: ");
            tempoServico[i] = entrada.nextInt();

            entrada.nextLine();
        }

        System.out.println("----------------FUNCIONÁRIOS QUE NÃO TERÃO AUMENTO--------------------");
        for (int i = 0; i < 5; i++) {
            if (tempoServico[i] <= 5 && salarios[i] >= 780) {
                System.out.println(nomes[i]);
            }
        }

        System.out.println("-------------FUNCIONÁRIOS QUE TERÃO AUMENTO--------------------------");
        for(int i=0; i<5; i++){
            if(tempoServico[i] > 5 && salarios[i] < 780){
                novoSalario = salarios[i] * 1.35;
            } else {
                if(tempoServico[i] > 5){
                    novoSalario = salarios[i] + (salarios[i] * 0.25);
                } else {
                    novoSalario = salarios[i] + (salarios[i] * 0.15);
                }
                System.out.println("Nome: " + nomes[i] + "\t - novo salário " + novoSalario);
            }

        }
        entrada.close();
    }
}