N, K = map(int, input().split())
A=[list(map(int, input().split())) for i in range(N)]
 
all = []
for i in A:
    all += i
all.sort()
 
left = -1
right = N*N-1 
 
t = K**2//2+1
 
while left+1 < right:
    search = (left + right) // 2
 
    s = [[0]*(N+1) for i in range(N+1)]
    for i in range(N):
        for j in range(N):
            if A[i][j] > all[search]:
                s[i+1][j+1] = 1
            else:
                s[i+1][j+1] = 0
 
    # right
    for i in range(N+1):
        for j in range(N):
           s[i][j+1] += s[i][j]
 
    # down
    for i in range(N):
        for j in range(N+1):
            s[i+1][j] += s[i][j]
 
    # judge
    flag = False
    for i in range(N-K+1):
        for j in range(N-K+1):
            target = s[i][j] - s[i+K][j] - s[i][j+K] + s[i+K][j+K]
            if target < t:
                flag = True
    if flag:
        right = search
    else:
        left = search
 
print(all[right])