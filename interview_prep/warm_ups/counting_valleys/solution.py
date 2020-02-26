n steps
U = uphill
D=  Downhill
each step = 1

def counting_valleys(n, s):
    level = 0
    count = 0
    for i in range(n):
        if s[i] == 'U':
            level+=1
        elif s[i] == 'D':
            level-=1
            if level == -1:
                count+=1
    return count
