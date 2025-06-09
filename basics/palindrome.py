n = int(input())
if n<0:
	n = n*-1
	string = str(n)
	print(string[::-1])
	if n == int(string[::-1])*-1:
		print("Palindrome")
	else:
		print("Not palindrome")
else:
	string = str(n)
	print(string[::-1])
	if n == int(string[::-1]):
		print("Palindrome")
	else:
		print("Not palindrome")