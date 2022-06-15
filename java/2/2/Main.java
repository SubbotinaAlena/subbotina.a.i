/* №2 Вариант 5
  Дан массив b (n) . Переписать в массив C(n) положительные элементы
массива b(n) деленные на 5. (со сжатием., без пустых элементов внутри). Затем
упорядочить методом «выбора и перестановки» по возрастанию новый массив.  */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int a = -20;
        int t = 50;
        System.out.println("Введите размер массива :"); 
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n; i++)
            b[i] = (a + (int) (Math.random() * t)); 
        System.out.println("массив B:");
        for (int i = 0; i < n; i++) //Выводим сгенерированый массив
            System.out.println(b[i]);

        int l = 0; //Считаем количество положительных массивов для выделения места
        for (int i = 0; i < n; i++) {
            if (b[i] > 0) {
                l++;
            }
        }
        int k=0;
        int[] c = new int[l]; //Создаем массив для положительных чисел
        for (int i = 0; i < n; i++) {  
            if (b[i] > 0) {
                c[k] = b[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) { 
            c[i] = c[i] / 5;
        }

        for (int i = 0; i < k-1; i++) { 
            int m = i;
            int min = c[i];
            for (int j = i + 1; j < k; j++)
                if (c[j] < min) {
                    m = j;
                    min = c[j];
                }
            c[m]=c[i];
            c[i]=min;
        }

        System.out.println("Массив C :");   //выводим отсортированный массив
        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);

    }

}
