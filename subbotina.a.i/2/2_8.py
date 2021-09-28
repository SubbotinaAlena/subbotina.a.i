# -*- coding: utf-8 -*-

def N():
    print("Введите входные данные (3 числа)")
    x = int(input())
    y = int(input())
    z = int(input())
    print("Ответ:")
    if(x == y == z):
        return 3
    elif(x == y or z == y or x == z):
        return 2
    else:
        return 0
print(N())