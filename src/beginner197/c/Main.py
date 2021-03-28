N = int(input())
A = list(map(int, input().split()))

def search(list, n):
    xor_result = 0
    or_result = 0
    for i in range(N):
        or_result |= list[i]
        if n & (1 << i):
            xor_result ^= or_result
            or_result = 0
    xor_result ^= or_result
    return xor_result

min = 2 ** 30
for i in range(2**(N-1)):
    result = search(A, i)
    if result < min:
        min = result

print(min)
