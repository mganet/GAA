package dia091116;

public class Arrays {

	public Arrays() {
		
		// N de golos num jogo: 
		// Porto-Benfica
		// Tipo de variável; [] array; nome de variavél; Inicialização; tamanho de variável
		int[] golos = new int[2];
		
		//Atribuir variavéis ao array
		golos[0] = 1;
		// Não válido, pois o array é de inteiros
		//golos[0] = "1";
		golos[1] = 1;
		
		// Instanciação com inicalização de variáveis
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
