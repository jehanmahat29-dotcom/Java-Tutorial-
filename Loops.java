

public class Loops {
    public static void main(String[] args) {

        //While Loop Example----------------------------------------------
    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
        }
        System.out.println("While loop completed");

        //Do-While Loop Example-------------------------------------------
    int j = 1;
    do {
        System.out.println(j);
        j++;
        } while (j <= 5);
        System.out.println("Do-While loop completed");
      

        //For Loop Example------------------------------------------------
    for (int k = 1; k <= 3; k++) {
        System.out.println(k);
        }
        System.out.println("For loop completed");

        //Quiz 1---------------------------------------------------------
        for( int l = 1; l <= 10; l++) {
            if (l % 2 == 1) {
                System.out.println(l);
            }
        }
        System.out.println("Quiz completed");

        //Quiz 2---------------------------------------------------------
        for (int y = 10; y != 0; y--) {
            if (y<=10){
                System.out.println(y);
            }
        }
        System.out.println("these are Natural Numbers");

        //Break and Continue--------------------------------------
            for (int m = 1; m <=10; m++) {
                System.out.println(m);
                System.out.println("Java is a programming language");
                if (m == 2) {
                    System.out.println("Ending the Loop");
                    break;
                }
            }
            System.out.println("Loop ended here");

            for(int n = 0; n <= 15;n++){
                if (n==5){
                    System.out.println("Skipping the number 5");
                    continue;
                }
                System.out.println(n);
                System.out.println("Java is great language");
            }
            

            
        }
}