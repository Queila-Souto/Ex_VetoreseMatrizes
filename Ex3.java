// Matriz 4x4 com o produto do valor da linha e da coluna de cada elemento. Exiba a matriz

public class Ex3 {
	public static void main(String[] args) {
		int tl=4;
		int tc=4;
		int matriz[][] = new int [tc][tl];

	for (int c = 0 ; c<tc ; c++ ) {
		for ( int l = 0 ; l<tl ; l++) {
			matriz[c][l] = c*l;	
			}} // multiplicando as colunas pelas linhas
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			System.out.println("Posição: ["+c+"] ["+l+"] = " + matriz[c][l]);
			}} //Exibindo a Matriz
}
}
