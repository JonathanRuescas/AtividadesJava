package br.com.genertion.repeticaoexercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		int num, cont = 0,  soma = 0; 
		
		double media = 0; 
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
		if (num != 0) {
			if (num % 3  == 0) {
			    cont++;
				soma += num; 
				media = soma / cont; 
			}
		}
		}while (num != 0);
		
		JOptionPane.showConfirmDialog(null, "A media dos numeros mutiplos de 3 é: " + 
				media, "Resultado - Aviso", JOptionPane.INFORMATION_MESSAGE);
		
		}

}	
