import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int j=0;

        int vetor1[] = new int[] { 3 , 5 , 4 , 2, 2 , 5 , 3 , 2 , 5 , 9 };

        int vetor2[] = new int[] { 7 , 15 , 20 , 0 , 18 , 4 , 55 , 23 , 8 , 6};

        int resultante [] = new int [20];

        for(int i = 0; i<10; i++){

            // INDICE J INCREMENTA A CADA TAREFA ,
            resultante[j] = vetor1[i];
            System.out.println("Vetor resultante - posição" + (j+1) +"- valor: " + resultante[j]);
            j++;

            resultante[j] = vetor2[i];
            System.out.println("Vetor resultante - posição" + (j+1) +"- valor: " + resultante[j]);
            j++;
        }
    }
}