import math
import os
import random
import re
import sys
from collections import Counter

# Complete the checkMagazine function below.
def checkMagazine(magazine, note):
    if Counter(note) - Counter(magazine) == {}:
        return 'Yes'
    else:
        return 'No'

if __name__ == '__main__':
    m, n = map(int, input().split())
    magazine = list(input().split())
    note = list(input().split())

    checkMagazine(magazine, note)
