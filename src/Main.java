public class Main {
    public static void main(String[] args) {
        getCountNumber();
        getTriangleYesOrNo();
        getNumber();
        getCountPositiveNumbers();
        getCountPositiveAndNegative();
        getMax();
    }

    public static void getCountNumber() {
        /* Task 1
        выясняет число положительное или отрицательное и выводит количество цифр в числе
        * */
        int a = 8;
        boolean yesOrNo = (a >= 0) ? true : false;
        String s = yesOrNo ? "положительное" : "отрицательное";
        if (a > -10 && a < 10) {
            System.out.println("число однозначное " + s);
        } else if (a > -100 && a < 100) {
            System.out.println("число двухзначное " + s);
        } else if (a > -1000 && a < 1000) {
            System.out.println("число трехзначное " + s);
        } else System.out.println("Иное число");
        System.out.println();
    }

    public static void getTriangleYesOrNo() {
        /* Task 2
        Существует ли треугольник?
         */
        int a = 1;
        int b = 4;
        int c = 4;
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.printf("Треугольник со сторонами a = %d , b = %d и с = %d существует\n", a, b, c);
        } else {
            System.out.printf("Треугольник со сторонами a = %d, b = %d и с = %d, не существует\n", a, b, c);
        }
        System.out.println();
    }

    public static void getNumber() {
        /* Task 3
        Если число положительное прибавить 1, если отрицательное вычесть два, если равняется 0 то заменить на 10
         */
        int a = 0;
        System.out.println((a > 0) ? a + 1 : ((a < 0) ? a - 2 : 10));
        System.out.println();
    }

    public static void getCountPositiveNumbers() {
        /* Task 4
        Из трех чисел посчитать сколько положительных
         */
        int num1 = -3;
        int num2 = -2;
        int num3 = -2;
        int count = 0;
        if (num1 > 0) {
            count++;
        }
        if (num2 > 0) {
            count++;
        }
        if (num3 > 0) {
            count++;
        }
        System.out.println("количество положительных чисел: " + count);
        System.out.println();
    }

    public static void getCountPositiveAndNegative() {
        /* Task 5
        Из трех чисел посчитать сколько положительных и сколько отрицательных
         */
        int num1 = -3;
        int num2 = -2;
        int num3 = 2;
        int count = 0;
        int unCount = 0;
        if (num1 > 0) {
            count++;
        } else {
            unCount++;
        }
        if (num2 > 0) {
            count++;
        } else {
            unCount++;
        }
        if (num3 > 0) {
            count++;
        } else {
            unCount++;
        }
        System.out.println("количество положительных чисел: " + count);
        System.out.println("количество отрицательных чисел: " + unCount);
    }
    public static void getMax(){
        /* Task 6
        Из двух чисел вывести большее
         */
        int num1 = 101;
        int num2 = 109;
        System.out.println();
        System.out.printf("Из чисел %d и %d большее : ", num1, num2);
        System.out.println( (num1 > num2) ? num1 : num2);
    }
}
