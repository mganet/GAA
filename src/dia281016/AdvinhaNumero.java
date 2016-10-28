package dia281016;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {

	int escondido; 
	final int VALORMAX = 5;
	
	public AdvinhaNumero() {
		
		Random r = new Random();
		
		escondido = r.nextInt(VALORMAX);

		if(escondido == tentarAdivinhar()) {
			System.out.print("\nADIVINHASTE PA");
		}else {
			System.out.print("\nERROU");
		}
		
	}
	
	public int tentarAdivinhar(){
		
		System.out.print("Insira um número de 0 a 5: ");
		return new Scanner(System.in).nextInt();
		
	}

}
