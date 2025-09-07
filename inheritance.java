class Base{
    int x;
    public void printMessage(){
        System.out.println("This is Base Constructor");
    }

    public int getX() {
        System.out.println("I am in Base and setting x Now!");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
//===============================================================================================================================================
class Derived extends Base{
    int y;

    public void printMessage1(){
        System.out.println("This is Derived Constructor");
    }
    public int getY() {
        System.out.println("I am in Derived and setting y Now!");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
public class inheritance {
    public static void main(String[] args) {
        Base obj = new Base();
        //obj.setX(5);
        //obj.printMessage();
        //System.out.println(obj.getX());
//===============================================================================================================================================
        Derived obj1 = new Derived();
        obj1.setX(6);
        obj.printMessage();
        obj1.setY(7);
        System.out.println(obj1.getX());
        obj1.printMessage1();
        System.out.println(obj1.getY());
    }
}