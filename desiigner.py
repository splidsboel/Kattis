import sys
import re

data = sys.stdin.read()


pattern = r"^br[r]+[aeiouy]$"

if re.match(pattern, data):
    print("Jebb")
else:
    print("Neibb")