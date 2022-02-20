# # Questão 01
#
# Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
# A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
# Exemplo:
# Entrada:
# n = 6
#
#
# Saída:
#      *
#     **
#    ***
#   ****
#  *****
# ******

c = -1
while c != 0:
    n = input("Digite um número: ")
    if n.isdigit():
        n = int(n)
        if n < 1:
            print("Foi informado o valor 0."
                  "\nPara formar uma escada digite um número maior que zero.")
        else:
            for i in range(n):
                print(" " * (n - i - 1), "*" * (i + 1), sep='')
            print("\nPrograma concluído com sucesso.")
            c = 0
    else:
        print("Não foi informado um número."
              "\nPor favor, digite um número.")
