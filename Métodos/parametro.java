import java.util.Scanner;

public class parametro {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double media = 0;
        String nomeAluno = "";

        System.out.println("Digite o nome: ");
        nomeAluno = entrada.next();

        System.out.println("Digite a média: ");
        media = entrada.nextDouble();

        // chamada do procedimento
        analise(nomeAluno, media);
        //parametro real
    }

    //paramtro formal
    public static void analise(String nomeAluno, double media){
        if(media <= 3){
            System.out.println("DP");
        } else if(media < 6){
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
