casa = []
convidado = []
while True:
    evento = input().split()
    if evento[1] == "FIM":
        break
    if evento[-1] == "CASA":
        casa.append(evento[1])
    elif(evento[-1] == "CONVIDADO"):
        convidado.append(evento[1])

print(str(casa.count("GOL")) + " GOL CASA")
print(str(convidado.count("GOL")) + " GOL CONVIDADO")
print(str(casa.count("FALTA")) + " FALTA CASA")
print(str(convidado.count("FALTA")) + " FALTA CONVIDADO")