class Outer{
    // void show1(){
    //     System.out.println("1");
    // }
    private int a=10;
    class Inner{
        void show2(){
            System.out.println(a);
        }
    }
}

class MemberInnerClass {
   public static void main(String[] args) {
    Outer ob1 = new Outer();
   // ob1.show1();
    Outer.Inner ob2 = ob1.new Inner();
    ob2.show2();
   }   
}
