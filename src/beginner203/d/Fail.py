import bisect

# This code failed due to TLE.
# It takes about 2.2 seconds.

N, K = map(int, input().split())
A=[list(map(int, input().split())) for i in range(N)]

current = []
current_history = [None] * (N-K+1)

for i in range(K):
    for j in range(K):
        bisect.insort_left(current, A[i][j])
min = current[len(current)-K*K//2-1]
current_history[0] = current.copy()

# right shift
for a in range(N-K):
    for i in range(K):
        current.remove(A[a][i])
        bisect.insort_left(current, A[K+a][i])
    center = current[len(current)-K*K//2-1]
    if center < min:
        min = center
    current_history[a+1] = current.copy()

# down shift
for a in range(N-K+1):
    current = current_history[a]
    for b in range(N-K):
        for i in range(K):
            current.remove(A[a+i][b])
            bisect.insort_left(current, A[a+i][K+b])
        center = current[len(current)-K*K//2-1]
        if center < min:
            min = center

print(min)
    
