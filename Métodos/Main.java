import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
operacao();
    }

        public static void operacao(){
        int num = 0;
            System.out.println("Digite um número");
            num = entrada.nextInt();

            if(num % 2 == 0){
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
            entrada.close();
    }
}