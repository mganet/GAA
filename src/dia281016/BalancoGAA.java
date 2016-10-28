package dia281016;

import java.util.Scanner;;

public class BalancoGAA {

	int totalReceitas, totalDespesas;
	
	Scanner in  = new Scanner(System.in);
	
	public BalancoGAA() {
		
		receita();
		despesas();
		
		System.out.println("\nReceitas: " + totalReceitas  + "€");		
		System.out.println("Despesas: " + totalDespesas + "€");
		System.out.println("\nBalanço: " + (totalReceitas - totalDespesas)  + "€");
		
	}
	
	
	public void receita(){
		
		int quotas, recBaile, recBar;
		
		System.out.println("Insira as despesas\n");
		
		System.out.print("Quotas: ");
		quotas	 = in.nextInt();
		
		System.out.print("Baile: ");
		recBaile = in.nextInt();
		
		System.out.print("Bar: ");
		recBar	 = in.nextInt();
		
		totalReceitas = quotas + recBaile + recBar;
		
	}
	
	public void despesas(){
		
		int agua, luz, telefone;
		
		System.out.println("\nInsira as despesas\n");
		
		System.out.print("Agua: ");
		agua	 = in.nextInt();
		
		System.out.print("Luz: ");
		luz 	 = in.nextInt();
		
		System.out.print("Telefone: ");
		telefone = in.nextInt();
		
		totalDespesas =  luz + agua + telefone;
		
		
	}

}
