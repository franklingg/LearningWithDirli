valores = input()
valuesList = map(int, valores.split())
media = sum(valuesList) / len(valuesList)
acima = []
for valor in valuesList:
    if valor > media:
        acima.append(str(valor))
print(" ".join(acima))