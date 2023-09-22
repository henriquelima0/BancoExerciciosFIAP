    import java.util.Scanner;

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
    // then press Enter. You can now see whitespace characters in your code.
    public class Main {
        static Scanner entrada = new Scanner(System.in);
        static String nome;

        public static void main(String[] args) {
            dados();
        }

        public static void dados() {

            int acomodacao = 0;
            int diarias = 0;

            char pgmto = 0;

            double valorTotal = 0;

            System.out.println("Nome: ");
            nome = entrada.next();

            while(acomodacao != 1 && acomodacao != 2 && acomodacao != 3) {
                System.out.println("");
                System.out.println("Escolha a acomodação");
                System.out.println("1 - Standart");
                System.out.println("2 - Luxo ");
                System.out.println("3 - Super Luxo");
                acomodacao = entrada.nextInt();
            }
            System.out.println("Informe a quantidade de diárias");
            diarias = entrada.nextInt();

            valorTotal = calc(acomodacao, diarias); // Atualiza o valorTotal com o resultado de calc

            System.out.println("Nome" + nome);
            System.out.println("Valor final" + valorTotal);
        }

        public static double calc(int acomodacao, int diarias){
            double total = 0;
            if(acomodacao == 1){
                total = 300 * diarias;
            } else if (acomodacao == 2) {
                total = 450 * diarias;
            } else {
                total = 560 * diarias;
            }
            double valorPgmto = formaPgmto(total);
            return total + valorPgmto;
        }

        public static double formaPgmto(double total){
            char pgmto = 0;
            double valorTotal = 0;

            while(pgmto != 'V' && pgmto != 'P'){
                System.out.println("Qual a forma de pagamento? Á vista(V) e Prazo(P)");
                pgmto = entrada.next().toUpperCase().charAt(0);
            }
            if(pgmto == 'V'){
                valorTotal = total - (total * 0.10);
            } else {
                valorTotal = total;
            }
            return valorTotal;
        }


    }