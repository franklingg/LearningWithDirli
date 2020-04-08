lista = input()
while lista != "wally":
    x = lista.split()
    anotherWally = "?"
    for nome in x:
        if len(nome) == 5:
            anotherWally = nome
    print(anotherWally)
    lista = input()
