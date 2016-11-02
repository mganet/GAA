package dia021116;

import java.util.Random;
import java.util.Scanner;;

public class BlackJack {

	public BlackJack() {
		blackJack();
	}
	
	public void blackJack() {
		
		Random r = new Random();
		
		int 	valor				= 0;
		int 	somaDealer			= 0,
				somaUtilizador		= 0;
		Boolean especialUtilizador	= false,
				especialDealer		= false,
				turno    			= false,  // FALSE PARA O UTILIZADOR E TRUE PARA O DEALER
				terminar			= false;
		int[] cartas = new int[13];
		String carta;
		Scanner scan = new Scanner(System.in);
		
		cartas[0]  = 1;
		cartas[1]  = 2;
		cartas[2]  = 3;
		cartas[3]  = 4;
		cartas[4]  = 5;
		cartas[5]  = 6;
		cartas[6]  = 7;
		cartas[7]  = 8;
		cartas[8]  = 9;
		cartas[9]  = 10;
		cartas[10] = 10;
		cartas[11] = 10;
		cartas[12] = 10;
		
		while(terminar == false) {
			
			valor = r.nextInt(12);
			
			if(valor == 0) {
				carta = "AS";
			} else if(valor >= 10) {
				carta = "Especial";
			} else {
				carta = Integer.toString(cartas[valor]);
			}
			
			if(turno == false) {
				System.out.print("Seu turno\n");
				System.out.print("Deseja obter uma carta? [0 - sim] ");
				if(scan.nextInt() == 0)
				{
					somaUtilizador += valor;
					System.out.print("Carta: " + carta);
					System.out.println(somaUtilizador);
				} else {
					System.out.print(somaUtilizador);
					terminar = true;
				}
				
				if(somaDealer < 16) {
					turno = true;
				}
				
			} else {
				System.out.print("Dealer turno\n");
				turno = false;
				
			}
		}
		
		
	}

}
