 class A{
    void show1(){
        System.out.println("1");
    }
    //static int a=10;
    static void show2(){
        //this.show1();// it will give error
        System.out.println("2");
    }
 }
 
 class StaticMethodsDemo {
    
    public static void main(String[] args) {
        //StaticMethodsDemo ob = new StaticMethodsDemo();
       // A ob = new A();
        A.show2();
       // StaticMethodsDemo.show2();
        //show2();
    }
}
