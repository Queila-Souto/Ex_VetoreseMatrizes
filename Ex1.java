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
			matriz1[c][l] = ler.nextInt();	} } // Esse looping está gerando os valores na matriz
	
	System.out.println("\n___________________________" );
	System.out.println("\nOs numeros maiores que 10 são: \n" );
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			if (matriz1[c][l] > 10) {
				System.out.println("Posição: ["+c+"] ["+l+"] = " + matriz1[c][l]);
				contagem = contagem + 1 ;}
				} } // Esse looping está checando os números maiores que 10 e fazendo a contagem
	
	
	System.out.println("\nQuantidade : " + contagem);
	System.out.println("___________________________" );
	System.out.println("\n Aqui está sua matriz:");
	
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			System.out.println("Posição: ["+c+"] ["+l+"] = " + matriz1[c][l]);
			}} // Esse looping é para exibir a toda a matriz
		}
	}
}

