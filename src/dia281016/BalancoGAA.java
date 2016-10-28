package dia281016;

import java.util.Scanner;;

public class BalancoGAA {
	
	Scanner in  = new Scanner(System.in);
	
	public BalancoGAA() {
		
		int balanco = calcularBalanco(receitas(), despesas());

		System.out.println("\nBalanço: " + balanco  + "€\n");
		
		if(balanco > 0){
			System.out.println("Balanço positivo");
		} else if(balanco == 0){
			System.out.println("Balanço neutro");
		} else{
			System.out.println("Balanço negativo");
		}
		
	}
	
	
	public int receitas(){
		
		int quotas, recBaile, recBar;
		
		System.out.println("Insira as despesas\n");
		System.out.print("Quotas: ");
		quotas	 = in.nextInt();
		
		System.out.print("Baile: ");
		recBaile = in.nextInt();
		
		System.out.print("Bar: ");
		recBar	 = in.nextInt();
		
		return quotas + recBaile + recBar;
		
	}
	
	public int despesas(){
		
		int agua, luz, telefone;
		
		System.out.println("\nInsira as despesas\n");
		
		System.out.print("Agua: ");
		agua	 = in.nextInt();
		
		System.out.print("Luz: ");
		luz 	 = in.nextInt();
		
		System.out.print("Telefone: ");
		telefone = in.nextInt();
		
		return luz + agua + telefone;
		
	}
	
	public int calcularBalanco(int receita, int despesa){
		return receita - despesa;
	}

}
