package dia091116;

import java.util.Scanner;

public class ExerciciosArrays {

	public ExerciciosArrays() {
		
		int escolha, soma, avgGol, avgSofridos, avgMarcados;
		
		int[][] liga = new int[9][2];
		
		liga[0][0] = 2;
		liga[0][1] = 1;
		liga[1][0] = 2;
		liga[1][1] = 0;
		liga[2][0] = 1;
		liga[2][1] = 1;
		liga[3][0] = 0;
		liga[3][1] = 1;
		liga[4][0] = 1;
		liga[4][1] = 2;
		liga[5][0] = 1;
		liga[5][1] = 2;
		liga[6][0] = 1;
		liga[6][1] = 1;
		liga[7][0] = 3;
		liga[7][1] = 0;
		liga[8][0] = 1;
		liga[8][1] = 0;
		
		System.out.println("RESULTADOS: ");
		
		for(int i = 0; i < 9; i++) {
			System.out.println("\t" + liga[i][0] + " - " + liga[i][1]);
		}
		
		System.out.println("\n0 - Exit");
		System.out.println("1 - Média de golos por jogo");
		System.out.println("2 - Média de golos marcados em casa");
		System.out.println("3 - Média de golos sofridos em casa");
		System.out.print("\nEscolha: ");
		escolha = new Scanner(System.in).nextInt();
		switch(escolha) {
		case 0 : break;
		case 1 :
			soma = 0;
			for(int i = 0; i < 9; i++) {
				soma += liga[i][0] + liga[i][1];
			}
			System.out.print("Média de golos por jogos: " + soma/9);
			break;
		case 2 :
			soma = 0;
			for(int i = 0; i < 9; i++) {
				soma += liga[i][0];
			}
			System.out.print("Média de golos marcados em casa por jogos: " + soma/9);
			break;
		case 3 :
			soma = 0;
			for(int i = 0; i < 9; i++) {
				soma += liga[i][1];
			}
			System.out.print("Média de golos sofridos em casa por jogos: " + soma/9);
			break;
		default :
			System.out.print("ERRO");
			break;
		}
	}

}
