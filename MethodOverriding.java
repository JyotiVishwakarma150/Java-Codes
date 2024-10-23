// class Parent{

// }
// class Child extends Parent{

// }
// class A{
//     Parent show(){
//         System.out.println("1");
//         return new Parent();
//     }
// }
// class B extends A{
//     Child show(){
//         System.out.println("2");
//         return new Child();
//     }
// }
class A{
    public static void main(String[] args){
        System.out.println("1");
    }
}
class B extends A{
    public static void  main(String[] args){
        System.out.println("2");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        // A ob1= new A();
        // ob1.show1();
        // B ob2 = new B();
        // ob2.show2();
        // A ob3 = new B();
        // String[] str ={"a","b","c"};
      //  ob3.main(str);
        //ob3.show2();  //not possible
}
}

