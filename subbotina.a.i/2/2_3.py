# -*- coding: utf-8 -*-

def tss():
    print("Введите входные данные (1 число)")
    time = int(input("Количество минут - "))
    print("Ответ:")
    hours = time // 60
    minutes = time % 60
    return "time - " + str(hours % 24) + ":" + str(minutes)
print(tss())