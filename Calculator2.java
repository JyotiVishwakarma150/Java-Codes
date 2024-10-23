import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no1 , no2;
        String sym,yn;
        do{
            System.out.println("Enter first no : ");
            no1 = s.nextInt();

            System.out.println("Enter second number : ");
            no2 = s.nextInt();

            System.out.println("Enter Symbol (+,-,*,/)");
            sym = s.next();

            switch(sym){
                case "+": System.out.println("result is : " + (no1+no2));
                break;
                case "-": System.out.println("result is : " + (no1-no2));
                break;   
                case "*": System.out.println("result is : " + (no1*no2));
                break;  
                case "/": System.out.println("result is : " + (no1/no2));
                break; 
                default : System.out.println("invalid");
                break;   
            }
            System.out.println("Do you want to continue (Press y for yes or n for no)");
            yn = s.next();
            System.out.println("------------------------------------------------------------------");
            System.out.println(s);
        }
        while(yn.equals("y") || yn.equals("Y"));
    }
}
