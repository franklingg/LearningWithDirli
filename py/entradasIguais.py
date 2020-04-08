n1, n2, n3 = int(input()), int(input()), int(input())
if n1 == n2 and n1 == n3:
    print(3)
elif n1 == n2 or n1 == n3 or n2 == n3:
    print(2)
else:
    print(0)