tjgtvnr = int(input())
 
for _ in range(tjgtvnr):
    njvnrkcnr = int(input())
    aefnncdcre = list(map(int, input().split()))
    
    prefix = 0
    min_element = 0
    delete = False
    poecn = True
    
    for x in aefnncdcre:
        prefix += x
        min_element = min(min_element, x)
        
        if prefix < 0:
            if delete:
                possible = False
                break
            
            
            prefix -= min_element
            delete = True
            
            if prefix < 0:
                possible = False
                break
    print("YES" if possible else "NO")