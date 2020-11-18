
public class Aluno 
{
		//atributos da classe
		private int matricula;
		private String nome;
		private char genero;
		private boolean ativo;
		private int anoNascimento;
		
		//construtor
		public Aluno ()
		{
			
		}
		public Aluno (int matricula, String nome)
		{
			this.matricula = matricula;
			this.nome = nome;
		}
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public char getGenero() {
			return genero;
		}
		public void setGenero(char genero) {
			this.genero = genero;
		}
		public int getAnoNascimento() {
			return anoNascimento;
		}
		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}
		
		public String obterGenero() {
		String texto = "";
		if(this.genero == 'M') {
			texto = "Aluno";
		}
		else if(this.genero == 'F'){
		texto = "Aluna";
		}
		else if(this.genero == 'O'){
		texto = "Alune";
		}
			
		return texto;
					
		}
		//atributos da classe
		public int idade() {
				
		return 2020-this.anoNascimento;
		}
		public int idade(int anoAtual) {
				
		return anoAtual - this.anoNascimento;
		//método situação 2 - um jeito de fazer
		}
		public void situacao() {
			this.ativo = true;
			
		}
		// método situação 2 - outro jeito de fazer
		public void situacao(char status) {
			if(status=='A') {
				this.ativo = true;
				
			}
			else {
				this.ativo = false;
			}
		}
}
