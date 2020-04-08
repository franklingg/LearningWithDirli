alcool = float(input())
gasolina = float(input())
tanque = int(input())

if alcool >= 0.7 * gasolina:
    print(gasolina * tanque)
else:
    print(alcool * tanque)