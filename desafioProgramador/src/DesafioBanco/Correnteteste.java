package DesafioBanco;

import java.util.Scanner;

public class Correnteteste
{
	
	public static void main(String[] Args)
	{
		Scanner leia = new Scanner(System.in);
		double saldo=0;
		int talao,conta;
		String CPF;
		char opcao;
		final int valor=1000;
		int maximo=0;
		
		do {
			
		System.out.printf("Digite a op��o de transa��o di�ria C-cr�dito e D-d�bito: \n"); // ENTRE COM OP��O TRANSA��O
		opcao = leia.next().toUpperCase().charAt(0); // LEIA A OP��O TRANSA��O
		maximo++;
		if (opcao == 'C') 
		{
			saldo = valor+saldo;
		}
		else if(opcao == 'D') 
		{
			saldo = valor-saldo;
		}
		else 
		{
			maximo--;
			System.out.printf("\nDigite uma op��o de transa��o v�lida: \n"); // AVISE OP��O INV�LIDA
		}
		}
		while (maximo<10);
		
		System.out.printf("\nVoc� excedeu o n�mero m�ximo de 10 transa��es di�rias. "); //AVISO BATEU O LIMITE
				
	}

}