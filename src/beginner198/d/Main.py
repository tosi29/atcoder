import itertools

S1 = input()
S2 = input()
S3 = input()

dicset = set()

def convert(S, before, after):
    N = S
    for i in range(len(before)):
        N = N.replace(before[i], after[i])
    return N

for i in [chr(i) for i in range(97, 97+26)]:
    if i in S1 or i in S2 or i in S3:
        dicset.add(i)

if len(dicset) > 10:
    print("UNSOLVABLE")
    exit()

diclist = ''.join(list(dicset))
permlist = itertools.permutations('0123456789', len(dicset))
coeff = [0] * len(diclist)
for i in range(len(diclist)):
    bi = 1
    for j in S1[::-1]:
        if j == diclist[i]:
            coeff[i] += bi
        bi *= 10
    
    bi = 1
    for j in S2[::-1]:
        if j == diclist[i]:
            coeff[i] += bi
        bi *= 10

    bi = 1
    for j in S3[::-1]:
        if j == diclist[i]:
            coeff[i] -= bi
        bi *= 10

for i in permlist:
    count = 0
    for j in range(len(coeff)):
        count += coeff[j] * int(i[j])

    if count != 0:
        continue

    N1 = convert(S1, diclist, i)
    N2 = convert(S2, diclist, i)
    N3 = convert(S3, diclist, i)

    if N1[0] == "0" or N2[0] == "0" or N3[0] == "0":
        continue

    print(N1)
    print(N2)
    print(N3)
    exit()

print("UNSOLVABLE")
