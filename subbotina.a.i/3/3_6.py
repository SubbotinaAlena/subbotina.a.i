# -- coding: utf-8 --
def sense():
	res=1
	n= int(input('n='))
	for i in range(1,n+1):
		res*=i
	return res
print(sense())