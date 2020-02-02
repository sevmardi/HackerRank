import sys

def camel_case(s):
    res = 1
    for let in s:
        res+=1
    if not s:
        res = 0

    return s

if __name__ == "__main__":
    s = input().strip()
    result = camelcase(s)
    print(result)
