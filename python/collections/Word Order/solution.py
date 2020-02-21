from collections import OrderedDict

def word_order(x):
    n = int(input().strip())

    history = OrderedDict()

    for _ in range(n):
        word = str(input().strip().split("\n"))
        if word not in history.keys():
            history[word]  = 1
        else:
            history[word] +=1
    print(len(history.keys()))
    print(" ".join(map(str, history.values())))

if __name__ == '__main__':
    x = "Jasem Maehid "
    word_order(x)
