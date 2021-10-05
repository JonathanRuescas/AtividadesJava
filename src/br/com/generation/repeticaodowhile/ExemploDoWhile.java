package br.com.generation.repeticaodowhile;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println("Repetição.. nr:" + 1);
		++i;
		Thread.sleep(1000);
		
		
		}
		while(i != 10);
	
	}

}
