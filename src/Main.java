import java.util.Arrays;


public class Main {
    public static void main (String [] args){
        String s1 = "5555-qWe-1234-xxx-1a2b";
        getOne(s1); //Вывести на экран в одну строку два первых блока по 4 цифры.
        getTwo(s1); //Вывести на экран номер документа, но блоки из трех букв заменить на ***
        getTree(s1); //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        getFour(s1); //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y"
        // в верхнем регистре(реализовать с помощью класса StringBuilder)
        getFive(s1); //Проверить содержит ли номер документа последовательность abc и
        //вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
        getSix(s1); //Проверить начинается ли номер документа с последовательности 555.
        getSeven(s1);//Проверить заканчивается ли номер документа на последовательность 1a2b
    }
    public static void getOne(String s){
        String[] name = s.split("-");
        System.out.println(name[0] + "-" + name[2]);
    }
    public static void getTwo(String s){
        String[] name = s.split("-");
        char[] symb1 = name[1].toCharArray();
        Arrays.fill(symb1, '*');
        name[1] = new String(symb1);
        char[] symb2 = name[3].toCharArray();
        Arrays.fill(symb2, '*');
        name[3] = new String(symb2);
        String ns ="";
        for (String value : name) {
            ns += value + "-";

        }
        System.out.println(ns.substring(0,ns.length()-1));
    }
    public static void getTree(String s){
        System.out.println((s.substring(5,8) + "/"
                + s.substring(14,17) + "/"
                + s.substring(19,20) + "/"
                + s.substring(21,22))
                .toLowerCase());
    }
    public static void getFour(String s){
        StringBuilder builder = new StringBuilder(s);
        System.out.printf("\"Letters:%S/%S/%S/%S\"%n",
                builder.substring(5, 8),
                builder.substring(14, 17),
                builder.substring(19, 20),
                builder.substring(21, 22));
    }
    public static void getFive(String s){
        System.out.println(s.toLowerCase().contains("ABC".toLowerCase()));
    }
    public static void getSix(String s){
        boolean b;
        b = s.substring(0, 3).contains("555");
        System.out.println(b);
    }
    public static void getSeven(String s){
        boolean b;
        b = s.substring(s.length()-4,s.length()).lastIndexOf("1a2b") != -1;
        System.out.println(b);

    }
}