// programa para pedir um vetor de 10 posi��es e exibir o menor e o maior valor

import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
		int t = 5; // Fiz dessa forma para facilitar a troca de valores referente ao tamanho do vetor
		int vetor1[]= new int[t];
		int maior = Integer.MIN_VALUE; // valor minimo atribuido a variavel
		int menor = Integer.MAX_VALUE; // valor m�ximo atribuido a variavel
		
		for (int i=0; i<t ; i++) {
			System.out.println("Digite um numero");
			vetor1[i] = ler.nextInt();
		} // defini��o do vetor
		
		for (int i=0; i<t ; i++) { 		
		maior = (maior>=vetor1[i]) ? maior: vetor1[i]; 
		menor = (menor<=vetor1[i]) ? menor: vetor1[i]; 
			}
		// Acima optei por uma forma alternativa de if. 
		//Pergunto se a vari�vel � maior ou igual ao conteudo do vetor na posi��o atual. 
		//Se sim eu mantenho o valor da vari�vel, se nao o valor � trocado pelo conteudo da posi��o atual do vetor.
		
		System.out.println("======================== ");
		System.out.println("O maior valor � " + maior);
		System.out.println("O menor valor � " + menor);
		System.out.println("======================== ");

		}
}
}