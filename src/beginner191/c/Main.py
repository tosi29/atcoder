H, W = map(int, input().split())
S=[list(map(str,list(input()))) for i in range(H)]

kaku = 0

for i in range(H-1):
    for j in range(W-1):
        count = 0
        if S[i][j] == '#':
            count += 1
        if S[i+1][j] == '#':
            count += 1
        if S[i][j+1] == '#':
            count += 1
        if S[i+1][j+1] == '#':
            count += 1
        if count == 1 or count == 3:
            kaku += 1
        
print(kaku)
