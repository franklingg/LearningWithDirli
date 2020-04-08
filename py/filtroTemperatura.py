temp = int(input())
qtd = 0
while temp != 0:
    if temp < 0:
        qtd += 1
    temp = int(input())
print(qtd)