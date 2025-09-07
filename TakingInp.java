import java.util.*;

public class TakingInp {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        //float a = sc.nextFloat();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        //float b = sc.nextFloat();
        System.out.println("enter number 3");
        int c = sc.nextInt();
        //float c = sc.nextFloat();
        System.out.println("Enter number 4");
        int d = sc.nextInt();
        //float d = sc.nextFloat();
        System.out.println("Enter number 5");
        int e = sc.nextInt();
        //float e = sc.nextFloat();
        System.out.println("Enter number 6");
        int f = sc.nextInt();
        //float f = sc.nextFloat();
        int sum = a + b + c + d + e + f;
        float avg = sum / 6.0f;
        //float sum = a + b;
        System.out.println("Your percentage is");
        System.out. print(avg);
        System.out.println(sc);
        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);
    }
}