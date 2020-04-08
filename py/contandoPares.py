entrada = map(int, input().split())
contador = 0
for valor in entrada:
    if valor % 2 == 0:
        contador += 1
print(contador)