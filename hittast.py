import sys 

data = sorted(map(int, sys.stdin.read().split()))
result = ""
for i in data:
    result += f"{i} "

print(result.strip())