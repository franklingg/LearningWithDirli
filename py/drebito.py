valor_pg = float(input())
forma_pg = input()
if forma_pg == "debito":
    print(str(valor_pg) + " REAIS NO DEBITO")
else:
    parcela = input()
    if parcela == "s":
        numero_prc = int(input())
        print(str(numero_prc) + " PARCELAS DE " + str(valor_pg / numero_prc) + " REAIS")
    else:
        print(str(valor_pg) + " REAIS NO CREDITO (DIRETO)")