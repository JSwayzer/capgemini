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
palavra = input("Digita a palavra a ser verificada: ")
lista = list(palavra)  # realizar o cast da variável palavra do tipo string para list
tamanho = len(lista)  # determinar o tamanho da variável ajudará a determinar o número de testes a ser realizado
for i in range(len(lista)):
    print(lista[i])

# Verificar um caracter por vez

# Verificar dois caracteres por vez

