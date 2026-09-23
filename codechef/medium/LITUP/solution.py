T = int(input())

for _ in range(T):
    N, K = map(int,input().split())
    C = list(map(int,input().split()))
    
    min_cost = float('inf');
    
    for i in range(N):
        for j in range(i + 1, N):
            
            possible = True
            
            
            
            for x in range(N):
                covered_by_first=abs(i-x) <= K
                covered_by_second=abs(j-x) <= K
                
                
                if not covered_by_first and not covered_by_second:
                    possible = False
                    break
                
            if possible:
                min_cost = min(min_cost, C[i] + C[j]);
                
    if min_cost == float('inf'):
        print(-1)
        
    else:
        print(min_cost)