package Homework8;

public class Main {
    public static void main (String[] args){
        Person one = new Director("Иван","Иванов",24);
        Person two = new Worker("Петя", "Петров", 20);
        Person three = new Accountant("Сергей","Коляго",25);
        one.getInfo();
        two.getInfo();
        three.getInfo();
    }
}
