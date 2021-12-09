# -*- coding: utf-8 -*-

def sport():
    x = int(input("Пробежал в первый день км - "))
    y = int(input("Введите число - "))
    counter = 1
    while x < y:
        x *= 1.1
        counter+=1
    print(counter)
sport()