n = int(input())
l = []
for i in range(1,n):
	if n % i == 0:
		l.append(i)
l.append(n)
print(l)
"-------------------------------------"
n = int(input())
divisors = [i for i in range(1,n+1) if n%i == 0]
print(divisors)