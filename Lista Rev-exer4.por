programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*	Objetivo: 4)	Faça um programa que calcula e escreve a seguinte soma:
		 * 		soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50	
		 */

		// VARIÁVEIS
		real soma = 0.0
		real divisao = 0.0
		real x = -1.0
		real y= 0.0
		
		
		//PROCESSAMENTOS
		
		//PROCESS
		x = x + 2 // definição ímpares
		y = y + 1 //definição sequênciais
		
		enquanto (x<=98.00)
		{
			divisao = x/y
						
			//PROCESS
			x = x + 2 // definição ímpares
				
			y = y + 1 //definição sequênciais
				

//PROCESS
		divisao = x/y
					
		soma = soma + divisao
						
		}
		
			// ARREDONDAMENTO DECIMAL
			real arred

			arred = Matematica.arredondar(soma,3)
			escreva("\na soma das divisões fracionárias é: ",arred+1"\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */