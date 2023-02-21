package Figures;

public class Main {
    public static void main (String[] args){
        Figure[] one ={ new Rectangle(2,4),
        new Triangle(2,4,5),
        new Circle(4),
        new Triangle(5,8,11),
        new Rectangle(5,5)};
        double sumPer = 0;
        double sumSqr = 0;
        for (Figure el: one) {
            el.getDetails();
            sumSqr += el.getSquare();
            sumPer += el.getPerimeter();
        }
        System.out.println("Сумма периметров: " + sumPer);
        System.out.println("Сумма площадей: " + sumSqr);
    }
}
