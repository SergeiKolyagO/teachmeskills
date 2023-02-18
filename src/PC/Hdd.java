package PC;

public class Hdd {
    String name;
    int volume;
    boolean type;
    Hdd (){
        name = "WD";
        volume = 1000;
        type = false;
    }
    Hdd (String hhdName, int hddVolume, boolean hddType){
        name = hhdName;
        volume = hddVolume;
        type = hddType;
    }
    public void infoHdd(){
        System.out.println("Жесткий диск: " + name);
        System.out.println("Объем: "+ volume + "Gb");
        System.out.println("Тип: " + ((type) ? "Внешний" : "Внутренний"));
    }
}
