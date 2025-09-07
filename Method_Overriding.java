class ParentClass{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of parent class");
    }
}

class ChildClass extends ParentClass{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of child class");
    }
    public void meth3(){
        System.out.println("I am method 3 of child class");
    }
}
public class Method_Overriding{
    public static void main(String args[]) {
        ParentClass obj = new ParentClass();
        obj.meth2();
        ChildClass obj1 = new ChildClass();
        obj1.meth2();
        obj1.meth3();
    }
}