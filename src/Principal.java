
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ola turma!");
		
		
		int quotas 		= 300,
			recBaile 	= 200,
			recBar 	 	= 250;
		
		int totalReceitas = quotas + recBaile + recBar;
		
		System.out.println("Receitas: " + totalReceitas  + "€");
		
		int luz			= 80,
			agua		= 60,
			telefone	= 70;
		
		int totalDespesas =  luz + agua + telefone;
		
		System.out.println("Despesas: " + totalDespesas + "€");
		
		System.out.println("\nBalanço: " + (totalReceitas - totalDespesas)  + "€");
		
	}

}
