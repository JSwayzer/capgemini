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
            # Caso o retorno da condição seja verdadeiro,
            # será apresentada ao usuário a mensagem pedindo que informe um número maior.
            print("Foi informado o valor 0."
                  "\nPara formar uma escada digite um número maior que zero.")
        # Para qualquer outra situação, será executado o loop for
        else:
            for i in range(n):
                # Será impresso em tela o número de espaços resultante do número informado menos o valor de i menos 1
                # Junto, na mesma linha será impresso o número de asteriscos no tempo i do loop acrescido em 1
                # O parâmetro sep foi configurado para vazio, apenas para que não seja impresso nenhum espaço a mais
                print(" " * (n - i - 1), "*" * (i + 1), sep='')
            print("\nPrograma concluído com sucesso.")
            # Como o programa foi executado com êxito, poderá ser encerrado
            c = 0
    else:
        print("Não foi informado um número."
              "\nPor favor, digite um número.")
