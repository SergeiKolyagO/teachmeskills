package Cars;

public class Cars {
    private String model;
    private String color;
    private int yearsProduction;
    private int maxSpeed;

    public int getMaxSpeed (){
        return maxSpeed;
    }
    public int getYearsProduction(){
        return yearsProduction;
    }
    public String getModel (){
        return model;
    }
    public String getColor () {
        return color;
    }

    Cars (String model, String color, int yearsProduction, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.yearsProduction = yearsProduction;
        this.maxSpeed = maxSpeed;
    }
    public void getInfo (){
        System.out.println("model: " + this.model + " color: " + this.color + " year: " + this.yearsProduction +
                " maxspeed: " + this.maxSpeed);
    }
}
