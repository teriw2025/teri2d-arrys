
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] arr2d){
        for (int row = 0; row < arr2d.length; row++) {
            for (int column = 0; column < arr2d[row].length; column++) {
                System.out.print(arr2d[row][column] + " ");
            }
        }
        System.out.println();
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] arr2d){
        int mySum = 0;
        for (int row = 0; row < arr2d.length; row++){
            for (int column = 0; column < arr2d[row].length; column++){
                mySum += arr2d[row][column];
            }
        }
        return mySum;

    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] arr2d){
        double avg = sum(arr2d);
        avg = avg/(arr2d.length*arr2d.length);
        return avg;
        }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] arr2d){
        int min = arr2d[0][0];

        for (int row = 0; row < arr2d.length; row++) {
            for (int column = 0; column < arr2d[row].length; column++) {
                if (min > arr2d[row][column]) {
                    min = arr2d[row][column];
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr2d){
        int max = 0;

        for (int row = 0; row < arr2d.length; row++){
            for (int column = 0; column < arr2d[row].length; column++){
                if(max < arr2d[row][column]){
                    max = arr2d[row][column];
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr2d){
        int count = 0;

        for (int row = 0; row < arr2d.length; row++) {
            for (int column = 0; column < arr2d[row].length; column++) {
                if (arr2d[row][column] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

        // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
        public static int evenCountEnhanced(int[][] arr2d){
            int count = 0;

            for(int[] row: arr2d){
                for(int val: row){
                    if(val % 2 == 0){
                        count++;
                    }
                }
            }
            return count;
        }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
        public static boolean allPositive(int[][] arr2d){
            for(int[] row: arr2d){
                for(int val: row){
                    if(val < 0){
                        return false;
                    }
                }
            }
            return true;
        }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] arr2d){
        int[] sumList = new int[arr2d.length];
        int columnSum = 0;

        for (int row = 0; row < arr2d.length; row++) {
            for (int column = 0; column < arr2d[row].length; column++) {
                columnSum += arr2d[row][column];
            }
            sumList[row] = columnSum;
            columnSum = 0;
        }
        return sumList;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] arr) {
        int[] sumList = new int[arr.length];
        int rowSum = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                rowSum += arr[column][row];
            }
            sumList[row] = rowSum;
            rowSum = 0;
        }
        return sumList;
    }
}

