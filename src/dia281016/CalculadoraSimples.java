package dia281016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		
		int  x, y;
		
		System.out.println("Insira o primeiro número: ");
		x  = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o segundo número: ");
		y  = (new Scanner(System.in)).nextInt(); 
		
		int soma = x + y;
		
		System.out.println("A soma de " + x + " + " + y + " é " + soma);
		
	}

}
