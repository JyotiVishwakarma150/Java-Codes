class Test{
    Test(){
        this(10);
        System.out.println("Defualt constructor");
    }
    Test(int a){
        this("deepak");
        System.out.println(a);
    }
    Test(String a){
        System.out.println(a);
    }
}
class ConstructorChaining {
    public static void main(String[] args) {
           //Test ob = new Test();        
    }   
}
