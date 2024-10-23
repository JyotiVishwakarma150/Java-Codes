//import java.util.*;
public class Exceptiontrycatch {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
           // int[] a={10,20,30,40,50};
            //System.out.println(a[5]);
            // System.out.println("1");
            // int a=100,b=2,c;
            // System.out.println("2");
            // c=a/b;
            // System.out.println("3");
            // System.out.println(c);
            // System.out.println("4");
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array Inder out of bounds.......");
        //     // System.out.println("5");
        //     // System.out.println("you cannot divide by zero");
        //     // System.out.println("6");
        // }
        catch(ArithmeticException e){
           // System.out.println(e);
           //System.out.println(e.getMessage());
           e.printStackTrace();
            //System.out.println("you cannot divide by zero");
        }
        System.out.println("----------Thank you--------------------------");
    }
}
