import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int i = 1;
          long factorial = 1;
         while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
        
      
      