package dia281016;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {

	int escondido; 
	final int VALORMAX = 5;
	
	public AdvinhaNumero() {
		
		Random r = new Random();
		int tentativas = 0;
		int num;
		
		escondido = r.nextInt(VALORMAX);
		
		while(tentativas < 3)
		{
			num = tentarAdivinhar();
			if(escondido == num) {
				System.out.print("\nADIVINHASTE PA");
				tentativas = 3;
			}else if(escondido > num){
				tentativas++;
				System.out.print("\nO número é maior\n");
			}else{
				tentativas++;
				System.out.print("\nO número é menor\n");
			}
		}
		
	}
	
	public int tentarAdivinhar(){
		
		System.out.print("Insira um número de 0 a 5: ");
		return new Scanner(System.in).nextInt();
		
	}

}
