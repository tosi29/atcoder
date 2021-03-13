import math

A, B, W = map(int, input().split())

W *= 1000

max = W / A
min = W / B

lcm = A * B / math.gcd(A, B)

# 最小公倍数以上ならば、必ず解あり
if W >= lcm and A != B:
    print(str(math.ceil(min)) + ' ' + str(math.floor(max)))
else:
    min = 1000000000
    max = 0
    for i in range(1, int(W/A)+1):
        if A*i <= W and W <= B*i:
            if min > i:
                min = i
            if max < i:
                max = i
    if max == 0:
        print('UNSATISFIABLE')
    else:
        print(str(min) + ' ' + str(max))
