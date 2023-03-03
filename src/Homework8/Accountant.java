package Homework8;

public class Accountant extends Person implements Position{
    Accountant(String name, String surname, int age){
        super(name, surname, age);
    }
    @Override
    public void getPosition() {
        System.out.println("Должность: Бухгалтер");
    }
}
