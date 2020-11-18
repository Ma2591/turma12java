package DesafioBanco;

import java.util.Scanner;

public class Corrente 
{
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		double saldo=0;
		int talao,conta;
		String CPF;
		final int valor;
		int maximo=0;
		int codigo=200;
		String tipoConta;
		char confirmaTalao;
		char opcao;
				
				
		System.out.printf("SALDO : R$%.2f",saldo);		
		do
		{
			maximo++;
			System.out.print("\nDIGITE C PARA CRÉDITO OU D PARA DÉBITO : ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println();
			if (opcao == 'C')
			{
				System.out.printf("Gostaria de creditar qual valor?");
				valor = leia.nextInt();
				saldo = saldo+valor;
				System.out.printf("SALDO : R$%.2f",saldo);
			}
			else if(opcao == 'D')
			{
				System.out.printf("Gostaria de debitar qual valor?");
				valor = leia.nextInt();
				if (valor > saldo)
				{
					System.out.printf("Saldo insuficiente, limite de transações inalterado");
					maximo--;
				}
				else
				{
					
					saldo = saldo-valor;
				System.out.printf("SALDO : R$%.2f",saldo);
				}
			}while
		}
}