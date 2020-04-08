valor = float(input())
for i in range(3):
    inflacao = float(input())
    valor *= (1+inflacao)
print(valor)