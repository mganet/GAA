
public class ExercicioBalanco {

	public ExercicioBalanco() {

			System.out.println("Ola turma!");
				
			//Cacula receitas
				
			int quotas 		= 300,
				recBaile 	= 200,
				recBar 	 	= 250;
				
			int totalReceitas = quotas + recBaile + recBar;
				
				System.out.println("Receitas: " + totalReceitas  + "€");
				
			//Cacula despesas
				
			int luz			= 80,
				agua		= 60,
				telefone	= 70;
				
			int totalDespesas =  luz + agua + telefone;
				
			System.out.println("Despesas: " + totalDespesas + "€");
				
			System.out.println("\nBalanço: " + (totalReceitas - totalDespesas)  + "€");
	}

}
