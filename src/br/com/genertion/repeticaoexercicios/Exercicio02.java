package br.com.genertion.repeticaoexercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        int i, num, par = 0, impar = 0;
	        
	        for(i = 0; i <= 9; i++) {
	            System.out.println("Digite um n�mero: ");
	            num = sc.nextInt();
	            
	            if(num % 2 == 0) {
	                par++;
	            }
	            else {
	                impar++;
	            }
	        }
	        
	        System.out.println("\nForam inseridos: " + par + " n�mero(s) par(es).");
	        System.out.println("Foram inseridos: " + impar + " n�mero(s) �mpar(es).");
	        sc.close();
				
			}
		
		
		}


