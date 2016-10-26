
public class ExercicioBalanco {
	
	int totalReceitas, totalDespesas;

	public ExercicioBalanco() {
				
			calcularReceitas();
			cacularDespesas();
				
			System.out.println("Receitas: " + totalReceitas  + "€");		
			System.out.println("Despesas: " + totalDespesas + "€");
			System.out.println("\nBalanço: " + (totalReceitas - totalDespesas)  + "€");
			
	}
	
	public void calcularReceitas(){
		
		int quotas 		= 300,
			recBaile 	= 200,
			recBar 	 	= 250;
				
		totalReceitas = quotas + recBaile + recBar;
		
	}
	
	public void cacularDespesas(){
		
		int luz			= 80,
			agua		= 60,
			telefone	= 70;
				
		totalDespesas =  luz + agua + telefone;
	}

}
