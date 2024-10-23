public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println(100/0);
            System.out.println("2");
        }
        //System.out.println("hii");
        catch(ArithmeticException e){
            System.out.println("3");
        }
        //System.out.println("hii");
        finally{
            System.out.println("4");
        }
        System.out.println("1111");
        try{
            System.out.println("44");
        }
        catch(Throwable e){
            System.out.println("5");
        }
        System.out.println("6");
    }
}
