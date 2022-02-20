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

# verificar 1 por 1
for i in range(len(lista)):
    # print(lista[i])
    # verificar se lista[i] ocorre novamente na lista
    for j in range(1+i, len(lista)):
        # print(lista[i], lista[j])
        if lista[i] == lista[j]:
            contador += 1

# verificar substring da palavra para encontrar anagramas
# Tamanho Máximo do Anagrama
tma = tamanho // 2
for i in range(len(lista)):
    for j in range(1+i, len(lista)):
        anagrama1 = (palavra[i:j])
        print(palavra[i:j])
        anagrama2 = (palavra[i+1:j+1])
        print(palavra[i+1:j+1])
        # anagrama = palavra[i:tma]
        # s2 = "silent"
        if sorted(anagrama1) == sorted(anagrama2):
            contador += 1
    print(contador)
