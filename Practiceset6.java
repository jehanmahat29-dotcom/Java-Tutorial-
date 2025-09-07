public class Practiceset6 {
    public static void main(String[] args) {
        
        //Problem 1==============================================================>
        float[] arr = {1.2f,3.5f,6.7f,8.9f,9.6f};
        float sum = 0.1f;
        for (float element : arr) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


        //Problem 2==============================================================>
        int[] marks = {1,2,3,4,5};
        int num = 6;
        boolean isArray = false;
        for (int element : marks) {
            if (num == element) {
                isArray = true;
                break;
            }
        }
        if (isArray) {
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }

        //Problem 3===============================================================>
        float[] marks1 = {95.6f,90.2f,82.7f,89.5f,98.3f};
        float sum1 = 0f;
        for (float element : marks1) {
            sum1 = sum1 + element / marks1.length;
        }
        System.out.println("The value of sum is " + sum1);


        //problem 4==============================================================>
        int[][]arr1 = {{1,2,3},
                       {4,5,6}};
        int[][]arr2 = {{7,8,9},
                       {10,11,12}};
        int[][]result = {{0,0,0},
                       {0,0,0}};
                      
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        //Print the result array
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
        //Problem 5==============================================================>
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int l = arr3.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = arr3[i];
            arr3[i] = arr3[l - 1 - i];
            arr3[l - 1 - i] = temp;
        }
        for (int i = 0; i < l; i++) {
            System.out.println(arr3[i]);
        }
        
        //Problem 6===============================================================>
        int[] numbers = {45, 12, 78, 34, 89, 23};

        System.out.println("Method 1");
        // Assume first element is the max
        int max = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current number is greater
            }
        }

        // Print the maximum number
        System.out.println("Maximum number in the array: " + max);

        //another method==========================================================>
        System.out.println("Method 2");
        int max1 = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max1 = numbers[i];
            }
        }
        System.out.println("Maximum number in the array: " + max1);

        //another method==========================================================>
        System.out.println("Method 3");
        int max2 = 0;
        for(int e:numbers){
            if(e>max2){
                max2 = e;
            }
        }
        System.out.println("Maximum number in the array: " + max2);

        //Problem 7===============================================================>
        int[] arr4 = {11, 42, 93, 64, 25, 76};
        boolean isSorted = false;
        for(int i=0;i<arr4.length;){
            if(arr4[i] <arr4[i+1]);{
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}