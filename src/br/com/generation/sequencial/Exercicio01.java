/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. */
package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		
		int dias, meses, anos;
        int diaNascimento, mesNascimento, anoNascimento;
        int totalDias;
        
        

        System.out.println("digite o dia de hoje: \n");
        dias = leia.nextInt(); 
        
        System.out.println("mes:\n");
        meses = leia.nextInt();
        
        System.out.println("ano:\n");
        anos = leia.nextInt();

        System.out.println("digite o dia que nasceu:\n");
        diaNascimento = leia.nextInt();
        
        System.out.println("agora o mes:\n");
        mesNascimento = leia.nextInt();
        		
        System.out.println("e o ano:\n");
        anoNascimento = leia.nextInt();

        totalDias = (anos - anoNascimento) * 365 + (meses  * 30 + dias) -
        (mesNascimento * 30 + diaNascimento);

        System.out.println("sua idade em dias é: " + totalDias);
        leia.close();
	}

}
