pal_ing = []
while True:
    letras = 0
    palavra = input()
    for letra in palavra:
        if letra in 'aeiou':
            letras += 1
    if letras == 0:
        pal_ing.append(palavra)
    if len(pal_ing) >= 3:
        break
for i in range(3):
    print(pal_ing[i])