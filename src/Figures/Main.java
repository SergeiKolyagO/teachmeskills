package Figures;

public class Main {
    public static void main (String[] args){
        Figure[] one ={ new Rectangle(2,4),
        new Triangle(2,4,5),
        new Circle(4)};
        for (Figure el: one) {
            el.getDetails();
        }


    }
}
