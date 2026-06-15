public class ArrayFunctions {

    // Q1. Print all elements on new line using for loop
    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    // Q2. Returns first element
    public static int getFirst(int[] array) {
        return array[0];
    }

    // Q3. Returns last element
    public static int getLast(int[] array) {
        return array[array.length - 1];
    }

    // Q4. Counts elements using for loop
    public static int getLength(int[] array) {
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            count++;
        }
        return count;
    }

    // Q5. Return element at given index
    public static int getElement(int[] array, int index) {
        return array[index];
    }

    // Q6. Print each element with its index
    public static void printWithIndex(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println("Index " + index + ": " + array[index]);
        }
    }

    public static void main(String[] args) {
        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Question 1 - printArray:");
        printArray(numbers1);

        System.out.println("Question 2 - First element: " + getFirst(numbers1));
        System.out.println("Question 3 - Last element: " + getLast(numbers1));
        System.out.println("Question 4 - Length: " + getLength(numbers2));
        System.out.println("Question 5 - getElement(numbers1, 2): " + getElement(numbers1, 2));

        System.out.println("Question 6 - printWithIndex:");
        printWithIndex(numbers1);
    }
}
