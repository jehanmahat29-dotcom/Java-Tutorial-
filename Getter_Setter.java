class Employee2{
    private int id ;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
}
//===============================================================================================================================================
class Circle {
    private int radius;
    private float area;
    private float perimeter;

    public void setRadius(float r){
        radius = (int) r;
    }
    public void checkArea(float a){
        area = 3.14f*radius*radius;
        if(a==area){
            System.out.println("Area is correct");
        }
        else{
            System.out.println("Area is not correct");
        }
    }
    public void checkPerimeter(float p){
        perimeter = 2*3.14f*radius;
        String a = String.format("%.3f", p);
        String b = String.format("%.3f", perimeter);
        
        if( a.equals(b)){
            System.out.println("Perimeter is correct");
        }
        else{
            System.out.println("Perimeter is not correct");
        }
    }
}
//===============================================================================================================================================
public class Getter_Setter {
    public static void main(String[] args) {
        Employee2 Jehan = new Employee2();
        //Jehan.id = 29102006;          \throws error due to private
        //Jehan.name = "Jehan Mahat";   /access modifier 
        Jehan.setid(29102006);
        Jehan.setname("Jehan Mahat");
        System.out.println(Jehan.getid());
        System.out.println(Jehan.getname());

//===============================================================================================================================================
        Circle c = new Circle();
        c.setRadius(10.0f);
        c.checkArea(314.0f);
        c.checkPerimeter(62.8f);
    }
}