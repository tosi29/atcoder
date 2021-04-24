N = int(input())
S = list(input())
Q = int(input())
NN = N*2

shift = 0
for i in range(Q):
    T, A, B = map(int, input().split())
    if T == 1:
        temp = S[(A-1+shift)%NN]
        S[(A-1+shift)%NN] = S[(B-1+shift)%NN]
        S[(B-1+shift)%NN] = temp
    else: # T == 2
        shift += N
        shift %= NN

if shift == N:
    S = S[N:NN] + S[0:N]

print(''.join(S))