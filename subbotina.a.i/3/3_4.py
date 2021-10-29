# -- coding: utf-8 --
def sense():
    sum = 0
    for i in range(int(input('кол-во чисел N '))):
        sum += int(input('N целых чисел '))
    return sum

print(sense())