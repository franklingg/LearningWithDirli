operacao = input()
if operacao in "+-*/":
    num1 = float(input())
    num2 = float(input())
    if(operacao == "/" and num2 == 0):
        print("ERRO")
    else:
        if(operacao == "+"): resultado = num1 + num2
        elif(operacao == "-"): resultado = num1 - num2
        elif(operacao == "*"): resultado = num1 * num2
        else: resultado = num1 / num2
        
        print("RESULTADO: {:.1f}".format(resultado))
else:
    print("ENTRADA INVALIDA")