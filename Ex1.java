// Programa para ler uma matriz 4x4, contar e exibir os numeros maiores que 10
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int tc = 2, tl = 2, contagem = 0;
		int matriz1[][]= new int [tc][tl];
		try (Scanner ler = new Scanner(System.in)) {
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			System.out.println("Digite num numero inteiro:");
			matriz1[c][l] = ler.nextInt();	} } // Esse looping est� gerando os valores na matriz
	
	System.out.println("\n___________________________" );
	System.out.println("\nOs numeros maiores que 10 s�o: \n" );
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			if (matriz1[c][l] > 10) {
				System.out.println("Posi��o: ["+c+"] ["+l+"] = " + matriz1[c][l]);
				contagem = contagem + 1 ;}
				} } // Esse looping est� checando os n�meros maiores que 10 e fazendo a contagem
	
	
	System.out.println("\nQuantidade : " + contagem);
	System.out.println("___________________________" );
	System.out.println("\n Aqui est� sua matriz:");
	
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			System.out.println("Posi��o: ["+c+"] ["+l+"] = " + matriz1[c][l]);
			}} // Esse looping � para exibir a toda a matriz
		}
	}
}

