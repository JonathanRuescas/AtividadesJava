package br.com.genertion.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) {
			
			System.out.println("Digite um numero:"); 
			numero = in.nextInt();
			
			if (numero == 10) {
				System.out.println("Voc� acertou!!");
			}
			else {
				System.out.println("Voc� errou!!");
			} // fim do laco condicional 
		}//--> Fim do laco de repetic�o while 
		
			
		}
	}
	
		

	


