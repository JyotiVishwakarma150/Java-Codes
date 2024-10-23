class DivisonByZeroException extends RuntimeException{
    DivisonByZeroException(String message){
        super(message);
    }
}
public class Testuncheckedexception {
    static void divide(int a, int b){
        if(b==0){
            throw new DivisonByZeroException("Cannot divide by zero.");
        }
        else{
            System.out.println("Result : "+ a/b);
        }
    }
    public static void main(String[] args) {
        try{
            divide(10, 0);
        }
        catch(DivisonByZeroException e){
            System.out.println("caught exception : "+ e.getMessage());
        }
    }
}
