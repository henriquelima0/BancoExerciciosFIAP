import java.text.DecimalFormat;
import java.util.Scanner;

public class correcaoCheck {
	public static void main(String[] args) {	
		// Declarando Scanner e DecimalFormat 
		Scanner e = new Scanner(System.in);
		DecimalFormat fMoeda = new DecimalFormat("R$ ##0.00");
		
		// Vari�veis 
		// Carregando vari�vel RESP antes de inciar o While
		char sexo, escolar;
		String resp = "sim";
		int contador = 0, servico = 0, somaIdade = 0, contHomem = 0;
		int idade = 0;
		int contSim = 0, contNao = 0;
		int contM = 0, contS = 0, contP = 0, contT = 0, contD = 0;

		
		// Estrutura de repeti��o ENQUANTO WHILE 
		// EqualsIgnore para comparar STRINGS
		while(resp.equalsIgnoreCase("sim")){
			contador++; // CONTAR CANDIDATOS
			System.out.println(contador + "� Candidato");
			
			System.out.println("Idade: ");
			idade = e.nextInt();			
			
			System.out.println("Sexo: ");
			sexo = e.next().toUpperCase().charAt(0);
			// Valida��o
			while(sexo !='F' && sexo != 'M'){
				System.out.println("Sexo F/M: ");
				sexo = e.next().toUpperCase().charAt(0);
			}
			
			
			System.out.println("Digite a escolaridade: ");
			escolar = e.next().toUpperCase().charAt(0);
			// Valida��o da escolaridade
			while(escolar !='M' && escolar != 'S' &&  escolar != 'P' && escolar != 'T' && escolar != 'D'){
				System.out.println("Digite a escolaridade M/S/P/T/D");
				escolar = e.next().toUpperCase().charAt(0);
			}
			
			
			System.out.println("Experi�ncia no servi�o");
			servico = e.nextInt();
			// Valida��o do servico
			while(servico != 1 && servico != 2){
				System.out.println("Experi�ncia no servi�o 1 ou 2");
				servico = e.nextInt();
			}
			
			//A) 
			// IDADE M�DIA DE HOMENS COM EXPERI�NCIA
			if(sexo == 'M' && servico ==1){
				contHomem++;
				somaIdade += idade;
			}
			
			//B)
			//PORCENTAGEM CANDIDATOS COM E SEM EXPERIENCIA
			if(servico ==1){
				contSim++;
			} else {
				contNao++;
			}
			
			//C)QUANTIDADE DE CANDIDATOS POR ESCOLARIDADE
			switch(escolar){
			case 'M':
				contM++;
				break;
			case 'S':
				contS++;
				break;
			case 'P':
				contP++;
				break;
			case 'T':
				contT++;
				break;
			case 'D':
				contD++;
				break;			
			}
			
		    // Atualiza a vari�vel resp
				System.out.println("Deseja cadastrar novo candidato?");
				resp = e.next();				

			// Se o usu�rio digitar algo diferente de SIM a pergunta continuar� aparecendo
			while(!(resp.equalsIgnoreCase("sim") || (resp.equalsIgnoreCase("n�o")))){
				System.out.println("Deseja cadastrar novo candidato? sim/n�o");
				resp = e.next();
			}		

	} 
		//A 
		if(contHomem == 0){
			System.out.println("M�dia idade de homens com experi�ncia no servi�o: " + 0);
		} else {
			System.out.println("M�dia idade de homens com experi�ncia no servi�o: " + somaIdade/contHomem);
		}
		
		//B
		System.out.println("Porcentagem candidatos com experi�ncia: " + fMoeda.format((double)contSim/contador * 100));
		System.out.println("Porcentagem candidatos sem experi�ncia: " + fMoeda.format((double)contNao/contador * 100));
		System.out.println(contador);
		
		//C
		System.out.println("Escolaridade M�dio" + contM);
		System.out.println("Escolaridade Superior" + contS);
		System.out.println("Escolaridade P�s-Gradua��o" + contP);
		System.out.println("Escolaridade Mestrado" + contT);
		System.out.println("Escolaridade Doutorado" + contD);
  }
}
