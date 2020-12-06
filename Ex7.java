// Programa para ler 10 numeros inteiros. Imprimir vetor, maior numero e sua posição.
import java.util.Scanner;
public class Ex7 {
public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
		int t = 10; 
		int vetor1[]= new int[t];
		int maior = Integer.MIN_VALUE; 
		int maiorpos = 0 ; // variavel para o indice correspondente ao maior valor
		int i ;

		for ( i=0 ; i<t ; i++) { // loop para entrada de valores
			System.out.println("Digite um numero");
			vetor1[i] = ler.nextInt();
		}
		
		System.out.println("========VETOR========== ");

		for (i=0; i<t ; i++) { // loop para checagem do maior valor
			
		maior = (maior>=vetor1[i]) ? maior: vetor1[i]; 
		
		}
		
		for (i=0; i<t ; i++) { //loop para impressao do vetor
			
			System.out.println("POSIÇÃO [" + i + "] = " + vetor1[i]);

			
			}
		for (i=0; i<t ; i++) { // loop para checar o indice correpondente ao maior
		if (maior == vetor1[i]) {
			maiorpos = i;
		}
		}
		
		System.out.println("======================== ");
		System.out.println("O maior valor é " + maior + " e está na posição " + maiorpos );
	}
	System.out.println("======================== ");
}}