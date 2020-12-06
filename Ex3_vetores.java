/*Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das 
componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
10 elementos cada. Imprimir todos os conjuntos.*/
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
	int	vetor1[] =  new int[10];
	int vetor2[] = new int[10];
	try (Scanner ler = new Scanner(System.in)) {
		for (int i = 0 ; i<10 ; i++ ) {
			System.out.println("Digite um numero");
			vetor1[i] = ler.nextInt();
			
		}
	}
	
	
	for (int i = 0 ; i<10 ; i++ ) {
		vetor2[i] = vetor1[i] * vetor1[i]; //vetor2 esta recebendo o quadrado do vetor 1
		}
	
	for (int i = 0 ; i<10 ; i++ ) {
		System.out.println("vetor1 --- " + vetor1[i]);
	}
	
	System.out.println("==========================");
	
	for (int i = 0 ; i<10 ; i++ ) {
		System.out.println("vetor2 --- " + vetor2[i]);
	}
	
}
}
