# -*- coding: utf-8 -*-

def sumthree():
    print("Введите входные данные (3 числа)")
    x = int(input())
    y = int(input())
    z = int(input())
    print("Ответ:")
    sum = x + y + z
    return sum
print(sumthree())