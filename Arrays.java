import java.util.Scanner;
    public class Arrays{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
//int [] number = new int[5];
//System.out.println("Enter a number: ");
    
    //for(int count = 0; count < number.length; count++){
//System.out.println("Number " + (count + 1) + ": ");
   // number[count] = input.nextInt();
//}
//int []  numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//int sum = 0;
//int Highest = 0;
//int Lowest = 0;
//int even = 0;
//int decending = 0;
//int average = 0;
//for(int count = 0; count < numbers.length; count++){
//for (int count = numbers.length - 1; count >= 0; count--) {
  // if (numbers[count] > Highest){
//Highest = numbers[count];
//}
   // if (numbers[count] < Lowest){
//Lowest = numbers[count];
//}
//sum += numbers[count];

//    if(numbers[count] % 2 == 0) {
//even++;
//}
//System.out.println(sum);
//System.out.println(Highest);
//System.out.println(Lowest);
//System.out.println(numbers[count] + " ");
//}
//average += sum / numbers.length;

//System.out.println(even);
//System.out.println(sum);
//System.out.println(average);

int[] a = {1, 2, 3};
int[] b = {4, 5, 6};

int[] mergedNumber = new int[a.length + b.length];

for (int count = 0; count < a.length; count++) {
    mergedNumber[count] = a[count];
}
for (int index = 0; index < b.length; index++) {
    mergedNumber[a.length + index] = b[index];
}

for (int numbers : mergedNumber) {
    System.out.print(numbers + " " );
}

}
}

