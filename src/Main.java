import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getNumYesOrNo();
        getRemoveItems();
        getNumMinMax();
        getAverage();
    }

    public static void getNumYesOrNo(){
        /* Task 1
        Поиск числа в массиве
         */
        boolean yesOrNo = false;
        int [] numb = new int[10];
        Random random = new Random();
        for (int i = 0; i < numb.length; i++){
            numb[i] = random.nextInt(-100,100);
        }
        System.out.println("полученный массив: \n" + Arrays.toString(numb));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска");
        int item = scanner.nextInt();
    //    scanner.close();
        for (int i = 0; i < numb.length; i++){
            if (numb[i] == item) {
                yesOrNo = true;
                break;
            } else {
                yesOrNo = false;
            }
        }
        if (yesOrNo){
            System.out.println("Такое число есть в массиве");
        } else {
            System.out.println("Такого числа нет в массиве");
        }

    }
    public static void getRemoveItems() {
        /* Task 2
        Создать массив. Удалить все вхождения заданого числа с массива.
        Вывести массив без указанного числа.
         */
        int[] numbs = new int[10];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < numbs.length; i++){
            numbs[i] = random.nextInt(-10,10);
          }
        System.out.println("полученный массив: \n" + Arrays.toString(numbs));
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число которое хотите удалить");
        int item = scanner.nextInt();
    //    scanner.close();
        // смотрим сколько повторяющихся элементов
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] == item) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("такого числа в массиве нет");
        }

        if (numbs.length - count == 0) { // если массив состоит из одних одинаковых чисел которые нужно удалить
            System.out.println("массив не существует");
        } else {
            int[] remItem = new int[numbs.length - count];
            for (int i = 0, j = 0; i < numbs.length; i++) {
                if (numbs[i] != item) {
                    remItem[j] = numbs[i];
                    j++;
                } else if ( i + 1 < numbs.length) {

                    remItem[j] = numbs[i + 1];
                }
                else {
                    break;
                }
            }
            System.out.println("Новый массив : \n"+ Arrays.toString(remItem));
        }
    }

    public static void getNumMinMax (){
        /* Task 3
        Указать длину массива. Создать массив.
        Найти минимальное максимальное и среднее значение.
         */
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("такой размер массива не существует");
        } else {
            Random random = new Random();
            int[] num1 = new int[size];
            int min;
            int max;
            int sum = 0;
            for (int i = 0; i < num1.length; i++) {
                num1[i] = random.nextInt(0, 10);
                sum += num1[i];
            }
            min = num1[0];
            max = num1[0];
            for (int i = 0; i < num1.length; i++) {
                if (min >= num1[i]) {
                    min = num1[i];
                }
                if (max <= num1[i]) {
                    max = num1[i];
                }
            }
            System.out.println("полученный массив: \n" + Arrays.toString(num1));
            System.out.println("Минимальное число : " + min);
            System.out.println("Максимальное число : " + max);
            System.out.println("Среднее : " + sum / size);
            scanner.close();
        }
    }
    public static void getAverage (){
        /* Task 4
        Создать два массива.
        Найти среднее арифметическое. Вывести в каком массиве среднее арифметическое больше
         */
        int[] numbs1 = new int[5];
        int[] numbs2 = new int[5];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;
        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < 5 ; i++){
            numbs1[i] = random.nextInt(0,20);
            sum1 += numbs1[i];
            numbs2[i] = random.nextInt(0,20);
            sum2 += numbs2[i];
        }
        average1 = sum1/5;
        average2 = sum2/5;
        System.out.println(Arrays.toString(numbs1) + "\n" + Arrays.toString(numbs2));
        System.out.println((average1>average2) ? "среднее первого массива больше" :
                (average1<average2) ? "среднее второго массива больше" : "средние арифметические равны");
    }

}