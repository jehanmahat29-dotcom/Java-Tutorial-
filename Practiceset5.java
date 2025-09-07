public class Practiceset5 {
    public static void main(String[] args) {
        //problem 1
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        //problem 2
        int sum = 0;
        int n2 = 5;
        for (int i = 0; i < n2; i++) {
            sum = sum + (2 * i);
        }
        System.out.println("Sum of even numbers is: ");
        System.out.println(sum);

        //problem 3
        int n3 = 5;
        for(int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n3,i,n3*i);
        }

        //problem 4
        int n4 = 5;
        //What is factorial n = n * n-1 * n-2 * ......1
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        int i = 1;
        int fact = 1;
        while (i <= n4) {
            fact *= i;
            i++;
        }
        System.out.println(fact);

        //problem 5
        int n5 = 8;
        int sum1 = 0;
        for (int j = 1; j <= 10; j++) {
            sum1 += n5*j;
        }
        System.out.println(sum1);
        
    }
}
