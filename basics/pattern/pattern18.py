'''
Input Format: N = 3
Result:
C
B C
A B C

Input Format: N = 6
Result:
F
E F
D E F
C D E F
B C D E F
A B C D E F
'''

n = int(input())

x = 65+n
for i in range(1,n+1):
	for j in range(i,0,-1):
		print(chr(x-j),end=" ")
	print()