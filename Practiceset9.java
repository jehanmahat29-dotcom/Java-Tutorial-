//Question 1======================================================================================================================================
//Q.1] Create a class Cylinder using getter and setter to get and set radius and height.
class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
       return height;
    }
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
//Question 2======================================================================================================================================
//Q.2] usse above class to calculate surface area and volume of a cylinder.
    public void surfaceArea(){
        System.out.println("The surface area of the cylinder is " + 2*3.14*radius*(radius+height) + " cm2");
    }
    public void volume(){
        System.out.println("The volume of the cylinder is " + 3.14*radius*radius*height+" cm3" );
    }
}
//Question 3======================================================================================================================================
//Q.3] Overload the constructor of the rectangle of length 4 and breadth 5 with custom parameters.
    class Rectangle1{
        private int length;
        private int breadth;

        public Rectangle1(){
            this.length = 4;
            this.breadth = 5;
        }
        public Rectangle1(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }   

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
//Question 4======================================================================================================================================
//Q.4] Create a class sphere using getter and setter to get and set radius and height and also use constructor.
class Sphere{
    private int radius;
    private int circumference;
    public Sphere(){
            this.radius = 32;
            this.circumference = 87;
        }
        public Sphere(int radius, int circumference){
            this.radius = radius;
            this.circumference = circumference;
        }

    public int getRadius() {
        return radius;
    }

    public int getCircumference() {
        return circumference;
    }   

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }
    public void surfaceArea(){
        System.out.println("The surface area of the Sphere is " + 4*3.14*radius*radius + " cm2");
    }
    public void volume(){
        System.out.println("The volume of the Sphere is " + 3.14*radius*radius*radius+" cm3" );
    }
}
public class Practiceset9 {
    public static void main(String[] args) {
//Question 1======================================================================================================================================
        Cylinder c = new Cylinder(30, 10);
        System.out.println("The radius of the cylinder is " + c.getRadius());
        System.out.println("The height of the cylinder is " + c.getHeight());
        
//Question 2======================================================================================================================================
        c.surfaceArea();
        c.volume();
        System.out.println(" ");

//Question 3======================================================================================================================================
        Rectangle1 r = new Rectangle1(4,5);
        System.out.println("The length of the rectangle is "+ r.getLength());
        System.out.println("The breadth of the rectangle is "+ r.getBreadth());
        System.out.println(" ");
        
//Question 4======================================================================================================================================
        Sphere s = new Sphere(32, 87);
        System.out.println("The radius of the sphere is "+ s.getRadius());
        System.out.println("The circumference of the sphere is "+ s.getCircumference());

        s.surfaceArea();
        s.volume();
        System.out.println(" ");
    }
}
