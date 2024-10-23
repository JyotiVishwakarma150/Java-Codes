class A{
    // void show(){ 
    //     System.out.println("i am in class A");   
    // }
    A(){
        System.out.println("i am A class constructor");
    }

}
class B extends A{
    B(){
        super();
        System.out.println("i am B class constructor");
      //  super();
    }
    
    // void show(){
    //     //super.show1();
    //     //System.out.println(no);
    //     //System.out.println(this.no);
    //     System.out.println("i am in class B");
    // }
    // void m1(){
    //     super.show();
    // }
}

class SuperTest {
    public static void main(String[] args) {
        //B ob = new B();
       //ob.show1();
       //ob.show2();
      // ob.m1();
    //  ob.show();
    }
}
