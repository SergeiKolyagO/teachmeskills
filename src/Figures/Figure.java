package Figures;

public class Figure {
    private int width;
    private int height;
    private int length;
    private int radius;
    private  String name;

    Figure(int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    Figure (int width, int length){
        this.width = width;
        this.length = length;

    }
    Figure (int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public int getLength() {
        return length;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPerimeter (){
        return 2 * (this.width + this.length);
    }
    public double getSquare (){
        return this.width * this.length;
    }

    public void getDetails (){
        System.out.println("Фигура: " + this.name + " периметр: " + this.getPerimeter() + "\n" +
                " площадь: " + this.getSquare());
    }

}
