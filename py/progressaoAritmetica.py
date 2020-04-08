termo_inicial = int(input())
razao = int(input())
soma=0
for i in range(3):
    termo = termo_inicial + razao * i
    print(termo)
    soma += termo
print(soma)