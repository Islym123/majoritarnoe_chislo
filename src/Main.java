import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Определение степени мажоритарности
        System.out.print("Введите степень мажоритарности(1/n): ");
        double majorextent = in.nextInt();

        // Создание массива из случайных 10 чисел
        int[] array = new int [10];
        for (int i = 0;i <= 9;i++){
            array[i] = rand.nextInt(10);
        }
        System.out.println(Math.round(array.length/majorextent));

        // Вывод массива
        for (int i = 0;i <= 9;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        int count = 0;

        // Нахаждение мажоритарного числа
        // Проход по массиву
        for (int i = 0;i<=9;i++){
            for (int j = i;j<=9;j++){
                if(array[i] == array[j])count++;
            }
            if(count >= (array.length/majorextent)){
                System.out.println(array[i]);
                break;
            }
            System.out.println(array[i] + " встречается " + count);
            count = 0;
        }
    }
}