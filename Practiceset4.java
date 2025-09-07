import java.util.Scanner;

public class Practiceset4 {
    public static void main(String[] args) {

        // Question 1
      //   int a = 10;
      //   if (a == 11)
      //   System.out.println(" I am 11");
      //   else {
      //       System.out.println(" I am not 11");
      //   }

        // Question 2
        //byte m1, m2, m3;
      //  Scanner sc = new Scanner(System.in);
      //   System.out.println("Enter your marks in Physics");
      //   m1 = sc.nextByte();
      //   System.err.println("Enter your marks in Chemistry");
      //   m2 = sc.nextByte();
      //   System.out.println("Enter your marks in Mathematics");
      //   m3 = sc.nextByte();
      //   float avg = (m1 + m2 + m3) / 3.0f;
      //   if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
      //   System.out.println("You are eligible for admission");
      //   else
      //   System.out.println("You are not eligible for admission");

        // Question 3
      //   Scanner sc = new Scanner(System.in);
      //   System.out.println("Enter your income in lakhs per annum");
      //    float tax = 0;
      //    float income = sc.nextFloat();

      //    if(income<=2.5){
      //       tax = tax + 0;
      //    }
      //     if(income>2.5f && income <=5f){
      //       tax = tax + 0.05f*(income-2.5f);
      //    }
      //     else if(income>5f && income <=10.0f){
      //       tax = tax + 0.05f*(5.0f-2.5f);
      //       tax = tax + 0.2f*(income-5f);
      //    }
      //    else if(income>10f){
      //       tax = tax + 0.05f*(5.0f-2.5f);
      //       tax = tax + 0.2f*(10.0f-5f);
      //       tax = tax + 0.3f*(income-10.0f);
      //    }
      //    System.out.println("Total tax paid by the employee is: "+ tax);

         // Question 4
         // Scanner sc = new Scanner(System.in);
         // int day = sc.nextInt();
         // switch(day){
         //    case 1:
         //        System.out.println("Monday");
         //        break;
         //    case 2:
         //        System.out.println("Tuesday");
         //        break;
         //    case 3:
         //        System.out.println("Wednesday");
         //        break;
         //    case 4:
         //        System.out.println("Thursday");
         //        break;
         //    case 5:
         //        System.out.println("Friday");
         //        break;
         //    case 6:
         //        System.out.println("Saturday");
         //        break;
         //    case 7:
         //        System.out.println("Sunday");
         //        break;
         //    default:
         //        System.out.println("Invalid day number");
         //        break;
         // }

         // // Question 5
         // Scanner sc = new Scanner(System.in);
         // int year = sc.nextInt();
         // if (year % 4 == 0) {
         //     if (year % 100 == 0) {
         //         if (year % 400 == 0) {
         //             System.out.println("Leap Year");
         //         } else {
         //             System.out.println("Not a Leap Year");
         //         }
         //     } else {
         //         System.out.println("Leap Year");
         //     }
         // } else {
         //     System.out.println("Not a Leap Year");
         // }

         try (// Question 6
         Scanner sc = new Scanner(System.in)) {
            String website = sc.next();
             if(website.endsWith(".org")) {
                 System.out.println("This is an organization website");
             } else if(website.endsWith(".com")) {
                 System.out.println("This is a commercial website");
             } else if(website.endsWith(".in")) {
                 System.out.println("This is an Indian website");
             } else if(website.endsWith(".edu")) {
                 System.out.println("This is an educational website");
             } else {
                 System.out.println("This is not a recognized website type");
             }
         }
    }
}
