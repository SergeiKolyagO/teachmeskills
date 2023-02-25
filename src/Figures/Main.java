package Figures;
/*
Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и
подсчет периметра. Площадь треугольника по формуле Герона.
Создать массив из 5 фигур.
Вывести на экран сумму периметров и сумму площадей всех фигур в
массиве
 */
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
