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
			
		System.out.printf("Digite a opção de transação diária C-crédito e D-débito: \n"); // ENTRE COM OPÇÃO TRANSAÇÃO
		opcao = leia.next().toUpperCase().charAt(0); // LEIA A OPÇÃO TRANSAÇÃO
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
			System.out.printf("\nDigite uma opção de transação válida: \n"); // AVISE OPÇÃO INVÁLIDA
		}
		}
		while (maximo<10);
		
		System.out.printf("\nVocê excedeu o número máximo de 10 transações diárias. "); //AVISO BATEU O LIMITE
				
	}

}