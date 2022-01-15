def solution(n):
    if(n == 1):
        return 1
    elif(n == 2):
        return 5
    else:
        return (solution(n-1)+(n)+(n-1)+(n-1)+(n-2))
