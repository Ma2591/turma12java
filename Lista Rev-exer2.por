programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/* 
		 * 2- O IMC – Índice de Massa Corporal é um critério da Organização 
		  Mundial de Saúde para dar uma indicação sobre a condição de peso de uma 
		  pessoa adulta. A fórmula é IMC = peso / ( altura )2.
		  Elabore um programa que leia o peso e a altura de um adulto e mostre sua 
		  condição de acordo com a tabela abaixo.
			IMC em adultos Condição
			1)Abaixo de 18,5 Abaixo do peso
			2)Entre 18,5 e 25 Peso normal
			3)Entre 25 e 30 Acima do peso
			4)Acima de 30 obeso

		 */

		//VARIÁVEIS

		real peso =0.0
		real altura =0.0
		cadeia condicao
		real imc 
		cadeia nome

		//ENTRADAS
			escreva("Digite seu nome: ")
			leia(nome)

				escreva("\nSeja bem vindo ",nome,"\n")
			
			escreva("\nindique peso: ")
			leia(peso)

			escreva("\nindique altura: ")
			leia(altura)

			// FAZENDO APENAS O QUADRADO DA ALTURA(POTÊNCIA)
			real alturaaoQuadrado 
			real expoente =2.0

			alturaaoQuadrado = Matematica.potencia((altura),expoente)

			// FAZENDO O IMC
			imc = peso / alturaaoQuadrado

			// FAZENDO APENAS O ARREDONDAMENTO DE CASAS DECIMAIS
			real casas =2.0
			real arred

			arred = Matematica.arredondar(imc,casas)
			
			//condição4
			se (arred >30.0)
			{
				escreva("\nseu índice de massa corpórea é: ",arred,","," cuidado você está obeso(a).")
			}
			//condição1
			se (arred<18.5)
			{
				escreva("\nseu índice de massa corpórea é: ",arred,","," está abaixo do normal.")
			}
			//condição2
			se(arred >= 18.5 e arred < 25)
			{
				escreva("\nseu índice de massa corpórea é: ",arred,","," está dentro do normal.")
			}
			//condicão3
			se (arred >= 25.0 e arred <=30)
			{
				escreva("\nseu índice de massa corpórea (IMC) é: ",arred,","," cuidado está acima do normal.")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1619; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */