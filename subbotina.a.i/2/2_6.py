# -*- coding: utf-8 -*-

def Color():
    print("Введите входные данные (4 числа)")
    X = int(input("Номер столбца первой клетки - "))
    Y = int(input("Номер строки первой клетки - "))
    M = int(input("Номер столбца второй клетки - "))
    N = int(input("Номер строки второй клетки - "))
    print("Ответ:")
    if(1 <= X <= 8 and 1 <= Y <= 8 and 1 <= M <= 8 and 1 <= N <= 8):
        if((Y % 2 != 0 and X % 2 != 0) or (Y % 2 == 0 and X % 2 == 0)):
            firstColor = "Чёрный"
        else:
            secondColor = "Белый"
        if((N % 2 != 0 and M % 2 != 0) or (N % 2 == 0 and M % 2 == 0)):
            secondColor = "Чёрный"
        else:
            secondColor = "Белый"
        if(secondColor == firstColor):
            return "Да"
        else:
            return "Нет"
    else:
        return "Некорректный ввод"
print(Color())