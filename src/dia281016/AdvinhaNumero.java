package dia281016;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {

	int escondido; 
	final int VALORMAX = 5;
	
	public AdvinhaNumero() {
		
		Random r = new Random();
		int tentativas = 0;
		
		escondido = r.nextInt(VALORMAX);
		
		
		while(tentativas < 3)
		{
			if(escondido == tentarAdivinhar()) {
				System.out.print("\nADIVINHASTE PA");
				tentativas = 3;
			}else {
				tentativas++;
				System.out.print("\nERROU");
			}
		}
		
	}
	
	public int tentarAdivinhar(){
		
		System.out.print("Insira um número de 0 a 5: ");
		return new Scanner(System.in).nextInt();
		
	}

}
