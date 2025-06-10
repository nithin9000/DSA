n = input()
result = 0
for i in n:
	m = int(i)
	result += m**3

print(result)
if int(n) == result:
	print(True)
else:
	print(False)