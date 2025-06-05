'''
Input Format: N = 3
Result:
A B C
A B
A

Input Format: N = 6
Result:
A B C D E F
A B C D E
A B C D
A B C
A B
A

'''

n = int(input())
for i in range(n,0,-1):
	for j in range(1,i+1):
		j+=64
		print(chr(j),end= " ")
	print()
