# -- coding: utf-8 --
def sense():
	s=str(input('Введите строку '))
	z=str(input('Введите символ '))
	a=(s.replace(z,''))
	return a
print(sense())