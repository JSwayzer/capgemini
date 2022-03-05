/*

# Questão 03

        Um texto precisa ser encriptado usando o seguinte esquema.
        Primeiro, os espaços são removidos do texto.
        Então, os caracteres são escritos em um grid, no qual as linhas e colunas
        tem as seguintes regras:

                            SQRT(T)<=linha<=coluna<=SQRT(T)

    Considere T, como o tamanho do texto.
    Se certifique de que linhas x colunas >=T.
    Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

Exemplos:

Exemplo 1)

Entrada:

s = tenha um bom dia

Saída:

taoa eum nmd hbi

Explicação:

        Depois de remover os espaços, a string tem 13 caracteres.
        SQRT(13) está entre 3 e 4, então a string é rescrita na forma
        de um grid com 4 linhas e 4 colunas:

tenh
aumb
omdi
a

        O resultado é obtido ao mostrar os caracteres de cada coluna, com um
        espaço entre as colunas de texto. A mensagem encriptada é obtida
        ao mostrar os caracteres de cada linha com um espaço entre as colunas.

Exemplo 2)

Entrada:

s = ola mundo

Saída:

omd luo an

Explicação:

        Depois de remover os espaços a string tem 8 caracteres.
        SQRT(8) está entre 2 e 3, então a string é reescrita na forma
        de um grid com 3 linhas e 3 colunas:

ola

mun

do

 */

/**
 * @author Johnny
 *
 */

public class Desafio_2_Questao_03 {
}
