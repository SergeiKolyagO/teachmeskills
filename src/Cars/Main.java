package Cars;
/*
Создать класс Машина со следующими параметрами: модель, цвет, год
производства, максимальная скорость (используем принципы инкапсуляции). В
основном классе создать два массива объектов класса машина с разными
моделями машин (по 4 объекта в каждом). Через сравнение всех моделей
машин, вывести самую старую модель и самую быструю
 */
public class Main {
    public static void main (String[] args){
        Cars[] bmw = {new Cars("bmw E60", "black", 2005, 280),
        new Cars("bmw E39","red", 2000,220),
        new Cars("bmw E61","green", 2007, 290),
        new Cars("bmw E90","red", 2001,300)};
        Cars[] peugeot = { new Cars("peugeot 406","blue",2000,180),
        new Cars("peugeot 306","red", 1998,150),
        new Cars("peugeot 307", "white", 2007, 180),
        new Cars("peugeot 607","black", 1997, 200)};
        Cars old = bmw[0];
        Cars fast = bmw[0];
        for (Cars cars : bmw ) {
            old = (old.getYearsProduction() > cars.getYearsProduction()) ? cars : old;
            fast = (fast.getMaxSpeed() < cars.getMaxSpeed()) ? cars : fast;
        }
        for (Cars cars : peugeot) {
            old = (old.getYearsProduction() > cars.getYearsProduction()) ? cars : old;
            fast = (fast.getMaxSpeed() < cars.getMaxSpeed()) ? cars : fast;
        }
        System.out.println("Самая старая машина: " + old.getModel()
                + " " + old.getColor()
                + " " + old.getMaxSpeed()
                + " " + old.getYearsProduction());
        System.out.println("Самая быстрая машина: " + fast.getModel()
                + " " + fast.getColor()
                + " " + fast.getMaxSpeed()
                + " " + fast.getYearsProduction());
    }
}
