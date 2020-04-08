vogal = ["A", "E", "I", "O", "U"]
xplots = [4, 3, 0, 1, 2]
word = input()
forcas = []
for letter in word:
    if letter in vogal:
        forcas.append(xplots[vogal.index(letter)])
maior = max(forcas)
print(vogal[xplots.index(maior)])