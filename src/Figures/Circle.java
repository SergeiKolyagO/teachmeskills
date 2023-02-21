package Figures;

public class Circle extends Figure{
    Circle (int radius){
        super(radius);
        setName("Круг");

    }

@Override
public double getPerimeter (){
    return getRadius() * 2 * Math.PI;
}
public double getSquare (){
        return Math.PI * getRadius() * getRadius();
    }
}
