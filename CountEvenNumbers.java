//Count how many even numbers are between 1 and 100.

/*public class CountEvenNumbers{ 
public static void main(String[]args){

  int count = 0;
  
  for( int number = 1; number <= 100; number++) { 
  
    if(number % 2 == 0) {
     count++;
    
    
    }
    
    
  }

    System.out.println("Total Even numbers are: " + count);
}

}*/


public class CountEvenNumbers{
public static void main(String[]args){ 

  int number = 1;
  int count = 0;
  
  while(number <= 100){
    if(number % 2 == 0){
  count++;
  }
  number++;
  }
  System.out.println("Total Even Numbers: " + count);
  

}
}

