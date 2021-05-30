N, K = map(int, input().split())

class Friend:
    village = 0
    money = 0

friends = [None] * N

for i in range(N):
    A, B = map(int, input().split())
    f = Friend()
    f.village = A
    f.money = B
    friends[i] = f

sorted_friends = sorted(friends, key=lambda x: x.village)

for friend in sorted_friends:
    if friend.village <= K:
        K += friend.money
    else:
        break
    
print(K)