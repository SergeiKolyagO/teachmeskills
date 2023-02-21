package Figures;

public class Triangle extends Figure{
    Triangle(int width, int length, int height){
        super(width, length, height);
        setName("Треугольник");
    }
@Override
public double getPerimeter (){
    return getWidth() + getLength() + getHeight();
}
    public double getSquare (){
        double p = 0.5 * (getWidth() + getLength() + getHeight());
        return Math.sqrt(p * (( p - getWidth()) * ( p - getLength()) * ( p - getHeight()))) ;
    }
}
