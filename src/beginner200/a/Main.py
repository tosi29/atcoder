import math

N = int(input())

result = math.floor(N/100)
if N%100 != 0:
    result += 1

print(result)