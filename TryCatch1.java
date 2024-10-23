// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
public class TryCatch1 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(100/0);
          // FileInputStream fis = new FileInputStream(" ");
          // System.out.println("2");
        }
        // catch(Throwable e){
        //     System.out.println("3....");
        // }
        catch(ArithmeticException e){
            System.out.println("3!!!!");
        }
        System.out.println("4");
    }
}
