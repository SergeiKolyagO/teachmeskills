package Homework8;

public class Worker extends Person implements Position{
    Worker (String name, String surname, int age){
        super(name, surname, age);
    }
    @Override
    public void getPosition() {
        System.out.println("Должность: Рабочий");
    }
}
