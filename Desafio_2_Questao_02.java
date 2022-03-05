import java.util.Arrays;

/*
 * 
 * # Quest�o 02
 * 
 *      Dado um vetor de inteiros n e um inteiro qualquer x.
 *      Construa um algoritmo que determine o n�mero de elementos
 *      pares do vetor que tem uma diferen�a igual ao valor de x.
 *
 *      Exemplo:
 *      
 *      Entrada:
 *      
 *      n = [1, 5, 3, 4, 2]
 *      
 *      Sa�da:
 *      
 *      3
 *      
 *      Explica��o:
 *      
 *      Existem 3 pares de inteiros no vetor com uma diferen�a de 2: [5, 3], [4, 2] e [3, 1].
 *      
 *      
 */

/**
 * @author Johnny Swayzer Assun��o
 *
 */

public class Desafio_2_Questao_02 
{
	
    public static void main(String[] args)
    {

    	/* Declarar as vari�veis que ser�o utilizadas no programa */ 
        int temp;
        int x;
        int cont = 0;

        /* Criar o array "n" */
        int[] n = {6, 5, 15, 3, 2, 1};
        
        x = 3;
        
        /* Realizar a ordena��o da lista 
         * Executar o la�o enquanto i for menor que o tamanho de n
         * */
        for (int i = 0; i < n.length; i++)
        {
            for (int j = 0; j < n.length; j++)
            {
            	/* Imprimir a pergunta: array no indice j � maior do que a array no indice i?
                System.out.println(n[j] + " > " + n[i] + "?"); */
                if (n[j] > n[i])
                {
                    /* Na l�gica abaixo ser� realiza a substitui��o dos valores 
                     * dos indices i e j da array "n" com auxilio de uma vari�vel tempor�ria, "temp".
                     * Em que temp receber� o valor de n[j], que � maior do que n[i].
                     * Na sequ�ncia, valor de n[j] ser� substitu�do pelo valor de n[i].
                     * E por �ltimo, n[i] receber� o valor de temp. 
                     * */
                	temp = n[j];
                	n[j] = n[i];
                	n[i] = temp;
                    
                	/* Imprimir a resposta para a pergunta acima e 
                    System.out.println("Sim!\n Valores trocados.");
                    System.out.println(Arrays.toString(n)); */ 
                }
            }
        }
        
        /* O trecho de algoritmo abaixo ir� determinar o n�mero de elementos 
         * pares do vetor que tem uma diferen�a igual ao valor de x. 
         * */
        for (int k = 0; k < n.length; k++) 
        {
        	/* O vetor n no passo k ser� somado do valor de x
        	 * e o resultado armazenado na vari�vel temp. */
        	temp = n[k] + x;
        	for (int l = 0; l < n.length; l++) 
        	{
        		/* Verificar se o valor de "temp" ser� igual ao valor do vetor
        		 *  no passo l, em algum momento.
        		 *  Em caso positivo, a vari�vel "cont" ser� acrescida em 1. 
        		 *  */
        		if (temp == n[l]) 
        		{
        			cont += 1;
        		}
        	}
        }
        
        /* Imprimir na tela o valor de cont, que resulta do n�mero do n�mero 
         * de elementos pares do vetor que tem uma diferen�a igual ao valor de x. 
         * */
        System.out.println(cont);
        
    }
}
