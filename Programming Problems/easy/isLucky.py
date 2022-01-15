def solution(n):
    ger = [int(i) for i in str(n)]
    if(len(ger)%2!=0):
        return False;
    else:
        k = int((len(ger)/2))
        z = int(k+1)
        ber = ger[0:k]
        li = ger[k::]
        if(sum(ber)==sum(li)):
            return True
        else:
            return False
