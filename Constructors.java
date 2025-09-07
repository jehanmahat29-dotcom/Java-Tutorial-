class Employee3{
private int id;
private String name;

// public Employee3(){
//     id = 29102006;
//     name = "Jehan Mahat";
// }
public Employee3(String Myname, int Myid){
    id = Myid;
    name = Myname;
}

public String getName(){return name;}
public void setName(String n){this.name = n;}
public int getId(){return id;}
public void setId(int i){this.id = i;}
}

public class Constructors {
    public static void main(String[] args) {
        Employee3 Jehan = new Employee3("Jehan Mahat", 29102006);
        // Jehan.setId(29102006);
        // Jehan.setName("Jehan Mahat");
        System.out.println(Jehan.getId());
        System.out.println(Jehan.getName());
    }
}