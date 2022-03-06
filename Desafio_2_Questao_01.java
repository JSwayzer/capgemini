/* 
 * # Questão 01
 * 
 * A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. 
 * Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.
 * 
 * Exemplo:
 * 
 * Entrada:
 * 
 * arr = [9, 2, 1, 4, 6]
 * 
 * Saída:
 * 
 * 4 
 * */

/**
 * @author Johnny Swayzer Assunção
 *
 */

public class Desafio_2_Questao_01 {

    public static void main(String[] args){

    	/* Declarar as variáveis que serão utilizadas no programa */ 
        int temp;
        int tamanho;
        int mediana;

        /* Criar o array "arr" */
        int[] arr = {6, 5, 15, 3, 2, 1, 9};

        tamanho = arr.length;

        /* Realizar a ordenação da lista 
         * Executar o laço enquanto i for menor que o tamanho de arr
         * 
         * */
        for (int i = 0; i < tamanho; i++)
        {
            for (int j = 0; j < tamanho; j++)
            {
            	/* Imprimir a pergunta: array no indice j é maior do que a array no indice i?
                System.out.println(arr[j] + " > " + arr[i] + "?"); */
                if (arr[j] > arr[i])
                {
                    /* Na lógica abaixo será realiza a substituição dos valores 
                     * dos indices i e j da array "arr" com auxilio de uma variável temporária, "temp".
                     * Em que temp receberá o valor de arr[j], que é maior do que arr[i].
                     * Na sequência, valor de arr[j] será substituído pelo valor de arr[i].
                     * E por último, arr[i] receberá o valor de temp. 
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
         * A mediana é encontrada no array "arr" ao se dividir o
         * valor da variável "tamanho" por 2, o valor resultante
         * será o índice da mediana dentro do array.
         * */
        mediana = arr[tamanho / 2];

        /* Imprimir em tela a mediana da lista informada. */
        System.out.println(mediana);
        
        /* Imprimir a lista já ordenada
        System.out.println(Arrays.toString(arr)); */
    }

}
