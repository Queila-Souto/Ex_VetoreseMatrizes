// Exercicio1 se��o 7 pt 1 - Vetores
public class Ex1 {

	public static void main(String[] args) {
int a [] = {1,0,5,-2,-5,7}; // Declarado e inicializado vetor com valores solicitados
int soma = a[0] + a[1] + a[5]; // atribuido a variavel simples a soma solicitada
a[4] = 100; // atribuido 100 a posi��o 4 do vetor

for (int i=0; i<6; i++) {
	System.out.println("Posi��o [" + i + "] o valor � === " + a[i]);
} // Exibindo valor de cada posi��o do vetor

System.out.println("a soma � " + soma);

	}

}
