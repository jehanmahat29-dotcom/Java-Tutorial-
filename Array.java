public class Array {
    public static void main (String[] args) {
        /*Class of 500 students - You have to store marks of 500 students
        You have 2 options:
        1. Create 500 variables
        2.Use Arrays (Recommended)
        */

        // int[] marks = new int[5];
        // marks[0] = 100;
        // marks[1] = 90;
        // marks[2] = 80;
        // marks[3] = 70;
        // marks[4] = 60;
        // System.out.println(marks[4]);

        int [] marks = {98,45,79,99,88};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

        System.out.println("Printing using for each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
