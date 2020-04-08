saldo = 1200.0
custoMax = -1
diaAnterior = 0
diasMax = 0

while True:
    evento = input().replace(",", ".").split()
    atividade = " ".join(evento[1:len(evento)-1])
    custo = saldo - float(evento[-1])
    saldo = float(evento[-1])
    if custo > custoMax:
        custoMax = custo
        atividadeMax = atividade
    
    dias = int(evento[0]) - diaAnterior - 1
    diaAnterior = int(evento[0])
    if dias > diasMax:
        diasMax = dias
        
    if(saldo == 0): 
        break
print("MAIOR: {} {}".format(atividadeMax, "{:.2f}".format(custoMax).replace(".", ",")))
print("DIAS: {}".format(diasMax))