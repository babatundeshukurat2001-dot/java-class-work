//Write a function called printArray that takes an integer array and prints all //elements on a new line using a for loop.
//int[] numbers = {10, 20, 30, 40, 50};
 

public class ArraysPlay {

    public static void printArray(int[] array) {
        for (int count = 0; count < array.length; count++) {
            System.out.println(array[count]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
    }
}




