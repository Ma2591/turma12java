programa
{
	
	funcao inicio()
	{
		//VARIÁVEIS
		real precoProduto = 0.0
		inteiro tP
		real PgtoFinal


		// SAÍDA
		escreva("O preço do produto é: ")
		leia(precoProduto)

		escreva("\nescolha o tipo de pagamento [1]-À vista ou no cheque, [2]-À vista no cartão de crédito, [3]-Parecelado (2X), [3]-Parecelado (3X): ")
		leia(tP)

		//PROCESSAMENTO
		se (tP==1)
		{
			PgtoFinal = precoProduto - ((precoProduto*20)/100)
			escreva("\no valor a pagar é: ", PgtoFinal)
		}
		se (tP==2)
		{
			PgtoFinal = precoProduto - ((precoProduto*15)/100)
			escreva("\no valor a pagar é: ", PgtoFinal)
		}
		se (tP==3)
		{
			PgtoFinal = precoProduto
			escreva("\no valor a pagar é: ", PgtoFinal)
		}
		se (tP==4)
		{
			PgtoFinal = (precoProduto/3)+((precoProduto*10)/100)))
			escreva("\no valor a pagar é: ", PgtoFinal)
		}
		se (tP<=0 ou tP>5)
		{
				escreva("A opção Digitada é inválida")
		}
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */