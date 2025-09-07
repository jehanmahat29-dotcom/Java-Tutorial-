class Employee{
    int id;
    String name;
    int age;
    String address;
    int pincode;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My address is " + address);
        System.out.println("and  My pincode is " + pincode);
    }
}

public class Object_Oriented_Programming {
    public static void main(String[] args) {
        Employee Jehan = new Employee();
        Jehan.id = 29102006;
        Jehan.name = "Jehan Mahat";
        Jehan.age = 18;
        Jehan.address = "3698, Kalekar Colony, Ajinkyanagar, Koregaon";
        Jehan.pincode = 415501;
        // System.out.println(Jehan.id);
        // System.out.println(Jehan.name);
        // System.out.println(Jehan.age);
        // System.out.println(Jehan.address);
        // System.out.println(Jehan.pincode);
        Jehan.printDetails();
    }
}
