N = int(input())

E = 0
for i in range(1, N+1):
    E += N/i
E -= 1

print(E)