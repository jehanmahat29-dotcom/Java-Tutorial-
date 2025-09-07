public class Multidimensional_Array {
    public static void main(String[] args) {
        int[][] flats; //2D Array

        flats = new int[2][3];
//1st floor-----------------------------------------> 3 flats
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
//2nd floor-----------------------------------------> 3 flats
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing 2D Array using for loop");
        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                System.out.print(flat[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
