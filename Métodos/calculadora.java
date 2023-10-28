import java.util.Scanner;

public class calculadora {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        while(opcao != 5) {
            System.out.println("1 - Adição ");
            System.out.println("2 - Subtração ");
            System.out.println("3 - Multiplicação ");
            System.out.println("4 - Divisão ");
            System.out.println("5 - Encerrar ");

            System.out.println("");
            System.out.println("Digite uma opção");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: adicao();
                break;

                case 2: subtracao();
                break;

                case 3: multiplicacao();
                break;

                case 4: divisao();
                break;

                case 5: encerrar();
                break;
                default:
                    System.out.print("Opção inválida - Digite novamente: ");
            }
        }
    }

    public static void adicao(){
        int n1 = 0, n2 = 0, r = 0;

        System.out.println("Rotina Adição");

        System.out.println("Digite o 1º número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o 2º número: ");
        n2 = entrada.nextInt();

        System.out.println("");
        r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + r);
        System.out.println("");
    }

    public static void subtracao(){
        int n1 = 0, n2 = 0, r = 0;

        System.out.println("Rotina Subtração");

        System.out.println("Digite o 1º número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o 2º número: ");
        n2 = entrada.nextInt();

        System.out.println("");
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        System.out.println("");
    }

    public static void multiplicacao(){
        int n1 = 0, n2 = 0, r = 0;

        System.out.println("Rotina Multiplicação");

        System.out.println("Digite o 1º número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o 2º número: ");
        n2 = entrada.nextInt();

        System.out.println("");
        r = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        System.out.println("");
    }

    public static void divisao(){
        int n1 = 0, n2 = 0, r = 0;

        System.out.println("Rotina Divisão");

        System.out.println("Digite o 1º número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o 2º número: ");
        n2 = entrada.nextInt();

        System.out.println("");
        r = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + r);
        System.out.println("");
    }

    public static void encerrar(){
        System.exit(0);
    }
}
