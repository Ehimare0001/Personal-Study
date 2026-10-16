//Find the product of numbers 1 to 5(factorial of 5).

public class Factorial { 
  public static void main(String[]args) {
  
    int product = 1;
    
    for( int i = 1; i <= 5; i++) { 
    
    product = product * i;
    
    
    }
  
    System.out.println("The Factorial of 5 is:" + product);
  }


}
