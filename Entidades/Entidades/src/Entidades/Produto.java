package Entidades;

public class Produto 
{
	//construtor completo
	public String tipo;
	public int vezes;
	public double valor;
	public int data;
	public Produto(String tipo, int vezes, double valor, int data) {
		super();
		this.tipo = tipo;
		this.vezes = vezes;
		this.valor = valor;
		this.data = data;
	}
	public Produto() 
	{
		
	}
	
}
