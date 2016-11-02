package dia021116;

public class Condicionais {

	public Condicionais() {
		// TODO Auto-generated constructor stub
		//comparadorSimples();
		comparadorMultiVariaveis();
	}
	
	public void comparadorSimples() {
		int num1 = 4,
			num2 = 3;
		
		/*
		 * =  -> Atribuição
		 * == -> Comparação (true || false)
		 * <  -> comparação
		 * >  -> comparação
		 * != -> comparação
		 */
		
		if(num1 == num2){
			System.out.println("Os números são igauis");
		} else if(num1 < num2){
			System.out.println("O número 1 é menor que o número 2");
		} else{
			System.out.println("O número 2 é menor que o número 1");
		}
	}
	
	public void comparadorMultiVariaveis() {
		
		/*
		 * &  -> Concatenador
		 * && -> Comparador (e)
		 * || -> Comparador (ou)
		 */
		
		int num1 = 5,
			num2 = 7,
			num3 = 3,
			num4 = 8;
		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("O número 1 é maior número");
		}
		
		/*
		 * !  -> Comutador de sinal  (verdadeiro para falso ou virse-versa)
		 * () -> Agrupa, condições de verdade
		 */
		
		if(!(num2 > num3) || num1 > num4) {
			System.out.println("Ganha a equipa 1");
		} else {
			System.out.println("Ganha a equipa 2");
		}
		
	}

}
