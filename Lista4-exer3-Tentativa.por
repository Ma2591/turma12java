programa
{
	inclua biblioteca Util 
	
	funcao inicio()
	{
		/*
		 * 3.  	Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de
		mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de
		mesma posição das matrizes N1 e N2.
		 */

		//variaveis
		const inteiro linha = 4
		const inteiro coluna = 6
		inteiro l,c = 0
		inteiro N1[l][c] 
		inteiro N2[l][c]
		inteiro M1[l][c]
		inteiro M2[l][c]

		escreva("\n Matriz N1")
		para(l = 0; l<linha; l++)
		{
			para(c = 0; c<coluna; c++)
			{
				N1[l][c] = Util.sorteia(1,9)
				leia(N1[l][c])
			}
		}
					
		escreva("\n Matriz N2")
		para(l = 0; l<linha; l++)
		{
			para(c = 0; c<coluna; c++)
			{
			N2[l][c] = Util.sorteia(1,9)
			leia(N2[l][c])
			}
		}
		
		escreva("\n Matriz M1")
		para(l = 0; l<linha; l++)
		{
			para(c = 0; c<coluna; c++)
			{
				M1[l][c] = (N1[l][c]+N2[l][c])
				M2[l][c] = (N1[l][c]%N2[l][c])
				
			}
		}
		
		escreva("O somatório de N1+N2 é: ",M1[l][c])
		escreva("A diferença entre N1 e N2 é: ",M2[l][c])))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 898; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */