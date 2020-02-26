
def odd_socks(n,ar):
    n = int(input().strip())
    ar= list(map(int, input().strip().split(' ')))
    socks = {}
    res = 0
    for i in ar:
        if i not in socks.keys():
            socks[i]=1
        else:
            socks[i]+=1
    for key in socks.keys():
        res+=socks[key]//2
    return res
