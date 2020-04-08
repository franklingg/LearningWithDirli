ids = [int(input()) for i in range(4)]
words = [input() for i in range(4)]
for i in range(len(words)):
    print(words[i][ids[i]], end = "")