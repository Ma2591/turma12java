package ExerciciosLista7;

import java.util.Scanner;

public class EmpregadoTeste {
	
	public static void main(String[] Args) {
		
		Empregado Empregado = new Empregado("Mari", "rua hum", "555-55", 1, 1000, 300);
		System.out.println(Empregado.getNome());
		System.out.println(Empregado.getEndereco());
		System.out.println(Empregado.getTelefone());
		System.out.println("Setor: "+Empregado.getCodigoSetor());
		System.out.println("Salario: "+Empregado.getSalarioBase());
		System.out.println("Salario: "+Empregado.getImposto());
		System.out.println("Resultado: "+Empregado.calcularSalario());
		
		
		
}
}
