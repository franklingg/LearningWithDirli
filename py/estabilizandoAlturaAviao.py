ideal = int(input())
altura = int(input())
dif = abs(altura-ideal)
while altura != ideal:
    altura = int(input())
    x = dif
    dif = abs(altura-ideal)
    if dif >= x:
        print("PERIGO")
    elif(dif == 0):
        break
    else:
        print("ADEQUADO")
print("OK")