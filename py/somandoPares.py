entrada = map(int, input().split())
soma = 0

for numero in entrada:
    if numero % 2 == 0:
        soma += numero
print(soma)