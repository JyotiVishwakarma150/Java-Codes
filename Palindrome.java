public class Palindrome {
    public static void main(String[] args) {
        String str="abcba";
        String rev ="";
        int leng = str.length();
        for(int i=leng-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
   

}
