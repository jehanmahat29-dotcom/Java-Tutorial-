import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt();
        }
        switch(age){
            case 18 -> System.out.println("You are going to be an adult");
            case 21 -> System.out.println("You are an adult now");
            case 56 -> System.out.println("You are going to be a senior citizen");
            default -> System.out.println("Enjoy your life");  
        }
        // if (age>56){
        //     System.out.println("You are Experienced");
        // }
        // else if (age>46){
        //     System.out.println("You are Semi-experienced");
        // }
        // else if (age>36){
        //     System.out.println("You are Semi-Semi-experienced");
        // }
        // else{
        //     System.out.println("You are not experienced");
        // }
    }
}
