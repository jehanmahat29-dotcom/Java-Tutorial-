class Teacher{
    public void greet(){
        System.out.println("Welcome to teacher class");
    }
    public void name(){
        System.out.println("My is name Java");
    }
}
class Student extends Teacher{
    public void Welcome(){
        System.out.println("Welcome to student class");
    }
    @Override
    public void name(){
        System.out.println("My name is Java in student class");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //Teacher t = new Teacher();
        //t.name();
        //Student s = new Student();
        Teacher t = new Student();
        t.name();
        t.greet();
        
    }
}
