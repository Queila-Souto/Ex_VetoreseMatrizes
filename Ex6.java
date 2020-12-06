// programa para pedir um vetor de 10 posições e exibir o menor e o maior valor
import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int t = 10; // Fiz dessa forma para facilitar a troca de valores referente ao tamanho do vetor
	int vetor1[]= new int[t];
	int maior = Integer.MIN_VALUE; // valor minimo atribuido a variavel
	int menor = Integer.MAX_VALUE; // valor máximo atribuido a variavel

	
	for (int i=0; i<t ; i++) {
		System.out.println("Digite um numero");
		vetor1[i] = ler.nextInt();
	}
	for (int i=0; i<t ; i++) { 
		
		// Abaixo uma forma alternativa de if. 
		//Aqui eu pergunto se a var. maior é maior ou igual ao conteudo do vetor na posição atual. 
		//Se sim eu mantenho o valor da variável, se nao o valor é trocado pelo conteudo da posição atual do vetor.
	maior = (maior>=vetor1[i]) ? maior: vetor1[i]; 
	menor = (menor<=vetor1[i]) ? menor: vetor1[i]; 
	
	}
	
	System.out.println("======================== ");
	System.out.println("O maior valor é " + maior);
	System.out.println("O menor valor é " + menor);
	System.out.println("======================== ");


}
}