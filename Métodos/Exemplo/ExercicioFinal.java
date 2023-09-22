import java.util.Scanner;

public class ExFinal {

    static Scanner entrada = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {
        dados();
    }

    // Procedimento
    public static void dados(){
        double nota1 = 0, nota2= 0;

        System.out.println("Digite o nome: ");
        nome = entrada.next();

        System.out.println("Nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = entrada.nextDouble();

        // chamada calculo média
        double media = media(nota1, nota2);
        System.out.println("A média do aluno "+ nome + " é: "+ media);
    }

    // Função
    public static double media(double nota1, double nota2){
        double media = 0;
        media = (nota1+nota2)/2;
        //chamada análise
        analise(media);
        return media;
    }

    //Procedimento
    public static void analise(double media){
        System.out.println("Procedimento análise: ");
        if(media >= 6){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }



}
