import java.util.Scanner;

public class calculadoraMetodo {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        int n1 = 0, n2 = 0;

        while(opcao != 5) {
            System.out.println("1 - Adição ");
            System.out.println("2 - Subtração ");
            System.out.println("3 - Multiplicação ");
            System.out.println("4 - Divisão ");
            System.out.println("5 - Encerrar ");

            System.out.println("");
            System.out.println("Digite uma opção");
            opcao = entrada.nextInt();

            if(opcao == 5){
                System.exit(0);
            }

            System.out.println("Digite o 1º número: ");
            n1 = entrada.nextInt();

            System.out.println("Digite o 2º número: ");
            n2 = entrada.nextInt();

            System.out.println("");

            switch (opcao) {
                case 1: adicao(n1, n1);
                    break;

                case 2: subtracao(n1, n1);
                    break;

                case 3: multiplicacao(n1, n1);
                    break;

                case 4: divisao(n1, n2);
                    break;

                case 5: System.exit(0);
                    break;
                default:
                    System.out.print("Opção inválida - Digite novamente: ");
            }
        }
    }

    public static void adicao(int n1, int n2){
        int r = 0;
        System.out.println("Rotina Adicação");
        r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + r);
        System.out.println("");
    }

    public static void subtracao(int n1, int n2){
        int r = 0;
        System.out.println("Sotina Substração");
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        System.out.println("");
    }

    public static void multiplicacao(int n1, int n2){
        int r = 0;
        System.out.println("Rotina Multiplicação");
        r = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        System.out.println("");
    }

    public static void divisao(int n1, int n2){
        int r = 0;
        System.out.println("Rotina Divisão");
        r = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + r);
        System.out.println("");
    }
}
