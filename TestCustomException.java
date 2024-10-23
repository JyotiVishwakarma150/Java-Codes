class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class TestCustomException {
    static void  validateAge(int age) throws InvalidAgeException
    {
   if(age < 18){
    throw new InvalidAgeException("Age is not valid for voting ");
   }
   else{
    System.out.println("Eligible to vote");
   }
    }
    public static void main(String[] args) {
        try{
            validateAge(15);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught exception : "+e.getMessage());
        }
    }
}
