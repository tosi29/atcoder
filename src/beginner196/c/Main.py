string = input()
N = int(string)
count = 0

for i in range(1,1000000):
    num = int(str(i) + str(i))
    if num <= N:
        count += 1

print(count)
