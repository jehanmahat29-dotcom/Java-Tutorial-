import java.util.Scanner;

public class Practiceset2 {
    public static void main(String[] args) {
        //char grade = 'B';

        //Encrypting the grade
        // grade = (char)(grade + 8);
        // System.out.println(grade);

        //Decrypting the grade
        // grade = (char)(grade - 8);
        // System.out.println(grade);

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println(a>8);
        }
        
    }
}
