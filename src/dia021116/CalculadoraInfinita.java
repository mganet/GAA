package dia021116;
import java.util.Scanner;

public class CalculadoraInfinita {

	public CalculadoraInfinita() {
		calculadoraSimples();
	}
	
	public void calculadoraSimples(){

		Scanner valor = new Scanner(System.in);
		int op		  = 10, 
			num1 	  = 0, 
			num2 	  = 0, 
			resultado = 0;
		
		while(op != 0)
		{
			System.out.println("0 - Para sair");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Mutiplicação");
			System.out.println("4 - Divisão");
			System.out.print("\nEscolha: ");
			op = valor.nextInt();
			
			if(op != 0) {
				System.out.print("\nDigite insira o número 1: ");
				num1 = valor.nextInt();
				System.out.print("Digite insira o número 2: ");
				num2 = valor.nextInt();
			}
			
			switch(op) {
			case 0  : System.out.print("\nAté logo");
					  break;
			case 1  : resultado = num1 + num2;
					  break;
			case 2  : resultado = num1 - num2;
					  break;
			case 3  : resultado = num1 * num2;
					  break;
			case 4  : resultado = num1 / num2;
					  break;
			default : System.out.println("\nERRO: Número inserido invalido");
					  break;
			}
			
			if(op != 0)
			System.out.println("\nResultado: " + resultado + "\n");
		}
	}

	
}
