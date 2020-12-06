// Programa para localizar o maior valor da matriz 4x4

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int tc = 4, tl = 4, maior = 0;
		int posl = 0 , posc = 0;
		int matriz1[][]= new int [tc][tl];
		try (Scanner ler = new Scanner(System.in)) {
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			System.out.println("Digite num numero inteiro:");
			matriz1[c][l] = ler.nextInt();	
	}} // looping para definir matriz
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			maior = (maior < matriz1[c][l])? matriz1[c][l] : maior; 
	}} // checando o maior valor e armazenando na variavel 'maior'.
	
	for (int c=0 ; c<tc ; c++) {
		for (int l=0 ; l<tl ; l++) {
			if (maior == matriz1[c][l]) {
				posc = c;
				posl = l; }
	}} //checando as posições (coluna e linha) do maior valor, que agora está armazenado na variavel 'maior'
	
	System.out.println("O maior valor digitado é:");
	System.out.println("Coluna ["+posc+"] , Linha ["+posl+"] = " +maior);

}}}