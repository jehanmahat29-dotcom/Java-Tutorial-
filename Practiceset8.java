//Question 1======================================================================================================================================
//Q.1] Create a class Employee with following properties:
//Salary
//Get salary
//name
//get name
//age
//get age
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    int age;
}
//Question 2======================================================================================================================================
//Q.2] Create a class cellphone with methods to print "ringing...","vibrating...",etc.
class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void call(){
        System.out.println("calling Jehan...");
    }
}
//Question 3======================================================================================================================================
//Q.3] Create a class Square with a method to initialize its side, calulating area and perimeter.
    class Square{
        int side;
        public void area(){
            System.out.println("Area of square is: "+side*side);
        }
        public void perimeter(){
            System.out.println("Perimeter of square is: "+4*side);
        }
}
//Question 4======================================================================================================================================
//Q.4] Create a class Rectangle 8 repeat 3
    class Rectangle{
        int length;
        int breadth;
        public int area(){
            return length*breadth;
        }
        public int perimeter(){
            return 2*(length+breadth);
        }
    }
//Question 5======================================================================================================================================
//Q.5] Create a class TommyVecettii for Rockstar Games capable of Hitting, Running, Firing, etc.
    class TommyVecettii{
        public void Hit(){
            System.out.println("TommyVecettii is hitting...");
        }
        public void Run(){
            System.out.println("TommyVecettii is running...");
        }
        public void Fire(){
            System.out.println("TommyVecettii is firing...");
        }
    }
//Question 6======================================================================================================================================
//Q.6] Create a class Circle with a method to initialize its radius, calulating area and circumference.
    class Circle{
        int radius;
        public void area(){
            System.out.println("Area of circle is: "+3.14*radius*radius);
        }
        public void circumference(){
            System.out.println("Circumference of circle is: "+2*3.14*radius);
        }
    }
public class Practiceset8 {
    public static void main(String[] args) {
        //Question 1======================================================================================================================================
        Employee1 Jehan = new Employee1();
        Jehan.setName("Jehan Mahat");
        Jehan.salary = 50000;
        Jehan.age = 18;
        System.out.println(Jehan.getName());
        System.out.println("Salary is: "+Jehan.getSalary());
        System.out.println("Age is: "+ Jehan.age);

        //Question 2======================================================================================================================================
        cellphone Redmi = new cellphone();
        Redmi.call();
        Redmi.vibrate();
        Redmi.ring();

        //Question 3======================================================================================================================================
        Square square = new Square();
        square.side = 16;
        square.area();
        square.perimeter();

        //Question 4======================================================================================================================================
        Rectangle rectangle = new Rectangle();
        rectangle.length = 20;
        rectangle.breadth = 10;
        int area = rectangle.area();
        int perimeter = rectangle.perimeter();
        System.out.println("Length of a rectangle is: "+rectangle.length);
        System.out.println("Breadth of a rectangle is: "+rectangle.breadth);
        System.out.println("Area of a rectangle is: "+area);
        System.out.println("Perimeter of a rectangle is: "+perimeter);

        //Question 5======================================================================================================================================
        TommyVecettii Tommy = new TommyVecettii();
        Tommy.Hit();
        Tommy.Run();
        Tommy.Fire();

        //Question 6======================================================================================================================================
        Circle circle = new Circle();
        circle.radius = 13;
        circle.area();
        circle.circumference();
    }
}