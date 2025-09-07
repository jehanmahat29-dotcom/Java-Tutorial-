public class Logicaloperators {
    public static void main(String[] args) {
        System.out.println("For logical AND");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
//-------------------------------------------------------------------//

        System.out.println("For logical OR");
        if (a||b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For logical NOT");
        System.err.println("Not(a) is: ");
        System.out.println(!a);
        System.err.println("Not(b) is: ");
        System.out.println(!b);
    }
}
