//Write a Java program that reads 5 numbers and prints their product.
import java.util.Scanner;
public class Products{

  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);
  
    int product = 1;
    int count = 1;
    
    while(count <= 5){
    
      System.out.print("Enter number: " + count + ": ");
      
      int number = input.nextInt();
      
      product = product * number;
      count++;
      
      
      }
      
    System.out.println(product);
  }
    

}































