certo = int(input())
valor = int(input())
while valor != certo:
    if valor > certo:
        print("MAIOR")
        valor = int(input())
    else:
        print("MENOR")
        valor = int(input())
print("ACERTOU")