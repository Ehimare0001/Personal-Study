//Find the sum of even numbers from 1 to N(N entered by user).

/*import java.util.Scanner;
public class SumEvenNumbers{
  public static void main(String[]args) { 
  
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter N: ");
    int N = input.nextInt();
    
     int sum = 0; 
    for(int number = 2; number <= N; number += 2){ 
      sum = sum + number; 
    
     
    }
   System.out.println(sum);
    
  }
}

import java.util.Scanner;
public class SumEvenNumbers{
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter N: ");
  int N = input.nextInt();
    int sum = 0;
    int number = 2; 
    
    while(number <= N) {
    
    sum = sum + number;
    number = number + 2;
   }
    System.out.println(sum);
    
    
    
    }
  
  }*/




import java.util.Scanner;
public class SumEvenNumbers{
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter N: ");
  int N = input.nextInt();
  
  int sum = 0;
  
  for(int number= 2; number <= N; number += 2){
  
    sum = sum + number;
  
  }
  
  System.out.println(sum);
}

}
