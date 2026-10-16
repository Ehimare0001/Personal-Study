/*public class ArithmeticPowerSolving{  
	public static void main(String[]args){
	
	double result;
	//result = Math.pow(8, 3);
	//result = Math.round(3.17);
	//result = Math.ceil(3.17);
	//result = Math.floor(4.78);
	//result = Math.sqrt(25);
	//result = Math.max(67, 45);
	//result = Math.min(54,12);
	
	
	System.out.println(result);
	
	}

}
*/

//------PRINT HYPOTENUSE c = Math.sqrt(a^2 + b^2)

/*import java.util.Scanner;
public class ArithmeticPowerSolving{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the length of side A: ");
  double a = input.nextDouble();
  
  System.out.print("Enter the length of side B: ");
  double b = input.nextDouble();                                         
  
   double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  
  System.out.println(c); 
  */
  
  //----PRINT----CIRCUMFERENCE, AREA, VOLUME ---------
 // Circumference = 2PIr = 2 * Math.PI * radius
 // Area = PIr^2 = Math.PI * radius * radius
 // Volume = (4/3)PIr^3 = (4.0/3.0) * Math.PI * Math.pow(radius, 3)
  //}
 //}
 
/*import java.util.Scanner;
public class ArithmeticPowerSolving{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter radius: ");
  double radius = input.nextDouble();
  
  double circumference = 2*(Math.PI) * radius;
  
  double area = Math.PI * Math.pow(radius, 2);
  
  double volume = (4/3) * Math.PI * Math.pow(radius, 3);
  
  System.out.println("Radius is: " + radius);
  System.out.println("Area is: " + area);
  System.out.println("Volume is: " + volume);
  }

}


//--------COMPOUNDED INTEREST AMOUNT--------------------
//A = P(1 + r/n)^nt

import java.util.Scanner;
public class ArithmeticPowerSolving{ 
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in); 
  System.out.print("Enter Principal amount: ");
  double principal = input.nextDouble();
  
  System.out.print("Enter interest rate: ");
  double rate = input.nextDouble()/100;
  
  System.out.print("Enter times compounded: ");
  int timesCompounded = input.nextInt();
  
  System.out.print("Enter year: ");
  int year = input.nextInt();
  
  double amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * year);
  
  System.out.println("The Amount is: " + amount);
  
  }
  
}
*/
//--------PRINT LENGTH, CHARAT, INDEXOF, LASTINDEX, TOUPPERCASE, TOLOWERCASE, TRIM-----

//public class ArithmeticPowerSolving{
  //public static void main(String[]args){
  
    //String name = "   Ehimare Odafen      ";
    //int length = name.length();
    //char letter = name.charAt(8);
    //int index = name.indexOf("a");
    //int lastIndex = name.lastIndexOf("e");
    //name = name.toUpperCase();
    //name = name.toLowerCase();
    //name = name.trim();
    //name = name.replace("O", "E");
    
    //System.out.println(length);
    //System.out.println(letter);
    //System.out.println(index);
    //System.out.println(lastIndex);
    //System.out.println(name);
    //System.out.println(name);
    
  
 // }



//}
  
 /* import java.util.Scanner;
  public class ArithmeticPowerSolving{ 
    public static void main(String[]args){ 
     
     Scanner input = new Scanner(System.in);
     System.out.print("Enter length side of A: ");
     double a = input.nextDouble();
     
     System.out.print("Enter length side of B: ");
     double b = input.nextDouble();
     
     double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
     
     System.out.println("The Hypotenuse of (side C) is " + c);
     
     
    
    }
  
  }
  
*/










