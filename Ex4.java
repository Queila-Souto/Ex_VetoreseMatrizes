// Programa para ler um vetor de 8 posi��es. No final deve somar o valor correspondente as posi��es X e Y, determinadas pelo usu�rio.
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int t = 8; // tamanho do vetor
			int vetor1[] = new int[t];
			int x = 0;
			int y = 0;
			
			for (int i = 0 ; i<t ; i++) {
				System.out.println("Digite um numero para o vetor:");
				vetor1[i] = ler.nextInt();
						} // Definindo vetor
			
			System.out.println("===========================================");
			System.out.println("Digite a posi��o do vetor");
			x = ler.nextInt();
			System.out.println("O valor da posi��o "+ x + " � " + vetor1[x]); // Exibi��o do valor correspondente a posi��o x
			
			System.out.println("===========================================");
			System.out.println("Digite a posi��o do vetor");
			y = ler.nextInt();
			System.out.println("O valor da posi��o "+ y + " � " + vetor1[y]); // Exibi��o do valor correspondente a posi��o y
			
			System.out.println("===========================================");
			int resultado = vetor1[x] + vetor1[y]; // soma dos valores correspondentes a posi��o x e y
			System.out.println("A soma � " + resultado);
		}



	}
	}