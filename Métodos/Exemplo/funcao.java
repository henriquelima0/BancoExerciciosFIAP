import java.util.Scanner;

public class funcao {

    //variavel global
    static String nome;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double salario = 0, novoSalario = 0;
        int tempo = 0;
        double reajuste = 0;

        System.out.println("Digite o nome");
        nome = entrada.next();

        System.out.println("Digite o tempo de empresa: ");
        tempo = entrada.nextInt();

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        // chama função
        reajuste = verifica(tempo,salario);

        // chama função calculo
        novoSalario = calculo(reajuste, salario);
        System.out.println("Salário: "+ salario + "Salário Reajustado: " + novoSalario);
    }


    // chamada função
    public static double verifica(int tempo, double salario){
        double reajuste = 0;

        if(salario < 5 && tempo > 10){
            reajuste = 0.10;
        }
        return reajuste;
    }

    public static double calculo(double reajuste, double salario){
        double novoSalario = 0;
        novoSalario = salario+(salario * reajuste);
        return novoSalario;
    }

}
