public class CalcIntegerDigits {
    public static void main(String[] args) {
        int no=567300;
        int leng = 0;
        int temp = no;
        while(temp != 0){
             leng++;
             temp = temp/10;
        }
        System.out.println("Length of " + no + " is " +leng);
    }
}
