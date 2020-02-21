import cmath

def convert_to_polar():
    cnum = complex(input().strip())
    print(abs(cnum))
    print(cmath.phase(cnum))
