'''Input Format: N = 3
Result:
*    *
**  **
******
**  **
*    *


Input Format: N = 6
Result:
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
'''

n = int(input())
for i in range(1,n+1):
	space = 2*(n-i)
	print("*"*i+" "*space+"*"*i)
for i in range(n-1,0,-1):
	space = 2*(n-i)
	print("*"*i+" "*space+"*"*i)
print()
