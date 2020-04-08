palavras = []
tamanhos = []
for i in range(5):
    palavras.append(input())
    tamanhos.append(len(palavras[i]))
maior = palavras[tamanhos.index(max(tamanhos))]
menor = palavras[tamanhos.index(min(tamanhos))]
print(menor)
print(maior)
