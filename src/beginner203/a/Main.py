X = list(map(int, input().split()))

if X[0] == X[1]:
    print(X[2])
elif X[1] == X[2]:
    print(X[0])
elif X[0] == X[2]:
    print(X[1])
else:
    print(0)
