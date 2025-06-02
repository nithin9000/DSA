'''
Input Format: N = 3
Result:
  A
 ABA
ABCBA


Input Format: N = 6
Result:
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA
'''

n = int(input())
for i in range(1,n+1):
	for j in range(n-i):
		print(" ",end="")

	for j in range(0,i):
		print(chr(65+j),end = "")

	for j in range(i-2,-1,-1):
		print(chr(65+j),end="")
	print()