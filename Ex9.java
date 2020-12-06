// programa para ler 6 valores inteiros pares e exibir em ordem inversa.
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		int t = 6;
		int vetor1[]= new int[t];
		int teste = 0;
		try (Scanner ler = new Scanner(System.in)) {

		for (int i = 0 ; i<t ; i++) {
			System.out.println("Digite um numero par:");
			teste = ler.nextInt();
			if (teste % 2 == 0) {  //testamos o valor individualmente, em cada posição.
				vetor1[i]=teste;}
			else {
				System.out.println("Valor inválido. Favor digite novamente");
				teste = ler.nextInt(); // A variavel teste ira receber o novo valor 
				vetor1[i]=teste;} //e atribui-lo a posição atual
		}
		
		System.out.println("_______________________________\n");

		System.out.println(" Vetor em ordem INVERSA: \n");
		
		for (int i = t-1 ; i>-1 ; i-- ) { // invertemos o metodo for, para que ele comece partindo da maior posição do vetor.
			
			System.out.println("========== "+vetor1[i]+" =========="); 
		}
	}
}
}	
	
	
