// import java.io.FileInputStream;
// import java.io.FileNotFoundException;

public class exceptionhandling {
    public static void main(String[] args) //throws FileNotFoundException
     {
       try{
        int a=100,b=2,c;

        c=a/b;
        System.out.println(c);
       }
        catch(ArithmeticException e){
            System.out.println("you cannot divide by zero");
        }
     System.out.println("-------------Thank you ------------------");
    }
  
}
