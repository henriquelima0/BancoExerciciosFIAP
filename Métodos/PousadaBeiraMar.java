import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PousadaBeiraMar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do hóspede: ");
        String nomeHospede = scanner.nextLine();

        System.out.println("Tipos de acomodação:");
        System.out.println("1 - Standard");
        System.out.println("2 - Luxo");
        System.out.println("3 - Super Luxo");
        System.out.print("Digite o tipo de acomodação (1/2/3): ");
        int tipoAcomodacao = scanner.nextInt();

        System.out.print("Digite a quantidade de diárias: ");
        int diarias = scanner.nextInt();

        double totalEstadia = calcularEstadia(tipoAcomodacao, diarias);

        if (totalEstadia > 0) {
            System.out.print("Digite a forma de pagamento (V para à vista, P para a prazo): ");
            String formaPagamento = scanner.next().toUpperCase();

            double totalFinal = calcularValorFinal(totalEstadia, formaPagamento);

            if (totalFinal > 0) {
                System.out.println("Nome do hóspede: " + nomeHospede);
                System.out.println("Valor da estadia: R$ " + totalEstadia);
                System.out.println("Forma de pagamento: " + (formaPagamento.equals("V") ? "À vista" : "A prazo"));
                System.out.println("Valor final: R$ " + totalFinal);
            }
        }
    }

    public static double calcularEstadia(int tipoAcomodacao, int diarias) {
        double valorDiaria = 0;

        if (tipoAcomodacao == 1) {
            valorDiaria = 380.00;
        } else if (tipoAcomodacao == 2) {
            valorDiaria = 450.00;
        } else if (tipoAcomodacao == 3) {
            valorDiaria = 560.00;
        } else {
            System.out.println("Tipo de acomodação inválido");
            return 0;
        }

        return valorDiaria * diarias;
    }

    public static double calcularValorFinal(double totalEstadia, String formaPagamento) {
        if (formaPagamento.equals("V")) {
            double desconto = 0.10; // 10% de desconto
            return totalEstadia * (1 - desconto);
        } else if (formaPagamento.equals("P")) {
            return totalEstadia;
        } else {
            System.out.println("Forma de pagamento inválida");
            return 0;
        }
    }
}