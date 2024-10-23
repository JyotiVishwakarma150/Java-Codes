public class BreakDemo {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     System.out.println(i);
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println("hii");
        // } 
        // System.out.println("hello");

        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         System.out.println(i);
        //         break;
        //        // System.out.println("hii");
        //     }
        // }

        outer:
        for(int i=1;i<=3;i++){
            System.out.println("i : "+ i);
           // inner: 
            for(int j=1;j<=3;j++){
                System.out.println("j : "+ j);
                if(j==2){
                    break outer;
                }
            }
        }
    }
}
