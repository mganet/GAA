package dia091116;

public class Arrays {

	public Arrays() {
		
		// N de golos num jogo: 
		// Porto-Benfica
		// Tipo de vari�vel; [] array; nome de variav�l; Inicializa��o; tamanho de vari�vel
		int[] golos = new int[2];
		
		//Atribuir variav�is ao array
		golos[0] = 1;
		// N�o v�lido, pois o array � de inteiros
		//golos[0] = "1";
		golos[1] = 1;
		
		// Instancia��o com inicaliza��o de vari�veis
		int[] portoBenfica   = {1, 1};
	
		//Exercicio de arrays unidimensionais
		int[] sportingArouca = {3, 0};
		int[] maritimoBraga  = {1, 0};
		
		// Array multidimensional;
		int[][] jogosGrandes = new int [3][2];
		jogosGrandes[0][0]   = portoBenfica[0];
		jogosGrandes[1][0] 	 = portoBenfica[1];
		jogosGrandes[0][1]   = sportingArouca[0];
		jogosGrandes[1][1]   = sportingArouca[1];
		jogosGrandes[0][2]   = maritimoBraga[0];
		jogosGrandes[1][2]   = maritimoBraga[1];
		
	}
	

}
