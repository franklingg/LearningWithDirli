alunos = input()
notas = []
while alunos != "-":
    notas.append(int(alunos.split()[1]))
    alunos = input()
acima = 0
for valor in notas:
    if valor >= 700:
        acima += 1
print("maior: " + str(max(notas)))
print("menor: " + str(min(notas)))
print("media: " + str(int(sum(notas)/len(notas))))
print("acima: " + str(acima))
print("abaixo: " + str(len(notas) - acima))