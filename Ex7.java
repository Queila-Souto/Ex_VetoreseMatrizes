// Programa para ler 10 numeros inteiros. Imprimir vetor, maior numero e sua posição.

import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int t = 2; 
			int vetor1[]= new int[t];
			int maior = Integer.MIN_VALUE; 
			int maiorpos = 0 ; 
			int i ;

		for ( i=0 ; i<t ; i++) { 
			System.out.println("Digite um numero");
			vetor1[i] = ler.nextInt();
		}// definição de vetor
		
		System.out.println("========VETOR========== ");

		for (i=0; i<t ; i++) { 
			maior = (maior>=vetor1[i]) ? maior: vetor1[i]; 
		}//checagem do maior valor
		
		for (i=0; i<t ; i++) { 			
			System.out.println("POSIÇÃO [" + i + "] = " + vetor1[i]);
		}//impressao do vetor
		
		for (i=0; i<t ; i++) { 
			if (maior == vetor1[i]) {
					maiorpos = i;}
		} // checagem do indice correpondente ao maior
		
		System.out.println("======================== ");
		System.out.println("O maior valor é " + maior + " e está na posição " + maiorpos );
		System.out.println("======================== ");
	}
}}