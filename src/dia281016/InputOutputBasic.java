package dia281016;

import java.util.Scanner;

public class InputOutputBasic {

	public InputOutputBasic() {
		// Instrumento de escrita em consola
		System.out.println("Bom dia!\nComo se chama?");
		
		//Variável para armazenar nome
		String name;
		
		//Instrumento para leitura do teclado, em linha de comandos
		name =(new Scanner(System.in)).nextLine();
		
		System.out.println("Como tem passado " + name + "?");
	}

}
