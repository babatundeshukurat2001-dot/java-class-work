import java.util.Scanner;
public class Hello{
   public static void main(String[] args){
Scanner input = new Scanner(System.in);
//int [] scores = new int[10];
int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
int Sum = 0;
int average = 0;
int highest = scores[0];
int lowest = scores[0];
int range = scores[0];
 for(int count = 0; count < scores.length; count++){
    if(scores[count] > highest){
highest = scores[count];
} 
    if(scores[count] < lowest){
lowest = scores[count];
}
Sum += scores[count];
average = Sum / scores.length;
range = highest - lowest;
//System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]+score[5]+
//score[6]+score[7]+score[8]+score[9]);
   // System.out.println("Enter number of scores");
   // for(int count = 0; count < scores.length; count++){

//System.out.print("Score " + (count + 1) + ": ");
           // scores[count] = input.nextInt();
//}

}
System.out.println(Sum);
System.out.println(average);
System.out.println(highest);
System.out.println(lowest);
System.out.println(range);
} 
}




