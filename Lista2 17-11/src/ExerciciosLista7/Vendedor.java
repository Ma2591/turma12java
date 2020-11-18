package ExerciciosLista7;

public class Vendedor extends Pessoa{
		
	private double ValorVendas;
	private double Comissao;
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		ValorVendas = valorVendas;
		Comissao = comissao;
	}
	public double getValorVendas() {
		return ValorVendas;
	}
	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	}
	public double getComissao() {
		return Comissao;
	}
	public void setComissao(double comissao) {
		Comissao = comissao;
	}
	
	public double vencimento() {
		return(this.ValorVendas*this.Comissao)/100;
	}
		
}
