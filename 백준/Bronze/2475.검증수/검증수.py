import math

a, b, c, d, e = input().split()
sum = math.pow(int(a), 2) + math.pow(int(b), 2) + math.pow(int(c), 2) + math.pow(int(d), 2) + math.pow(int(e), 2)

num = sum % 10
print(int(num))