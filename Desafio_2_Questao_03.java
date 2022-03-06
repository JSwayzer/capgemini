import java.util.Arrays;

/*
 * # Questão 03
 * 
 * Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:
 * 
 * <=linha<=coluna<=
 * 
 *     Considere T, como o tamanho do texto.
 *     Se certifique de que linhas x colunas >= .
 *     Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
 * 
 * Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.
 * 
 * Exemplos:
 * 
 * Exemplo 1)
 * 
 * Entrada:
 * 
 * s = tenha um bom dia
 * 
 * Saída:
 * 
 * taoa eum nmd hbi
 * 
 * Explicação:
 * 
 * Depois de remover os espaços, a string tem 13 caracteres.  está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:
 * 
 * tenh
 * aumb
 * omdi
 * a
 * 
 *         O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.
 * 
 * Exemplo 2)
 * 
 * Entrada:
 * 
 * s = ola mundo
 * 
 * Saída:
 * 
 * omd luo an
 * 
 * Explicação:
 * 
 *         Depois de remover os espaços a string tem 8 caracteres.  está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:
 * 
 * ola
 * 
 * mun
 * 
 * do
 *   
 *  */

/**
 * @author Johnny Swayzer Assunção
 *
 */

public class Desafio_2_Questao_03 
{
	
    public static void main(String[] args)
    {

    	/* Declarar as variáveis que serão utilizadas no programa */ 
    	String s;
    	String r;
    	int raiz;
        int t;
        
    	s = ("tenha um bom dia minha gostosa");
    	
    	r = s.replace(" ", "");
    	
    	t = r.length();
    	
    	/*
    	 * Calcular a raiz do tamanho do texto com a função Math.sqrt.
    	 * Usar a função Math.round para arredondar o resultado do cálculo. 
    	 * E realizar o cast do valor encontrado de double para int. 
    	 * 
    	 * */
    	raiz = (int) Math.round(Math.sqrt(t));
    	
    	/*
    	 *  Explicação sobre o String regex utilizado abaixo para dividir o texto em
    	 *  trecho de acordo com o resultado da raiz do tamanho do texto.
    	 *  
    	 *  (?<=)  - Expressão para procurar pelo padrão correspondente
    	 *  \G     - Limite do padrão correspondente.
    	 *  .      - O ponto significa qualquer caracter.
    	 *  {raiz} - Entre os colchetes é informado o valor da raiz.
    	 *  
    	 *  Tudo isso se traduz em trazer quaisquer caracteres dentro do
    	 *  número encontrado pelo cálculo da raiz. 
    	 *  
    	 *  Será feita a procura pelos padrões do regex no texto informado pela 
    	 *  variável "r" e os resultados armazenados no vetor "separar" 
    	 *  
    	 *  */
    	String[] separar = r.split("(?<=\\G.{"+raiz+"})");
    	
    	for (int i = 0; i < separar.length; i++) 
    	{
    		for (int j = 0; j < raiz; j++)
    		{
    			System.out.println(separar[i] + "\t" + i + "\t" + j);
    		}
    	}

    	//System.out.println(r);
    	System.out.println(Arrays.toString(separar));
    	
    	
    	
    }
}
