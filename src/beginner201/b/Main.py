N = int(input())

S=[]
T=[]

for i in range(N):
    Stemp, Ttemp = map(str, input().split())
    S.append(Stemp)
    T.append(int(Ttemp))

T_copy = sorted(T)

for i in range(N):
    if T_copy[N-2] == T[i]:
        print(S[i])
