# # Questão 03
# Duas palavras podem ser consideradas anagramas de si mesmas
# se as letras de uma palavra podem ser realocadas para formar a outra palavra.
# Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
# Exemplo:
# Exemplo 1)
# Entrada:
# ovo
# Saída:
# 2
# Explicação:
# A lista de todos os anagramas pares são:
# [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente.
#
# Exemplo 2)
# Entrada:
# ifailuhkqq
# Saída:
# 3
# Explicação:
# A lista de todos os anagramas pares são:
# [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].


# Receber a palavra a ser testada para identificar quantos anagramas
palavra = input("Informe a palavra a ser verificada: ")
# realizar o cast da variável palavra do tipo string para list
lista = list(palavra)
# determinar o tamanho da variável ajudará a determinar o número de testes a ser realizado
tamanho = len(lista)
# inicializa o contador em zero
contador = 0

# verificar caracter por caracter
for i in range(len(lista)):
    for j in range(1+i, len(lista)):
        # Caso o caracter no tempo i do primeiro loop seja igual caracter no momento j do segundo loop
        # A variável contador será acrescido em 1
        if lista[i] == lista[j]:
            contador += 1

# Correr a lista com os loops para verificar as possibilidades de anagramas na palavra informada
for i in range(len(lista)):
    for j in range(1+i, len(lista)):
        # Inicializar a variável com a substring na posição inicial i da lista com o posição final em j
        substring1 = (palavra[i:j])
        # Inicializar a variável com a substring na posição inicial i+1 da lista com o posição final em j+1
        substring2 = (palavra[i+1:j+1])
        # Verificar se substring1 é anagrama da substring2
        if sorted(substring1) == sorted(substring2):
            contador += 1
print(contador)
