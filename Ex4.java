import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor1[] = new int[8];
		int x = 0;
		int y = 0;
		
		for (int i = 0 ; i<8 ; i++) {
			System.out.println("Digite um numero para o vetor:");
			vetor1[i] = ler.nextInt();
					}		
		System.out.println("===========================================");
		System.out.println("Digite a posi��o do vetor");
		x = ler.nextInt();
		System.out.println("O valor da posi��o "+ x + " � " + vetor1[x]);
		System.out.println("===========================================");
		System.out.println("Digite a posi��o do vetor");
		y = ler.nextInt();
		System.out.println("O valor da posi��o "+ y + " � " + vetor1[y]);
		System.out.println("===========================================");
		int resultado = vetor1[x] + vetor1[y];
		System.out.println("A soma � " + resultado);



	}
	}