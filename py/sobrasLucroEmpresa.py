lucro = int(input())
funcionarios = int(input()) 
preco_balinha = float(input())
balinhas = int((lucro % funcionarios) / preco_balinha)
print(balinhas)
