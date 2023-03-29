import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stream {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(0,20));
        }
        System.out.println();
        System.out.println("Список 20 случайных чисел : " + list);
        List<Integer> uniqueList = list.stream().distinct().toList();
        System.out.println("Список этих чисел без дубликатов : " + uniqueList);
        List<Integer> evenList = uniqueList.stream().filter(i -> i % 2 == 0 && i >= 7 && i <= 17).toList();
        System.out.println("Все четные числа от 7 до 17 включительно : " + evenList);
        List<Integer> doubledList = uniqueList.stream().map(i -> i * 2).toList();
        System.out.println("Список чисел без дубликатов умноженные на 2 : " + doubledList);
        List<Integer> sortedList = uniqueList.stream().sorted().limit(4).toList();
        System.out.println("Первых 4 отсортированных числа: " + sortedList);
        long count = uniqueList.size();
        System.out.println("Количество чисел без дубликатов : " + count);
        double average = uniqueList.stream().mapToInt(i -> i).average().orElse(Double.NaN);
        System.out.println("Среднее арифметическое чисел без дубликатов : " + average);
    }
}
