
import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Check Weather Number is Even or ODD = ");
      int a = sc.nextInt();
     
      
      if(a%2 == 0){
          System.out.println("Even");
      }
      else {
          System.out.println("Odd");
          
      }
       
    }
    
}