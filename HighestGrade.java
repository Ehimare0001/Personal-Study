//Write a Java program that reads grades until -1 and prints the highest grade.


import java.util.Scanner;

public class HighestGrade{

  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter grade: ");
  
  int grade = input.nextInt();
  
  int highest = grade;
  
  while(grade != -1){ 
    if (grade > highest){
      highest = grade;
    }
      System.out.println("Enter a grade: ");
        grade = input.nextInt();
  }
  
  System.out.println("The Highest Grade is: " + highest);
  
  }
}
