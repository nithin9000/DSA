'''
n=6
1
01
101
0101
10101
010101
'''

n = int(input())
for i in range(1,n+1):
	start = 1 if i%2 != 0 else 0
	for j in range(i):
		print(start,end="")
		start = 1-start
	print()