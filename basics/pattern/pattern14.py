'''
Input Format: N = 3
Result:
A
A B
A B C

Input Format: N = 6
Result:
A
A B
A B C
A B C D
A B C D E
A B C D E F
'''

n = int(input())
for i in range(1,n+1):
	for j in range(1,i+1):
		j+=64
		print(chr(j),end=" ")
	print()