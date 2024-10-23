class Test{
    Test(){
        System.out.println("1");
    }
    Test(int a){
        System.out.println("2");
    }
}
class ConstructorOverloading {
    public static void main(String[] args) {
    new Test();
    new Test(20);
    }
   
   }
