import math

N = int(input())
A = list(map(int, input().split()))

count = [0] * 200

for i in A:
    count[i%200] += 1

combinations = 0

for i in count:
    combinations += i * (i-1) / 2

print(math.floor(combinations))