//Question 1======================================================================================================================================
//Q.1] Create a class Pen with a method to write() and refill() as abstract methods
abstract class Pen{
    @SuppressWarnings("unused")
    abstract void write();
    @SuppressWarnings("unused")
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Writing...");
    }
    @Override
    void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing Nib...");
    }
}
//Question 2======================================================================================================================================
//Q.2] Create a class Monkey with a method to jump() and climb() as abstract methods and create a class Human which inherits the Monkey class and implement the jump() and climb() methods.
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void climb(){
        System.out.println("Climbing...");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
public class Practiceset11 {
    public static void main(String[] args) {
        //Q.1======================================================================================
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
        //Q.2======================================================================================
        Human h1 = new Human();
        h1.speak();
        h1.eat();
        h1.sleep();
        h1.jump();
        h1.climb();
        //Q.3======================================================================================
        Monkey m1 = new Human();
        //m1.speak(); ----->cannot access speak method from monkey class
        m1.jump();//polymorphism
        m1.climb();
    }
}
