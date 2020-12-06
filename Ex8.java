// Programa para ler 6 valores e imprimir a ordem inversa
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		int apoio = 0; 
		int c = 6;
		int vetor1[] = new int[c];
		try (Scanner ler = new Scanner(System.in)) {
				
		for (int i = 0 ; i<c ; i++) {
			System.out.println("Digite um número: ");
			vetor1[i] = ler.nextInt();
					} // definição do vetor
							
		for (int cima = 0 ; cima<c ; cima++) {
			for (int baixo = 0 ; baixo < c ; baixo++) {
				if (vetor1[cima]>vetor1[baixo]) {
					apoio = vetor1[cima];
					vetor1[cima]=vetor1[baixo];
					vetor1[baixo]=apoio; }
				} } // Método BubleSort
		
		System.out.println("\nVetor em ordem decrescente: ");

		for (int i = 0 ; i<c ; i++) {
			System.out.println("========= "+ vetor1[i]+" =========");
		}
	}
}
}
//Foi utilizado o método BubleSort
//É preciso criar um encadeamento de for para que o programa leia uma posição do vetor e sua seguinte. 
//Assim ele faz a comparação e , a variavel apoio recebe o valor maior.
//A variavel que continha o valor maior(vetor[cima]), recebe agora o valor menor (valor[baixo])
//Finalmente, a variavel apoio é atribuida a variavel vetor[baixo].
