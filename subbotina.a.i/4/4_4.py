# -- coding: utf-8 --
def sense():
	s=str(input('Введите строку '))
	a=s[s.find(' ')+1:]+s[:s.find(' ')]
	return a
	
print(sense())