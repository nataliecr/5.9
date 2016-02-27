import java.util.Scanner;

public class HighestScore {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int count = input.nextInt();
    int num_students = 0;
    double max = 0;
    String max_name = " ";
    
    while(num_students < count){
      System.out.print("Enter the student's name and score: ");
      String name = input.next();
      double score = input.nextDouble();
      if (score > max){
        max = score;
        max_name = name;
      } // if
      num_students++;
    } // while
    
    System.out.println(max_name + " has the highest score: " + max);
  } // main   
} // HighestScore
