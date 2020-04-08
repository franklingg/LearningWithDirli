contador = 0;
for i in range(5):
    word = input()
    if word[0] in 'aeiou':
        contador += 1
print(contador)