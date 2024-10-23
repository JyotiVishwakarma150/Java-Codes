interface I1{
    static  void show(){
        System.out.println("i am static method ");
    }
}
// class Test implements I1{

// }

class InterfaceNewFeatures {
    public static void main(String[] args) {
        // Test t = new Test();
        // t.show();
        I1.show();
    }
}
