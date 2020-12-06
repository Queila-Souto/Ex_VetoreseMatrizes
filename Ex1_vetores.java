/* 
Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

public class Ex1 {

	public static void main(String[] args) {
int a [] = {1,0,5,-2,-5,7}; // Declarado e inicializado vetor com valores solicitados
int soma = a[0] + a[1] + a[5]; // atribuido a variavel simples a soma solicitada
a[4] = 100; // atribuido 100 a posição 4 do vetor

for (int i=0; i<6; i++) {
	System.out.println("Posição [" + i + "] o valor é === " + a[i]);
} // Exibindo valor de cada posição do vetor

System.out.println("A soma é " + soma);

	}

}
