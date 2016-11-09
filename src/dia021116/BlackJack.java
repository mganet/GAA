package dia021116;

import java.util.Random;
import java.util.Scanner;;


public class BlackJack {

	public BlackJack() {
		System.out.println(cardValue());
	}
	
	public int cardValue() {
		
		Random r = new Random();
		int value;
		
		value = r.nextInt();
		
		int[] card = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		
		return card[value];	
	}

}
