import sys
sys.setrecursionlimit(10**6)    # limit of recursive call

n = int(input())
c = list(map(int, input().split()))
c.insert(0, 0) # dummy

visited = [0] * (n+1)
colors = [0] * 100001

ans = set()

class Node:
    def __init__(self):
        self.child_node = []

    def add(self, node):
        self.child_node.append(node)

def dfs(node_index):
    if visited[node_index] == 1:
        return

    if colors[c[node_index]] == 0:
        ans.add(node_index)
    
    colors[c[node_index]] += 1
    visited[node_index] = 1
    for i in node_list[node_index].child_node:
        dfs(i)
    visited[node_index] = 0
    colors[c[node_index]] -= 1
    return 

node_list = [Node()]
for i in range(n+1):
    node_list.append(Node())

for i in range(n-1):
    a, b = list(map(int, input().split()))
    node_list[a].add(b)
    node_list[b].add(a)

dfs(1)

ans_list = list(ans)
ans_list.sort()

for i in ans_list:
    print(i)
