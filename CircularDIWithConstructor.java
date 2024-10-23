class A{
    B b1;
    A(B b2){
        b1=b2;
    }
}
class B{
    A a1;
    B(A a2){
        a1=a2;
    }
}
 class CircularDIWithConstructor {
    public static void main(String[] args) {
       // A ob1= new A(ob2);
       // B ob2 = new B(ob1);
    }
}
