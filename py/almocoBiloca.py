quantia = float(input())
cafes = int(input())
restante = quantia - 0.5 * cafes
if restante >= 10:
    print("PODE COMER!")
else:
    print("SEM COMIDA HOJE!")