import math

R, X, Y = map(int, input().split())

d2 = (X ** 2 + Y ** 2)
result = (X ** 2 + Y ** 2) / (R ** 2)
result = math.ceil(math.sqrt(result))

if d2 == R**2:
    print(1)
elif d2 <= R**2 *2:
    print(2)
else:
    print(result)