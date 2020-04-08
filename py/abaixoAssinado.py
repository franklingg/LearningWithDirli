n=0
rate=0
while True:
    abx_ass = input()
    if(abx_ass == "fim"): break
    rate+= int(abx_ass.split()[1])
    n+=1

print(n)
print(int(rate/n))