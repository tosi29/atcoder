import bisect

n = int(input())
A = []

for i in range(n):
    A.append(int(input()))

colors = [A[0]]
for i in A[1:]:
    target_index = bisect.bisect_left(colors, i) - 1
    if target_index < 0:
        colors.insert(0, i)
    elif colors[target_index] < i:
        colors[target_index] = i

print(len(colors))
