receitas = map(int, input().split())
despesas = map(int, input().split())


lucro_pos = 0
lucro_neg = 0
for i in range(len(receitas)):
    lucro = receitas[i] - despesas[i]
    if lucro > 0:
        lucro_pos += lucro
    else:
        lucro_neg += lucro
        
print(lucro_pos)
print(lucro_neg)