//Sum all odd numbers from 1-50.

/*public class SumOddNumbers{ 

  public static void main(String[]args){ 
  
    int sum = 0;
  
    for(int number = 1; number <= 50; number += 2){
    sum = sum + number;
    
    }
       System.out.println("Total Sum of Odd Numbers: " + sum);
  }


}*/


public class SumOddNumbers{
  public static void main(String[]args) {
  
    int sum = 0;
    int number = 1;
    
    while(number <= 50) {
    
    sum = sum + number;
    number = number + 2;
    
    }
    System.out.println("The Sum of the total Odd Numbers: " + sum);
  }
}
