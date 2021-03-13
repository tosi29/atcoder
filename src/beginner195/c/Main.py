N = int(input())

def comma(n):
    if n <= 999:
        return 0
    if 10 ** 3 <= n and n <= 10 ** 6 -1:
        return n-(10 ** 3 -1)
    if 10 ** 6 <= n and n <= 10 ** 9 -1:
        return comma(10 ** 6 - 1) + (n - 10 ** 6 +1) * 2
    if 10 ** 9 <= n and n <= 10 ** 12 - 1:
        return comma(10 ** 9 - 1) + (n - 10 ** 9 +1) * 3
    if 10 ** 12 <= n and n <= 10 ** 15 - 1:
        return comma(10 ** 12 - 1) + (n - 10 ** 12 +1) * 4
    if 10 ** 15 <= n and n <= 10 ** 18 - 1:
        return comma(10 ** 15 - 1) + (n - 10 ** 15 +1) * 5

print(comma(N))
