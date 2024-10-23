public class Factorial {
    static int fact = 1;
    public static void main(String[] args) {
        int no = 5;
        Factorial ob = new Factorial();
        int res = ob.CalcFact(no);
        System.out.println(res);
        System.out.println("Factorial of "+ no + " is "+fact); 
    }
    int CalcFact(int no){
        if(no >= 1){
            fact = fact * no;
            no--;
            CalcFact(no);
        }
        return fact;
    }
}
