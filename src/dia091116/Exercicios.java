package dia091116;

import java.util.Scanner;
import java.util.Random;

public class Exercicios {

	public Exercicios() {
	}
	
	/*
	 * Pe�a ao utilizador um n�mero positivo e o programa deve somar todos os n�mero pares do 0 at� ao n�mero introduzido pelo utilizador
	 * Apresente a soma
	 */
	
	public void exercicioBasico() {
		
		int num,
			somaPar = 0;
		
		System.out.print("Insira um n�mero positivo: ");
		num = (new Scanner(System.in).nextInt());
		
		for(int i = 0; i < num; i+=2) {
			somaPar += i;
		}
		
		System.out.print(somaPar);
		
	}
	
	/*
	 *  Jogo do par ou impar.
	 */
	
	public void exercicioIntermedio() {
		
		int escolha, num;
		Random r = new Random();
		String palavra = "";
		int v = r.nextInt(10);;
		
		System.out.print("Escolha [0]par ou [1]impar: ");
		escolha = new Scanner(System.in).nextInt();
		
		System.out.print("\nEscolha um n�mero de 0 a 10: ");
		num = new Scanner(System.in).nextInt();
		System.out.println("\nN�mero do bot: " + v);
		System.out.println("Soma = " + (num + v));
		if(escolha == 0) {	
			if((num+v)%2==0) {
				System.out.println("\nGANHASTE");
			}else {
				System.out.println("\nPERDESTE");
			}
		} else {
			if((num+v)%2==1) {
				System.out.println("\nGANHASTE");
			}else {
				System.out.println("\nPERDESTE");
			}
		}
	}
	
	/*
	 * Pede ao utilizador a quantidade de n�meros x que deseja introduzir [MAXIMO AT� 50]
	 * Pede x vezes n�meros ao utlizador (sem repetir, n�o precisa de fazer um check se ja repetiu, fica por conciencia do utilizador),
	 * compara os n�meros entre si e ordena-los de forma ascendente sem usar fun��es especificas para isso JAVA apenas usando logica.
	 * Mosta ao utilizador os n�meros ordenados
	 */
	
	public void exercicioAvancado() {

	    int[] num   	= new int[50],
	          menor 	= new int[50];
	    int   quantNum 	= 0,
	          quantLoop = 0,
	          armazem,
	          numSoma  	= 0;

	    boolean isLower     = true;
	
	    while(quantNum <= 0 || quantNum > 50)
	    {
	        System.out.print("Insira a quantidade de numeros que deseja inserir[MAX 50]: ");
	        quantNum = new Scanner(System.in).nextInt();
	    }

	    for(int i = 0; i < quantNum; i++)
	    {
	    	System.out.print("Insira o numero " + (i+1) + " [At� 50, sem repetir] : ");
	        num[i] = new Scanner(System.in).nextInt();
	        numSoma += num[i];
	    }
	    
	    while(quantLoop < quantNum)
	    {
	        for(int i = 1; i < quantNum; i++)
	        {
	            if(isLower == true)
	            {
	                if(num[0] < num[i])
	                {
	                    isLower = true;
	                }
	                else
	                {
	                    isLower = false;
	                }
	            }
	        }

	        if(isLower == true)
	        {
	            menor[quantLoop] = num[0];
	            for(int x = 0; x < quantNum - 1; x++)
	            {
	                num[x] = num[x + 1];
	            }
	            num[quantNum - 1] = numSoma;
	            quantLoop++;
	        }
	        else
	        {
	            armazem = num[0];
	            for(int x = 0; x < quantNum - 1; x++)
	            {
	                num[x] = num[x + 1];
	            }
	            num[quantNum-1] = armazem;
	        }
	        isLower = true;

	    }

	    System.out.println(" Ordenado:");

	    for(int i = 0; i < quantNum; i++)
	    {
	    	System.out.println(menor[i]);
	    }
	}

}
