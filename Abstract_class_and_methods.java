abstract class Base10{
    public Base10(){
        System.out.println("Base class constructor");
    }
    public void printMessage(){
        System.out.println("This is Base Constructor");
    }
    abstract public void Greet();
    abstract public void Greet1();
}

class Derived10 extends Base10{
    @Override
    public void Greet(){
        System.out.println("Welcome to derived class");
    }
    @Override
    public void Greet1(){
        System.out.println("Welcome to the java class");
    }
}

@SuppressWarnings("unused")
abstract class Child10 extends Base10{
    public void Message(){
        System.out.println("You are in child class");
    }
}

public class Abstract_class_and_methods {
    public static void main(String[] args) {
        Derived10 obj = new Derived10();
        obj.Greet();
        obj.Greet1();

        // Child10 obj1 = new Child10();
        // obj1.Message();
    }
}
