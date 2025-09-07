import java.util.Scanner;

public class Practiceset1 {
    public static void main(String[] args) {
     //Question1
        // int a = 4;
        // int b = 5;
        // int c = 6;
        // int sum = a + b +c;
        // System.out.println(sum);

    //Question2
        // float subject1 = 45;
        // float subject2 = 95;
        // float subject3 = 48;
        // float cgpa = (subject1 + subject2 + subject3)/30.0f;
        // System.out.println(cgpa);

    //Question3
    
        // System.out.println("What is your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Helllo " + name + " have a nice day!");

    //Question4
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sc.hasNextInt());
        System.out.println(num);
        System.out.println(sc);
    }
}