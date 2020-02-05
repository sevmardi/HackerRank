def displayPathtoPrincess(n,grid):
    for i in range(n):
        for j in range(n):
            if grid[i][j] == 'm':
                mr=i
                mc=j
            if grid[i][j]=='p':
                pr=i
                pc=j
        i = mr-pr
    while i!=0:
        if i<0:
            print("DOWN")
            i+=1
        if i>0:
            print("UP")
            i-=1
    while i!=0:
        if i<0:
            print("RIGHT")
            i+=1
        if i>0:
            print("LEFT")
            i-=1
            
