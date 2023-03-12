public class Main {
    public static void main (String [] args){
        String s1 = "5555-eee-1234-xxx-1a2b";
        getOne(s1); //Вывести на экран в одну строку два первых блока по 4 цифры.
        getTwo(s1); //Вывести на экран номер документа, но блоки из трех букв заменить на ***
        getSix(s1); //Проверить начинается ли номер документа с последовательности 555.
        getSeven(s1);


    }
    public static void getOne(String s){
        System.out.println(s.substring(0,4) + s.substring(9,13));
    }
    public static void getTwo(String s){
        String s2 = "***";
        System.out.println((s.replaceAll(s.substring(5,8),s2)
                .replaceAll(s.substring(14,17),s2)));
    }
    public static void getSix(String s){
        boolean b;
        b = s.substring(0,3).indexOf("555") != -1;
        System.out.println(b);
    }
    public static void getSeven(String s){
        boolean b;
        b = s.lastIndexOf("1a2b") != -1;
        System.out.println(b);
    }
}