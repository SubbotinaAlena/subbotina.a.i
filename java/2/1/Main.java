/* Задача 1. №5
 Определить дополнительный массив разрешенных значений. Составить массив из элементов
исходного массива, имеющих неразрешенные значения. Вывести результативный массив на экран */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Отнесём к не соответствующим значениям четные числа 
        int n;
        System.out.println("Введите размер массива :"); //определим размер массива
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] ms =new int[n];
        for(int i=0; i<n; i++)
            ms[i]=((char) (Math.random()*20)); //заполним массив случайными числами
        System.out.println("Сгенерированный массив :");

        for(int i=0;i<n;i++) {
            System.out.println(ms[i]);
        }

        int k = 0;
        for(int i = 0; i<n; i++) //Определим количество четных чисел
            if (ms[i] % 2==0) {
                k++;
            }

        System.out.println("Результат :");
        int[] ms1 =new int[k]; //Создадим массив для четных чисел
        k = 0;
        for(int i=0; i<n; i++)
            if (ms[i] % 2==0){
                ms1[k] = ms[i];
                k++;
            }
        for(int i=0;i<k;i++)
            System.out.println(ms1[i]);
    }
}