/*
 *2. Faça um sistema que leia a idade de uma pessoa expressa em 
 *dias e mostre-a expressa em anos, meses e dias. */
	package br.com.generation.sequencial;

	import java.util.Scanner;

	public class Exercicio02 {

		public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
		
		int  ano, mes, dia, dias;
		 
	    System.out.println("Digite a idade em dias:"); 
	    dias = leia.nextInt();
	    ano = dias / 365;
	    mes =(dias % 365)/ 30;
	    dia =(dias % 365)% 30;
	    System.out.println("você tem " + ano + ", anos " +  mes + " meses, " + "e " + dia + " dias "); 
	    leia.close();
	}

}
