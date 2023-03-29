import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
        System.out.println("Введите 1 или 2");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        if (numb == 1) {
            functionalInterface<String, String> revers = (String s) -> {
                StringBuilder str1 = new StringBuilder(s);
                return str1.reverse().toString();
            };
            String str = scanner.next();
            System.out.println(revers.apply(str));
        }
        else if (numb == 2) {
            functionalInterface<Integer, Integer> factorial = (Integer x) -> {
                int result = 1;
                for (int i = 1; i <=x; i ++){
                    result = result * i;
                }
                return result;
            };
            System.out.println(factorial.apply(scanner.nextInt()));
        }
        scanner.close();


    }
}
