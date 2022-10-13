
import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Cost of the Pen = ");
        float cpen = read.nextFloat();
        System.out.println("Cost of the Pencil = ");
        float cpencil = read.nextFloat();
        System.out.println("Cost of the Eraser = ");
        float ceraser = read.nextFloat();
        System.out.println("------------------------------- ");
        float ctotal = cpen + cpencil + ceraser ;
        System.out.print("The total cost of your items = " );
        System.out.println(ctotal);
        System.out.println("------------------------------- ");
         float cgst = ( ctotal * 18 / 100);
        System.out.print(" The total cost after applying GST = ");
        System.out.print(cgst + ctotal );
        
        
        
        
    }
}