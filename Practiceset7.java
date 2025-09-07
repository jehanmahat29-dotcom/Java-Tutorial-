public class Practiceset7 {
    //Question 1=================================================================
    //Q.1] Writ a java method to print multipication table of a number n.
    static void multipicationTable(int n){
        for (int i = 1; i <= 10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
    }
}

//Question 2=================================================================
//Q.2] Write a program usinng functions to print the following patern:
//       *
//      * *
//     * * *
//    * * * *
static void pattern(int n) {
    for(int i=0; i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//Question 3=================================================================
//Q.3] Write a recursive function to calclate sum of first n natural numbers.
static int sumRec(int n) {
    if(n==1){
        return 1;
    }
        return n + sumRec(n-1);
}
//Question 4=================================================================
//Q.4] Write a function to print the following patern:
// * * * *
//  * * *
//   * *
//    *
static void pattern2(int n) {
    for(int i=0; i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
//Question 5=================================================================
//Q.5] Write a function to print nth term of fibonacci series using recursion.
//fibonacci series = 0,1,1,2,3,5,8,13,21,....,nth term
static int fib (int n){
    if(n!=1)if(n==2){
        return 1;
    }
    else{
        return fib(n-1) + fib(n-2);
    }
    else {
        return 0;
        }
}
//Question 6=================================================================
//Q.6] Write a function to find average of a set of numbers passed as arguments
public static int sum(int... arr) {
       //Available int []arr;
       int result = 0;
        for(int a:arr)
        {
            result += a;
        }
        return result;
    }
//Question 7=================================================================
//Q.7] convert celsisus to fahrenheit
static float celsisusToFahrenheit(float celsius) {
    float fahrenheit = ((celsius * 9) / 5) + 32;
    return fahrenheit;
}
public static void main(String[] args) {
    //q.1]
    multipicationTable(5);
    //q.2]
    pattern(10);
    //q.3]
    int c = sumRec(3);
    System.out.println(c);
    //q.4]
    pattern2(10);
    //q.5]
    int result = fib(5);
    System.out.println(result);
    //q.6]
     System.out.println("The average of the given set is " + (sum(1,2,3,4,5,6,7,8,9,10))/10);
    //q.7]
    System.out.println("The temperature in fahrenheit is " + celsisusToFahrenheit(25));
}
}
