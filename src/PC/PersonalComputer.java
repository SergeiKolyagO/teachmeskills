package PC;

public class PersonalComputer {
    int price;
    String model;
    Ram ram;
    Hdd hdd;
    PersonalComputer(String pcModel, int pcPrice){
        model = pcModel;
        price = pcPrice;
        ram = new Ram();
        hdd = new Hdd();
    }
    PersonalComputer(String pcModel, int pcPrice, Ram pcRam, Hdd pcHdd){
        model = pcModel;
        price = pcPrice;
        ram = pcRam;
        hdd = pcHdd;
    }
    public void infoPC(){
        System.out.println("Модель ПК: " + model);
        System.out.println("Стоимость: " + price + "$");
    }
}
