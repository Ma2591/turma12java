package ExerciciosLista7;

public class Operario extends Pessoa {

	private double valorProducao;
	private double Comissao;
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		Comissao = comissao;
		
		
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return Comissao;
	}
	public void setComissao(double comissao) {
		Comissao = comissao;
	}
	
	public double salario() {
		return (this.valorProducao*this.Comissao/100);
	}
}
	

