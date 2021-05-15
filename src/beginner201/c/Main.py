import math
S = input()

o = []
x = []
q = []

for i in range(10):
    if S[i] == 'o':
        o.append(i)
    elif S[i] == 'x':
        x.append(i)
    else:
        q.append(i)

if len(o) > 4:
    print(0)
else:
    count = 0
    for i in range(10000):
        digits = [i%10, math.floor(i%100/10), math.floor(i%1000/100), math.floor(i%10000/1000)]
        flag = True
        for j in o:
            if (j in digits) == False:
                flag = False
        for j in x:
            if (j in digits) == True:
                flag = False
        if flag == True:
            count += 1
    print(count)
