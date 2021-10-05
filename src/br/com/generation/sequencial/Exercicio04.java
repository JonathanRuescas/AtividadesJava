/*
 * Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
, onde  
*/
package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		double r, s, d;
		  
		  System.out.println("digite A: ");
		  a = leia.nextInt();
		  System.out.println("digite B: ");
		  b = leia.nextInt();
		  System.out.println("digite C: ");
		  c = leia.nextInt();
		  r = Math.pow ((a+b), 2.0);
		  s = Math.pow ((b+c), 2.0);
		  d = (r+s)/  2.0;
		  System.out.println("Calculo: "+ d);
		  leia.close();

	}

}
