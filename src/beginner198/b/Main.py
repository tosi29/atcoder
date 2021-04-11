n = input()

if n == n[::-1]:
    print("Yes")
    exit()

for i in range(10):
    n = "0" + n
    if n == n[::-1]:
        print("Yes")
        exit()

print("No")
