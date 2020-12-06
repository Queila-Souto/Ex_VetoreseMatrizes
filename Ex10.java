// programa para ler e armazenar a nota da prova de 15 alunos num vetor. Calcular a média geral.
import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
	int t = 15;
	double soma= 0;
	double resultado=0;
	double notas[] = new double[t] ;
	Scanner ler = new Scanner(System.in);
	
	for (int i = 0 ; i < t ; i++) {
		System.out.println("Digite a sua nota");
		notas[i]= ler.nextDouble(); 
	}
	//somar
	// optei em fazer as somas das duas primeiras notas fora do loop, para evitar um for encadeado
	//Assim o loop partiu da posição seguinte no vetor (posição 2 - 3a nota)
	soma = notas[0]+notas[1];
	for (int i = 2 ; i < t ; i++) {
		soma = soma + notas[i];}
		
	// Divisão
	resultado = soma / t;
	
	
	System.out.println("=======================" );
	System.out.println("Média Geral = " + resultado);
}
}
