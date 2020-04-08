valor_inicial = int(input())
valor_total = int(input())
parcelas = int(input())
restante= int((valor_total - valor_inicial) / parcelas)
if restante >= 1000:
    print("ALTO ({})".format(restante))
else:
    print("BAIXO ({})".format(restante))