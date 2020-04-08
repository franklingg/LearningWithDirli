opcao1 = input()
nome = "pessoa"
presente = "presente"
if opcao1 == "s":
    nome = input()
    opcao2 = input()
    if opcao2 == "s":
        presente = input()
else:
    opcao2 = input()
    if opcao2 == "s":
        presente = input()
        
print("Oi {}, espero que goste de receber {}!\nE Boas Festas!".format(nome, presente))