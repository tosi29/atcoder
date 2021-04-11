import bisect

n = int(input())
A = []

for i in range(n):
    A.append(int(input()))

colors = [-1] * n
length = 0

for i in A:
    target_index = bisect.bisect_left(colors, i, n-length, n) - 1
    colors[target_index] = i
    if target_index < n-length:
        length += 1

print(length)
