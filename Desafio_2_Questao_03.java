import java.util.Arrays;

/*
 * # Quest?o 03
 * 
 * Um texto precisa ser encriptado usando o seguinte esquema. 
 * Primeiro, os espa?os s?o removidos do texto. 
 * Ent?o, os caracteres s?o escritos em um grid, no qual as linhas e 
 * colunas tem as seguintes regras:
 * 
 *               SQRT(T)<=linha<=coluna<=SQRT(T)
 * 
 *     Considere T, como o tamanho do texto.
 *     Se certifique de que linhas x colunas >= .
 *     Se m?ltiplos grids satisfazem as condi??es, escolha aquele com a menor ?rea.
 * 
 * Escreva um algoritmo que ao receber uma string s, mostre a mensagem 
 * encriptada de acordo com as regras descritas.
 * 
 * Exemplos:
 * 
 * Exemplo 1)
 * 
 * Entrada:
 * 
 * s = tenha um bom dia
 * 
 * Sa?da:
 * 
 * taoa eum nmd hbi
 * 
 * Explica??o:
 * 
 *         Depois de remover os espa?os, a string tem 13 caracteres. S
 *         QRT(13) est? entre 3 e 4, ent?o a string ? rescrita na forma de um 
 *         grid com 4 linhas e 4 colunas:
 * 
 * tenh
 * aumb
 * omdi
 * a
 * 
 *         O resultado ? obtido ao mostrar os caracteres de cada coluna, 
 *         com um espa?o entre as colunas de texto. A mensagem encriptada ? obtida 
 *         ao mostrar os caracteres de cada linha com um espa?o entre as colunas.
 * 
 * Exemplo 2)
 * 
 * Entrada:
 * 
 * s = ola mundo
 * 
 * Sa?da:
 * 
 * omd luo an
 * 
 * Explica??o:
 * 
 *         Depois de remover os espa?os a string tem 8 caracteres. 
 *         SQRT(8) est? entre 2 e 3, ent?o a string ? reescrita na forma 
 *         de um grid com 3 linhas e 3 colunas:
 * 
 * ola
 * 
 * mun
 * 
 * do
 *   
 *  */

/**
 * @author Johnny S Assun??o
 *
 */

public class Desafio_2_Questao_03 
{
	
    public static void main(String[] args)
    {

    	/* Declarar as vari?veis que ser?o utilizadas no programa */ 
    	String s;
    	String r;
    	int raiz;
        int t;
        
    	s = ("ola mundo");
    	
    	/* Substituir os espa?os por "vazio" */
    	r = s.replace(" ", "");
    	
    	/* A vari?vel "t" recebe o valor do tamanho do texto, ap?s remover os
    	 * espa?os.
    	 *  */
    	t = r.length();
    	
    	/*
    	 * Calcular a raiz do tamanho do texto com a fun??o Math.sqrt.
    	 * Usar a fun??o Math.round para arredondar o resultado do c?lculo. 
    	 * E realizar o cast do valor encontrado de double para int. 
    	 * 
    	 * */
    	raiz = (int) Math.round(Math.sqrt(t));
    	
    	/*
    	 *  Explica??o sobre o String regex utilizado abaixo para dividir o texto em
    	 *  trecho de acordo com o resultado da raiz do tamanho do texto.
    	 *  
    	 *  (?<=)  - Express?o para procurar pelo padr?o correspondente
    	 *  \G     - Limite do padr?o correspondente.
    	 *  .      - O ponto significa qualquer caracter.
    	 *  {raiz} - Entre os colchetes ? informado o valor da raiz.
    	 *  
    	 *  Tudo isso se traduz em trazer quaisquer caracteres dentro do
    	 *  n?mero encontrado pelo c?lculo da raiz. 
    	 *  
    	 *  Ser? feita a procura pelos padr?es do regex no texto informado pela 
    	 *  vari?vel "r" e os resultados armazenados no vetor "separar" 
    	 *  
    	 *  */
    	String[] separar = r.split("(?<=\\G.{"+raiz+"})");
    	
    	/* Executar o la?o enquanto "i" for menor que o tamanho de "separar" */
    	for (int i = 0; i < separar.length; i++) 
    	{
    		/* Imprimir os espa?os correspondentes ? matriz linhas x colunas. */
    		System.out.print(" ");
    		
    		/* Verificar o tamanho de cada Sting de cada ?ndice do vetor 
    		System.out.print(separar[i].length() + "-");*/
    		
    		/* 
    		 * Para que posso executar o la?o abaixo, sem que ocorra problema
    		 * de ?ndice fora do s?rie, ? utilizado o tamanho do array no passo "i".
    		 * Isso porque dessa forma o la?o ser? vari?vel de acordo com o
    		 * tamanho da Sting de cada ?ndice do vetor.
    		 * 
    		 * */
    		for (int j = 0; j < separar[i].length(); j++)
    		{
    			/* 
    			 * Imprimir em tela cada indice do array "separar" no passo "j" 
    			 * pegando apenas o caracter no passo "i" com uso da fun??o 
    			 * charAt que retorna o valor no ?ndice informado, neste caso
    			 * ? o valor de "i".
    			 * 
    			 * */
    			//System.out.println(separar[i].charAt(j) + "\t" + i + "\t" + j);
    			System.out.print(separar[j].charAt(i));
    		}
    	}
    }
}
