class A{
    B b1;
    public void SetB(B b2){
        b1=b2;
    }
}
class B{
    A a1;
    public void SetA(A a2){
        a1=a2;
    }
}
class CircularDI {
    public static void main(String[] args) {
     A ob1 = new A();
     B ob2 = new B();
     ob1.SetB(ob2);
        ob2.SetA(ob1);
        
    }
}
