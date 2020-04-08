gastos = map(int, input().split())
maior1 = max(gastos)
gastos.remove(maior1)
maior2 = max(gastos)

print(maior1+maior2)