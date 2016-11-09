package dia091116;

import java.util.Scanner;
import java.util.Random;

public class Exercicios {

	public Exercicios() {
	}
	
	/*
	 * Peça ao utilizador um número positivo e o programa deve somar todos os número pares do 0 até ao número introduzido pelo utilizador
	 * Apresente a soma
	 */
	
	public void exercicioBasico() {
		
		int num,
			somaPar = 0;
		
		System.out.print("Insira um número positivo: ");
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
		
		System.out.print("\nEscolha um número de 0 a 10: ");
		num = new Scanner(System.in).nextInt();
		System.out.println("\nNúmero do bot: " + v);
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
	 * Pede ao utilizador a quantidade de números x que deseja introduzir [MAXIMO ATÉ 50]
	 * Pede x vezes números ao utlizador (sem repetir, não precisa de fazer um check se ja repetiu, fica por conciencia do utilizador),
	 * compara os números entre si e ordena-los de forma ascendente sem usar funções especificas para isso JAVA apenas usando logica.
	 * Mosta ao utilizador os números ordenados
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
	    	System.out.print("Insira o numero " + (i+1) + " [Até 50, sem repetir] : ");
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
