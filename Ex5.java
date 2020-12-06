// Programa para calcular a quantidade de numeros pares informados no vetor
import java.util.Scanner;
public class Ex5 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int vetor1[] = new int[10];
	int cont = 0;
	
	for (int i=0 ; i < 10; i++) {
		System.out.println("Digite um valor para o vetor1: ");
		vetor1[i]= ler.nextInt();
		}
	for (int i=0 ; i < 10; i++) {
		if(vetor1[i] % 2 == 0) {
			cont++;
		}
	
	}
		System.out.println("quantidade de pares " + cont);
				

	}
}

