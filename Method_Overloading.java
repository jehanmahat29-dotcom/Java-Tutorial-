

public class Method_Overloading {
    static void foo() {
        System.out.println("Good Morning bro!");
    }
    static void foo(int a) {
        System.out.println("Good Morning " + a + " bro!");
    }
//---------------------------------------------------------------------------->>>
    static void change(int a) {
        a = 99;
    }
    static void tellJoke() {
        System.out.println("invented a new word!\nplagiarism");
        }
        public static void main(String[] args) {
            tellJoke();
            //int [] marks = {98,45,79,99,88};
            int x = 98;
            change(x);
            System.out.println("The value of x is after change is: " + x);
//---------------------------------------------------------------------------->>>
            //Method Overloading
            foo();
            foo(3000);
        }
    }