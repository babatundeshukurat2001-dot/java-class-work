import java.util.Arrays;

public class ArrayPractices{
    public static void main(String[] arg){

//int[] arr = {1, 2, 3, 4, 5, 1, 4, 4,};
//for (int count = 0; count < arr.length; count++) { // To print an array
   // System.out.println(arr[count]);
//}
// System.out.println(arr.length); // To print array lenght

//System.out.println("first: " + arr[0]);
//System.out.println("last: " + arr[arr.length -1]);  //To find first and last array

//int sum = 0;
   // for (int num: arr){
   // sum += num;
//}
//System.out.println(sum);   // To print sum of array

//int max = arr[0];
   // for(int num : arr){
    //if (num > max) max = num;
//}
//System.out.println(max);

//int min = arr[0];
   // for(int num : arr){
   // if (num < min) min = num;
//}
//System.out.println(min);   // To print min array

//int even = 0, odd = 0;
   // for (int num : arr) {
   // if(num % 2 == 0) even++;
   // else odd++;
//}
//System.out.println("Even: " + even + ", odd: " + odd);   // To print odd and even array

//Arrays.sort(arr);
       // System.out.println("\nSorted: " + Arrays.toString(arr));

//Arrays.sort(arr);
//for (int i = arr.length - 1; i >= 0; i--) {
    //System.out.print(arr[i] + " ");  // To print decending in array
//}
//int target = 4, count = 0;
   // for (int num : arr){
   // if (num == target) count++;
//}
//System.out.println(count);   // To print number of occurance
   
//for (int i = 0; i < arr.length; i++) {
   // boolean isDuplicate = false;
    //for (int j = 0; j < i; j++) {
       // if (arr[i] == arr[j]) {
           // isDuplicate = true;
            //break;
        //}
   // }
   // if (!isDuplicate) {
       // System.out.print(arr[i] + " ");
    //}
//}

int[] a = {1, 2, 3};
int[] b = {4, 5, 6};

int[] merged = new int[a.length + b.length];

for (int count = 0; count < a.length; count++) {
    merged[count] = a[count];
}
for (int index = 0; index < b.length; index++) {
    merged[a.length + index] = b[index];
}

for (int num : merged) {
    System.out.print(num + " ");
}
}
}
