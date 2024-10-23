class Outer{
    private static int a=10;
    int b=10;
    static class Inner{
         void show(){
            System.out.println(a);
          //  System.out.println(b);
        }
    }
}

class StaticNestedClass {
    public static void main(String[] args) {
      Outer.Inner ob = new Outer.Inner();
        ob.show();
       // Outer.Inner.show();
    }
}
