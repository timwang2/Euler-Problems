
import math


def find_factorial():
	return math.factorial(100)

def find_sum(i):
	total = 0
	mylist = str(i)
	for k in mylist:
		total = total + int(k)
	return total

print find_sum(find_factorial())

