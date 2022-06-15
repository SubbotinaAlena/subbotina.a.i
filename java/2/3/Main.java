/* №3 Вариант 5
 Определить матрицу (двумерный массив) и ее заполнить случайными значениями.
Построить вектор В, которой возвращает – номер максимального значения в i-й строке;*/
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Введите размер массива :"); //определим размер для массива
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] vectorB = new int[n]; //Выделим место
        int[][] a = new int[n][n];
        int k = 50;

        Random random = new Random();
        System.out.println("Матрица :");

        for (int i = 0; i < a.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIn = 0;
            for (int j = 0; j < a.length; j++) { //заполним матрицу
                int u = -10 + random.nextInt(k);
                a[i][j] = u;
                if (u > max) {  //находим максимум
                    max = u;
                    maxIn = j;
                }
            }
            vectorB[i] = maxIn;
        }

        for (int i = 0; i < a.length; i++) {  //Выводим матрицу на экран
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Индекс максимального элемента строки " + i + " = " + vectorB[i]);
        }
    }
}