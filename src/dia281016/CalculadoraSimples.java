package dia281016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		
		int  x, y;
		
		System.out.println("Insira o primeiro n�mero: ");
		x  = (new Scanner(System.in)).nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		y  = (new Scanner(System.in)).nextInt(); 
		
		int soma = x + y;
		
		System.out.println("A soma de " + x + " + " + y + " � " + soma);
		
	}

}
