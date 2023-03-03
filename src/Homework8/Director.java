package Homework8;

public class Director extends Person implements Position{
    Director(String name, String surname, int age){
        super(name, surname, age);
    }

    @Override
    public void getPosition() {
        System.out.println("Должность: Директор");
    }
}
