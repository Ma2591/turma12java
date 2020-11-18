package ExerciciosLista7;

public class FornecedorTeste {

	public static void main(String[] Args) {
		
		Fornecedor meuFornecedor = new Fornecedor ("Mari", "Rua hum", "555-55", 1000, 200);
						
		System.out.println(meuFornecedor.getNome());
		System.out.println(meuFornecedor.getEndereco());
		System.out.println(meuFornecedor.getTelefone());
		
		System.out.println(meuFornecedor.ObterSaldo());
	}
}
