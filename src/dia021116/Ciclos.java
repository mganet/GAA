package dia021116;

public class Ciclos {

	public Ciclos() {
		// TODO Auto-generated constructor stub
		de_parar();
	}
	
	public void enquanto() {
		int i = 0;
		String msg = "All you need is love";
		
		while(i < 4) {
			System.out.println(msg);
			i++;
		}
	}
	
	public void fazerEnquando() {
		int i = 5;
		String msg = "All you need is love";
		
		do {
			System.out.println(msg);
			i++;
		} while(i <= 4);
	}
	
	public void de_parar() {
		
		String msg = "All you need is love";
		
		/*
		 * for
		 * int i = 0; -> Inicializa a variável de controlo
		 * i < 4;     -> Testa a variável de controlo
		 * i++;       -> Executa ação
		 */
		
		for (int i = 0; i < 4; i++) {
			System.out.println(msg);
		}
	}

}
