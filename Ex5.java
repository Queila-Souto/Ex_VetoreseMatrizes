//Leia uma matriz 5x5, tamb�m um valor x. O programa dever� fazer uma busca desse valor, escrever a localiza��o ao final ou a mensagem "n�o encontrado".
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int x = 0;
		int tc = 5 , tl = 5 ;
		int matriz[][] =new int[tc][tl];
		int loc_c = 0, loc_l = 0;
		try (Scanner ler = new Scanner(System.in)) {
			
	for (int c=0 ; c<tc ; c++) {
		for (int l=0; l<tl ; l++) {
			System.out.println("Digite um valor para a posi��o [" + c + "] [" + l +"] da matriz:");
			matriz [c][l] = ler.nextInt();
			}} //Loop para definir matriz
	
	System.out.println("Digite o valor para localiza��o");
	x = ler.nextInt(); //Definindo uma variavel para busca


	for (int c=0 ; c<tc ; c++) {
		for (int l=0; l<tl ; l++) {
			if (matriz[c][l] == x) {
				loc_c = c;
				loc_l = l;}
	}} // Loop para checagem e aloca��o da posi��o do valor buscado para a variavel global
		
System.out.println("_____________________________________________ ");	
if (matriz[loc_c][loc_l] == x) {
System.out.println("O valor buscado est� na posi��o ["+loc_c+"] ["+loc_l+"]. ");}
else {
System.out.println("Valor n�o  localizado");} // Exibi��o do resultado
		}	
}
}
