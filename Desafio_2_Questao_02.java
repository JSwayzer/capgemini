import java.util.Arrays;

/*
 * 
 * # Questão 02
 * 
 *      Dado um vetor de inteiros n e um inteiro qualquer x.
 *      Construa um algoritmo que determine o número de elementos
 *      pares do vetor que tem uma diferença igual ao valor de x.
 *
 *      Exemplo:
 *      
 *      Entrada:
 *      
 *      n = [1, 5, 3, 4, 2]
 *      
 *      Saída:
 *      
 *      3
 *      
 *      Explicação:
 *      
 *      Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].
 *      
 *      
 */

/**
 * @author Johnny Swayzer Assunção
 *
 */

public class Desafio_2_Questao_02 
{
	
    public static void main(String[] args)
    {

    	/* Declarar as variáveis que serão utilizadas no programa */ 
        int temp;
        int x;
        int cont = 0;

        /* Criar o array "n" */
        int[] n = {6, 5, 15, 3, 2, 1};
        
        x = 3;
        
        /* Realizar a ordenação da lista 
         * Executar o laço enquanto i for menor que o tamanho de n
         * */
        for (int i = 0; i < n.length; i++)
        {
            for (int j = 0; j < n.length; j++)
            {
            	/* Imprimir a pergunta: array no indice j é maior do que a array no indice i?
                System.out.println(n[j] + " > " + n[i] + "?"); */
                if (n[j] > n[i])
                {
                    /* Na lógica abaixo será realiza a substituição dos valores 
                     * dos indices i e j da array "n" com auxilio de uma variável temporária, "temp".
                     * Em que temp receberá o valor de n[j], que é maior do que n[i].
                     * Na sequência, valor de n[j] será substituído pelo valor de n[i].
                     * E por último, n[i] receberá o valor de temp. 
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
        
        /* O trecho de algoritmo abaixo irá determinar o número de elementos 
         * pares do vetor que tem uma diferença igual ao valor de x. 
         * */
        for (int k = 0; k < n.length; k++) 
        {
        	/* O vetor n no passo k será somado do valor de x
        	 * e o resultado armazenado na variável temp. */
        	temp = n[k] + x;
        	for (int l = 0; l < n.length; l++) 
        	{
        		/* Verificar se o valor de "temp" será igual ao valor do vetor
        		 *  no passo l, em algum momento.
        		 *  Em caso positivo, a variável "cont" será acrescida em 1. 
        		 *  */
        		if (temp == n[l]) 
        		{
        			cont += 1;
        		}
        	}
        }
        
        /* Imprimir na tela o valor de cont, que resulta do número do número 
         * de elementos pares do vetor que tem uma diferença igual ao valor de x. 
         * */
        System.out.println(cont);
        
    }
}
