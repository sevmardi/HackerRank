from collections import Counter

def raghu():
    num_of_shoes = int(input())
    shoes = list(map(int, input().strip().split()))
    num_of_custs = int(input().strip())
    
    res = 0
    x = Counter(shoes)
    for _ in range(num_of_custs):
        size, money = map(int, input().strip().split(' '))
        if x[size]>0:
            res+=money
            x[size] -=1
    print(res)
