H, W, X, Y = map(int, input().split())
S=[]

for i in range(H):
    S.append(str(input()))

count = 1
# left
for i in range(1, Y):
    if S[X-1][Y-i-1] == '.':
        count += 1
#        print(X, Y-i)
    else:
        break

# up
for i in range(1, X):
    if S[X-i-1][Y-1] == '.':
        count += 1
#        print(X-i, Y)
    else:
        break

# down
for i in range(1, H-X+1):
    if S[X+i-1][Y-1] == '.':
        count += 1
#        print(X+i, Y)
    else:
        break

# right
for i in range(1, W-Y+1):
    if S[X-1][Y+i-1] == '.':
        count += 1
#        print(X, Y+i)
    else:
        break


print(count)
