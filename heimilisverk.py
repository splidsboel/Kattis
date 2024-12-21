import sys

data = sys.stdin.readlines()
data.pop(0)
choresNoDupes = []

for i in data:
    if i not in choresNoDupes:
        choresNoDupes.append(i)


for i in choresNoDupes:
    print(i)