'''
Input Formant: N = 3
Result:
******
**  **
*    *
*    *
**  **
******

Input Format: N = 6
Result:
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
'''
n = int(input())
for i in range(n,0,-1):
	spaces = 2*(n-i)
	print("*"*i+" "*spaces+"*"*(i))
for i in range(1,n+1):
	spaces = 2*(n-i)
	print("*"*i+" "*spaces+"*"*(i))
print()
	#for j in range(i,0,-1):
