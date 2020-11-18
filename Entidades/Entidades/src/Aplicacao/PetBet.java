package Aplicacao;

import java.util.Scanner;

import Entidades.Pessoa;

public class PetBet 
{

	public static void main(String[] Args) 
	{
		
		Scanner leia = new Scanner(System.in); // leia objeto do tipo Scanner
		Pessoa cliente = new Pessoa("ED", "FICIO"); // instanciar - criar objeto tipo pessoa
		
		System.out.println(cliente.nome);
		System.out.println(cliente.sobrenome);
		System.out.println("Digite o sobrenome");
		cliente.sobrenome = leia.nextLine();
		System.out.println(cliente.nome);
		System.out.println(cliente.sobrenome);
		
	}
	
	
}
