# -- coding: utf-8 --
def sense():
	sum=0
	n=int(input('n= '))
	for i in range(1,n+1):
		sum+=i**3
	return sum
print(sense())