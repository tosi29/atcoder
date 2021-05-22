N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
C = list(map(int, input().split()))

BC_stat = [0] * (N+1)
count = 0

for i in range(N):
    BC_stat[B[C[i]-1]] += 1

for i in range(N):
    count += BC_stat[A[i]]

print(count)