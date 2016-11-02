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
		 * =  -> Atribui��o
		 * == -> Compara��o (true || false)
		 * <  -> compara��o
		 * >  -> compara��o
		 * != -> compara��o
		 */
		
		if(num1 == num2){
			System.out.println("Os n�meros s�o igauis");
		} else if(num1 < num2){
			System.out.println("O n�mero 1 � menor que o n�mero 2");
		} else{
			System.out.println("O n�mero 2 � menor que o n�mero 1");
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
			System.out.println("O n�mero 1 � maior n�mero");
		}
		
		/*
		 * !  -> Comutador de sinal  (verdadeiro para falso ou virse-versa)
		 * () -> Agrupa, condi��es de verdade
		 */
		
		if(!(num2 > num3) || num1 > num4) {
			System.out.println("Ganha a equipa 1");
		} else {
			System.out.println("Ganha a equipa 2");
		}
		
	}

}
