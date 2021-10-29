# -- coding: utf-8 --
def sense():
	s=str(input('Введите строку '))
	b=((s[s.find('h')+1:s.rfind('h'):])[::-1])
	return b
	
print(sense())