package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num1, num2, num3, mNumero;

        System.out.println("Digite o 1� n�mero: ");
        num1 = leia.nextInt();

        System.out.println("Digite o 2� n�mero: ");
        num2 = leia.nextInt();

        System.out.println("Digite o 3� n�mero: ");
        num3 = leia.nextInt();

        if(num1 > num2) {
            if(num1 > num3)
                mNumero = num1;
            else
                mNumero = num3;
        }
        else {
            if(num2 > num3)
                mNumero = num2;
            else
                mNumero = num3;
        }

        System.out.println("O maior n�mero � " + mNumero);

    }

}