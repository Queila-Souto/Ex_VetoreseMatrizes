//Programa que le 6 valores e depois mostra na tela os valores lidos:

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
Scanner ler =new Scanner(System.in);
int vetor[] = new int[6];

for (int i = 0; i<6 ; i++) {
	System.out.println("Digite um numero inteiro : ");
	vetor[i]= ler.nextInt();
	
}

System.out.println("Vetor:");

for (int i= 0 ; i<6 ; i++) {

System.out.println("Vetor: posição "+ i +" = " + vetor[i]);

	}

}
}