package ExerciciosLista7;

public class Administrador extends Pessoa {

	private double AjusteCusto;

	public Administrador(String nome, String endereco, String telefone, double ajusteCusto) {
		super(nome, endereco, telefone);
		AjusteCusto = ajusteCusto;
	}

	public double getAjusteCusto() {
		return AjusteCusto;
	}

	public void setAjusteCusto(double ajusteCusto) {
		AjusteCusto = ajusteCusto;
	}
	
	
	
	
}
