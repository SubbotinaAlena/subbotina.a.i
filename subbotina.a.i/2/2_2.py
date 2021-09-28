# -*- coding: utf-8 -*-

def s():
    print("Введите входные данные (2 числа)")
    first= int(input("Длина первой стороны - "))
    second = int(input("Длина второй стороны - "))
    print("Ответ:")
    return first * second * 0.5
print(s())