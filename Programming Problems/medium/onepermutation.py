def solution(a, b):
    if(a == b):
        return True
    n = []
    t = []
    for i in range(len(a)):
        j = a[i]
        g = b[i]
        if j != g:
            n.insert(i, i)
            t.insert(i, g)
    if(len(n) == 2 and len(t) == 2):
        b[n[0]] = t[1]
        b[n[1]] = t[0]
        if b == a:
            return True
    return False
