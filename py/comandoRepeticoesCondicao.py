soma = 0
entrada = int(input())
while entrada != -1:
    if entrada % 2 == 0:
        soma += entrada

    entrada = int(input())
print(soma)