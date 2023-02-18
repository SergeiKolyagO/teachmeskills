package PC;

public class MyMain {
    public static void main(String[] args){
        PersonalComputer pc1 = new PersonalComputer("LG",1500);
        PersonalComputer pc2 = new PersonalComputer("Philips",2000,
                new Ram("Kingston",10),
                new Hdd("Dell",256,true));
        pc1.infoPC();
        pc1.hdd.infoHdd();
        pc1.ram.infoRam();
        System.out.println();
        pc2.infoPC();
        pc2.hdd.infoHdd();
        pc2.ram.infoRam();
    }
}
