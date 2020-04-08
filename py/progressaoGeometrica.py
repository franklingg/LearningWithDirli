termo_init = int(input())
razao = int(input())
multiply = 1
for i in range(3):
    termo = termo_init * razao ** i
    print(termo)
    multiply *= termo
print(multiply)