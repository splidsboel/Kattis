import sys

data = sys.stdin.read()


dataint= []

for i in data.split():
    dataint.append(int(i))


result = dataint[2]-(dataint[0]+dataint[1])
print(result)