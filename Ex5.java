// Programa para calcular a quantidade de numeros pares informados no vetor
import java.util.Scanner;
public class Ex5 {
public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
		int vetor1[] = new int[10];
		int cont = 0;
		
		for (int i=0 ; i < 10; i++) {
			System.out.println("Digite um valor para o vetor1: ");
			vetor1[i]= ler.nextInt();
			} // loop para definir o vetor
		for (int i=0 ; i < 10; i++) {
			if(vetor1[i] % 2 == 0) {
				cont++;	}
				}//checagem e contagem de numeros pares. A variavel cont está recebendo 1 unidade a cada loop em que o if é verdadeiro.
			System.out.println("quantidade de pares " + cont);
	}
	}
}

