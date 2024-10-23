public class StarPatterns3 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int k=i;k>=1;k--){
                System.out.print("*");
              }
              for(int j=4;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
