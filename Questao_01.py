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
while c != 0:  # enquanto a variável c for diferente de 0 o programa deverá continuar em execução
    n = input("Digite um número: ")  # Receber o número informado pelo usuário
    if n.isdigit():  # Verificar se o valor recebido é um número
        n = int(n)  # Realizar o cast da variável n do tipo string para tipo inteiro
        if n < 1:  # verificar se o número informado é menor que um
            # Caso o retorno da condição seja verdadeiro, será apresentado ao usuário a mensagem pedindo que informe um número maior.
            print("Foi informado o valor 0."
                  "\nPara formar uma escada digite um número maior que zero.")
        # Para qualquer outra situação, será executado o loop for
        else:
            for i in range(n):
                print(" " * (n - i - 1), "*" * (i + 1), sep='')
            print("\nPrograma concluído com sucesso.")
            c = 0
    else:
        print("Não foi informado um número."
              "\nPor favor, digite um número.")
