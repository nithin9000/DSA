'''
n=6

1          1
12        21
123      321
1234    4321
12345  54321
123456654321
'''

n = int(input())
for i in range(1,n+1):
	for j in range(1,i+1):
		print(j,end="")

	space = 2*(n-i)
	for _ in range(space):
		print(" ",end = "")

	for j in range(i,0,-1):
		print(j,end="")
	print()
