N = int(input())
A = list(map(int, input().split()))

s = 0
for i in range(N):
    s += A[i] ** 2

s *= N
s -= sum(A) ** 2

print(s)
