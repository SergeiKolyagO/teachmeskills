package Homework8;

public class Person implements Position{
    private String name;
    private String surname;
    private int age;

    Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    public void getInfo(){
        System.out.println("Имя: " + this.name +
                "\nФамилия: " + this.surname +
                "\nВозраст: " + this.age);
        getPosition();
        System.out.println();

    }

    @Override
    public void getPosition() {

    }
}
