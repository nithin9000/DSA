'''import math

n,m = map(int,input().split())
print(math.gcd(n,m))'''

n,m = map(int,input().split())
small = min(n,m)
for i in range(small,0,-1):
	if n % i == 0 and m % i == 0:
		print(i)
		break