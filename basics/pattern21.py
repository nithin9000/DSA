'''
Input Format: N = 3
Result:
***
* *
***

Input Format: N = 6
Result:
******
*    *
*    *
*    *
*    *
******
'''
n=int(input())
for i in range(1,n+1):
	if i==1 or i == n:
		print("*"*n);
	else:
		print("*"+" "*(n-2)+"*")