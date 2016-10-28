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
		
		System.out.println(escondido);
		
		do
		{
			if(escondido == tentarAdivinhar()) {
				System.out.print("\nADIVINHASTE PA");
				tentativas = 3;
			}else if(escondido > tentarAdivinhar()){
				tentativas++;
				System.out.print("\nO n�mero � maior\n");
			}else{
				tentativas++;
				System.out.print("\nO n�mero � menor\n");
			}
		}
		while(tentativas < 3);
		
	}
	
	public int tentarAdivinhar(){
		
		System.out.print("Insira um n�mero de 0 a 5: ");
		return new Scanner(System.in).nextInt();
		
	}

}
