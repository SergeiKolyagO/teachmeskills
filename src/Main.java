import java.util.Arrays;


public class Main {
    public static void main (String [] args){
        String s1 = "5555-qwe-1234-xxx-1a2b";
        getOne(s1); //Вывести на экран в одну строку два первых блока по 4 цифры.
        getTwo(s1); //Вывести на экран номер документа, но блоки из трех букв заменить на ***
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