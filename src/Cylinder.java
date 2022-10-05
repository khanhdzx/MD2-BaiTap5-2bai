public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }
    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public double getArea(){
        return 2*(super.getArea()+super.getRadius() *Math.PI*height);
    }
    public String toString(){
        return  "A Cylinder with height = "
                + getHeight()
                +",which is a subclass of "
                + super.toString();
    }
}
