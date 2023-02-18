package PC;

public class Ram {
    String name;
    int volume;
    Ram (){
        name = "Crucial";
        volume = 2;
    }
    Ram (String ramName, int ramVolume){
        name = ramName;
        volume = ramVolume;
    }
    public void infoRam(){
        System.out.println("Оперативная память: " + name );
        System.out.println("Объем RAM: " + volume + "Gb");

    }
}
