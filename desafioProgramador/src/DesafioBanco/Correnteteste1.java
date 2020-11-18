package DesafioBanco;

import java.util.Scanner;

public class Correnteteste1
{
	
	public static void main(String[] Args)
	{
		Scanner leia = new Scanner(System.in);
		
		char confirmaTalao;
				
				
		do {
		System.out.printf("\nDeseja solicitar novo talão de cheques? S-sim e N-não: ");
		confirmaTalao = leia.next().toUpperCase().charAt(0);
		
			
		if(confirmaTalao=='S') 
		
			{
				System.out.printf("Aguarde a impressão do talão de cheques.");
			}
		
		}while(confirmaTalao=='S');
		
			System.out.printf("Obrigada por utilizar nossos caixas eletrônicos.");
	}
				
}


