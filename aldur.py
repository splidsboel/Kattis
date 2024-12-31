import sys

data = list(map(int, sys.stdin.read().split()))

youngestAge = 100000000000000

for i in data[1:]:
    if youngestAge == None or i<youngestAge:
        youngestAge=i
        
print(youngestAge)