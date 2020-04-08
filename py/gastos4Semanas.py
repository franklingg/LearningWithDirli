mes = [map(int,input().split()) for i in range(4)]
for semana in mes:
    total = sum(semana)
    menor = min(semana)
    maior = max(semana)
    print("{} {} {}".format(total, menor, maior))