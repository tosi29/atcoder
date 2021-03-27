N = int(input())
A = list(map(int, input().split()))

def SPLIT(list, n):
    result = 0
    or_result = 0
    for i in range(N):
        or_result |= list[i]
        if n & (1 << i):
            result ^= or_result
            or_result = 0
    result ^= or_result
    return result

min = 2 ** 30
for i in range(2**(N-1)):
    result = SPLIT(A,i)
    if result < min:
        min = result

print(min)

