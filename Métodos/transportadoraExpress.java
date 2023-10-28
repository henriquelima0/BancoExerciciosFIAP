import java.util.Scanner;

public class transportadoraExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do caminhão: ");
        int codigoCaminhao = scanner.nextInt();

        System.out.print("Digite a carga do caminhão em toneladas: ");
        double cargaEmToneladas = scanner.nextDouble();

        double precoCarga = calcularPrecoCarga(cargaEmToneladas, codigoCaminhao);
        double imposto = calcularImposto(precoCarga, codigoCaminhao);
        double valorTotal = precoCarga + imposto;

        System.out.println("Preço da carga: R$" + precoCarga);
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Valor total transportado pelo caminhão: R$" + valorTotal);
    }

    public static double calcularPrecoCarga(double cargaEmToneladas, int codigoCaminhao) {
        double precoPorQuilo = 0;

        if (cargaEmToneladas >= 1 && cargaEmToneladas <= 10) {
            precoPorQuilo = 120.00;
        } else if (cargaEmToneladas >= 11 && cargaEmToneladas <= 20) {
            precoPorQuilo = 200.00;
        } else if (cargaEmToneladas >= 21 && cargaEmToneladas <= 30) {
            precoPorQuilo = 280.00;
        }

        return cargaEmToneladas * 1000 * precoPorQuilo; // Conversão de toneladas para quilos
    }

    public static double calcularImposto(double precoCarga, int codigoCaminhao) {
        double imposto = 0;

        switch (codigoCaminhao) {
            case 1:
                imposto = 0.25 * precoCarga; // 25% de imposto
                break;
            case 2:
                imposto = 0.20 * precoCarga; // 20% de imposto
                break;
            case 3:
                imposto = 0.15 * precoCarga; // 15% de imposto
                break;
            case 4:
                // Caminhão isento de imposto
                break;
            default:
                System.out.println("Código do caminhão inválido");
        }

        return imposto;
    }
}
