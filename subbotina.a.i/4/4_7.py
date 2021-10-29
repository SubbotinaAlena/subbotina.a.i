# -- coding: utf-8 --
def sense():
	s=str(input())
	a=(s.replace(s[s.find('h'):s.rfind('h') + 1], ''))
	return a
print(sense())