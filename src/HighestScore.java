import java.util.Scanner;

public class HighestScore {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int count = input.nextInt();
    int num_students = 0;
    double max = 0;
    String max_name = " ";
    double max2 = 0;
    String max2_name = " ";
    
    while(num_students < count){
      System.out.print("Enter the student's name and score: ");
      String name = input.next();
      double score = input.nextDouble();
      
      if (score > max){
        max2 = max;
        max2_name = max_name;
        max = score;
        max_name = name;
      } // if
      else if (score > max2){
        max2 = score;
        max2_name = name;
      } // if
      
      num_students++;
    } // while
    
    System.out.println(max_name + " has the highest score: " + max);
    System.out.println(max2_name + " has the second highest score: " + max2);
  } // main   
} // HighestScore
