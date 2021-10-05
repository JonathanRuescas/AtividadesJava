package br.com.genertion.repeticaoexercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num, soma= 0;
		
		do { 
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:  "));
			soma += num;	
		}while(num != 0);
		
JOptionPane.showMessageDialog(null,  " O Resultado de soma é: " + 
soma, "Resiltado", JOptionPane.INFORMATION_MESSAGE);

	}

}
