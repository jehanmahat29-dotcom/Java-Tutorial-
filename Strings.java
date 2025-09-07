import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String name = new String("Jehan");
        // String name = "Jehan";
        // System.out.print("The name is ");
        // System.out.println(name);

        // int a = 6;
        // float b = 5.6f;
        // System.out.printf("The value of a is %d and the value of b is %f", a, b);
        
         try (Scanner sc = new Scanner(System.in)) {
            //String st = sc.next();
            String st = sc.nextLine();
            System.out.println(st);
         }
    }
}
