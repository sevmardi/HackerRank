from itertools import permutations

s = list(map(str, input().split()))
string, number = sorted(s[0]), int(s[1])
print(*list(map(''.join, permutations(string, number))), sep='\n')
