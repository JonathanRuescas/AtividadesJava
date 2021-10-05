/*
 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
 *  e mostre-o expresso em horas, minutos e segundos.*/
package br.com.generation.sequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
				
		int  horas, minutos, segundos, seg;
		   
		    System.out.println("Digite a duração do evento em segundos:");
		    segundos = leia.nextInt();
		    horas = segundos / 3600;
		    minutos = (segundos % 3600) /60;
		    seg = (segundos % 3600) % 60;
		    System.out.println("A duração do evento foi de "+ horas+" horas "+ minutos +" minutos e "+ seg + "segundos ");
            leia.close();
	}

}
