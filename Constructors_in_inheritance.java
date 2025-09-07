class Base1{
    Base1(){
        System.out.println("I am in Base constructor!");
    }
    Base1(int x){
        System.out.println("I am overloaded constructor with value of x as " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(10);
        System.out.println("I am in Derived constructor!");
    }
    Derived1(int x, int y){
        super(x);         System.out.println("I am overloaded constructor of Derived with value of y as " + y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am in ChildOfDerived constructor!");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am overloaded constructor of ChildOfDerived with value of z as " + z);
    }
}
public class Constructors_in_inheritance {
    public static void main(String[] args) {
        //Base1 obj = new Base1();
        
        //Derived1 obj1 = new Derived1(14,9);

        @SuppressWarnings("unused")
        ChildOfDerived obj2 = new ChildOfDerived();

        @SuppressWarnings("unused")
        ChildOfDerived obj3 = new ChildOfDerived(1,2,3);
    }
}
