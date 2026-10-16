
//1. print "The Value is not valid" if hours outside 1-24

/*public class HoursValidation{
  public static void main(String[]args){ 
  
    int hours = 25;
  
    if( hours < 1 || hours > 24) {
       System.out.println("The Value is not valid");
    
    }
  
  
  
  }
}*/


import java.util.Scanner;
public class HoursValidation{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter hours: ");
  
  int hours = input.nextInt();
  
  if(hours < 1 || hours > 24){ 
    System.out.println("The value is not valid");
  
  }
  
  
  
  
  
  }
  
  

}
