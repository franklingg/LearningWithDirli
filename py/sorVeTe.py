pi1 = int(input())
v1 = int(input())
pi2 = int(input())
v2 = int(input())
t = int(input())

posicao1 = pi1 + v1*t
posicao2 = pi2 + v2*t
dist_abs = abs(posicao1 - posicao2)
print(dist_abs)
