import math
import os
import random
import re
import sys
from collections import defaultdict

def sherlockAndAnagrams(s):
    subsctrings = defaultdict(int)
    for i in range(1,len(s)):
        for j in range(len(s) - i +1):
            subsctrings[''.join(sorted(s[j:j+i]))]+= 1
    ans = 0
    for k,v in subsctrings.items():
        anx+= value*(value-1)//2
    print(ans)
    
