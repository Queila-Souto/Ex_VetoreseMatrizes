// Declarar uma matriz 5x5 preenchendo com 1 a diagonal principal e com 0 os demais elementos. Exiba a matriz

public class Ex2 {

	public static void main(String[] args) {
		int matriz [][] = { {1,0,0,0,0} , {0,1,0,0,0} , {0,0,1,0,0} , {0,0,0,1,0}, {0,0,0,0,1}};

		for (int c=0 ; c<5 ; c++) {
			for (int l=0 ; l<5 ; l++) {
				System.out.println("Posição: ["+c+"] ["+l+"] = " + matriz[c][l]);}} // Esse looping é para exibir a  matriz
}
}
