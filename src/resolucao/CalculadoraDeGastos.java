package resolucao;

import java.util.Scanner;

public class CalculadoraDeGastos {

	public CalculadoraDeGastos() {
		double agua = 0.0,
			   luz  = 0.0,
			   gas  = 0.0,
			   tele = 0.0;
		
		System.out.println("Media Mensal: ");
		System.out.print("Agua: ");
		agua = new Scanner(System.in).nextDouble();
		
		System.out.print("Luz: ");
		luz  = new Scanner(System.in).nextDouble();
		
		System.out.print("Gás: ");
		gas  = new Scanner(System.in).nextDouble();
		
		System.out.print("Telecomunicações: ");
		tele = new Scanner(System.in).nextDouble();
		
		System.out.print("\nMedia anual de despesas: " + (agua + luz + gas + tele) * 12);
	}

}
