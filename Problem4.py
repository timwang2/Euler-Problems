def find_max(min=100, max=999):
	max_palindrome = 1
	for x in range (min,max+1):
		for y in range (x+1,max+1):
			number = x*y
			if number > max_palindrome and str(number) == (str(number)[::-1]):
				max_palindrome=number
	return max_palindrome

print find_max()
			
