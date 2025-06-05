'''
Input Format: N = 3
Result:
A
B B
C C C

Input Format: N = 6
Result:
A
B B
C C C
D D D D
E E E E E
F F F F F F
'''

n = int(input())
x = 64
for i in range(1,n+1):
	x+=1
	print(chr(x)*i,end = " ")
	print()