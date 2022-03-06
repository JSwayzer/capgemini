/* 
 * # Quest�o 01
 * 
 * A mediana de uma lista de n�meros � basicamente o elemento que se encontra no meio da lista ap�s a ordena��o. 
 * Dada uma lista de n�meros com um n�mero �mpar de elementos, desenvolva um algoritmo que encontre a mediana.
 * 
 * Exemplo:
 * 
 * Entrada:
 * 
 * arr = [9, 2, 1, 4, 6]
 * 
 * Sa�da:
 * 
 * 4 
 * */

/**
 * @author Johnny Swayzer Assun��o
 *
 */

public class Desafio_2_Questao_01 {

    public static void main(String[] args){

    	/* Declarar as vari�veis que ser�o utilizadas no programa */ 
        int temp;
        int tamanho;
        int mediana;

        /* Criar o array "arr" */
        int[] arr = {6, 5, 15, 3, 2, 1, 9};

        tamanho = arr.length;

        /* Realizar a ordena��o da lista 
         * Executar o la�o enquanto i for menor que o tamanho de arr
         * 
         * */
        for (int i = 0; i < tamanho; i++)
        {
            for (int j = 0; j < tamanho; j++)
            {
            	/* Imprimir a pergunta: array no indice j � maior do que a array no indice i?
                System.out.println(arr[j] + " > " + arr[i] + "?"); */
                if (arr[j] > arr[i])
                {
                    /* Na l�gica abaixo ser� realiza a substitui��o dos valores 
                     * dos indices i e j da array "arr" com auxilio de uma vari�vel tempor�ria, "temp".
                     * Em que temp receber� o valor de arr[j], que � maior do que arr[i].
                     * Na sequ�ncia, valor de arr[j] ser� substitu�do pelo valor de arr[i].
                     * E por �ltimo, arr[i] receber� o valor de temp. 
                     * 
                     * */
                	temp = arr[j];
                	arr[j] = arr[i];
                	arr[i] = temp;
                    
                	/* Imprimir a resposta para a pergunta acima e 
                    System.out.println("Sim!\n Valores trocados.");
                    System.out.println(Arrays.toString(arr)); */
                }
            }
        }
        
        /* 
         * A mediana � encontrada no array "arr" ao se dividir o
         * valor da vari�vel "tamanho" por 2, o valor resultante
         * ser� o �ndice da mediana dentro do array.
         * */
        mediana = arr[tamanho / 2];

        /* Imprimir em tela a mediana da lista informada. */
        System.out.println(mediana);
        
        /* Imprimir a lista j� ordenada
        System.out.println(Arrays.toString(arr)); */
    }

}
