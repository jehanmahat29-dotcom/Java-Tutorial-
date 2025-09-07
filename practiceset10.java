//Question 1=======================================================================================================================================
//Q.1] Create a class Circle and use inheritance to create a class Cylinder from it.
class Circle10{
    public int radius;
// Circle10(){
//     System.out.println("I am a semi Circle");
// }

    public Circle10(int r) {
        System.out.println("I am a Circle");
        this.radius = r;
    }

    public double area(){
        return Math.PI* this.radius*this.radius;
    }
}
class Cylinder10 extends Circle10{
    public int height;

    public Cylinder10(int r, int h) {
        super(r);
        System.out.println("I am a Cylinder");
        this.height = h;
    }


    public double volume(){
        return Math.PI* this.radius*this.radius*this.height;
    }
}
//Question 2=======================================================================================================================================
class Rectangle10{
    public int length;
    public int breadth;

    public Rectangle10(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rectangle10{
    int height;
    public Cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }
    public void setHeight(int h) {
        this.height = h;
    }
    public int volume(){
        return this.length*this.breadth*this.height;
    }
}
public class practiceset10 {
    public static void main(String[] args) {
        //Circle10 obj = new Circle10(12);

         Cylinder10 obj = new Cylinder10(3,4);
         System.out.println("The area of cylinder is "+obj.area() +" sq.cm");
         System.out.println("The volume of cylinder is "+obj.volume()+" cu.cm");
//================================================================================
         //Rectangle10 obj1 = new Rectangle10(4,5);
         //System.out.println("The Area of rectangle is " + obj1.area()+" sq.cm");

         Cuboid obj2 = new Cuboid(4,5,6);
         System.out.println("The Area of rectangle is " + obj2.area()+" sq.cm");
         System.out.println("The volume of cuboid is " + obj2.volume()+" cu.cm");
    }
}
