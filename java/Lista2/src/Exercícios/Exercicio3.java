package Exerc�cios;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] Args) 
	{
		Scanner leia = new Scanner(System.in);
		double num1, num2, num3, num4;
		double pol = 2;
		int x=0;
		double qnum1,qnum2,qnum3,qnum4;
		
		// LEIA OS QUATRO N�MEROS
		System.out.printf("Leia o 1� n�mero: \n");
		num1 = leia.nextDouble();
				
		System.out.printf("Leia o 2� n�mero: \n");
		num2 = leia.nextDouble();
		
		System.out.printf("Leia o 3� n�mero: \n");
		num3 = leia.nextDouble();
		
		System.out.printf("Leia o 4� n�mero: \n");
		num4 = leia.nextDouble();
		
		//ESCREVA O QUADRADO DE UM DOS 4 N�MEROS
		qnum1 = Math.pow(num1, pol);	
		qnum2 = Math.pow(num2, pol);
		qnum3 = Math.pow(num3, pol);
		qnum4 = Math.pow(num4, pol);
		
						
		if(qnum3>=1000) 
		{
			System.out.printf("O 3� ao quadrado �: %2f: ",qnum3);
		}
		else 
		{		
		System.out.printf("Os n�meros digitados s�o: \n%2f\n%2f\n%2f\n%2f\n  \n",num1,num2,num3,num4);
					
		System.out.printf("O 1� ao quadrado �:  %2f\n",qnum1);
		System.out.printf("O 2� ao quadrado �:  %2f\n",qnum2);
		System.out.printf("O 3� ao quadrado �:  %2f\n",qnum3);
		System.out.printf("O 4� ao quadrado �:  %2f\n",qnum4);
		}
		
	}
}
