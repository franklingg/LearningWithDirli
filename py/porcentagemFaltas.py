creditos = int(input())
faltas = int(input())
presenca = int((creditos * 18 - faltas) / (creditos * 18) * 100)
print("{}%".format(presenca))