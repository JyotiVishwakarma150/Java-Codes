class Exception {
    public static void main(String[] args) { 
        Exception t1= new Exception();
        t1.m1();
        //System.out.println("1");
       // int a=100,b=0,c;
        //System.out.println("2");
        //c=a/b;
        //System.out.println("3");
        // System.out.println(c);
       // System.out.println("4");
    }
    // void add(){
    //     int a=100,b=0,c;
    //     c=a/b;
    //     System.out.println(c);
    // }
    void m1(){
        divide();
    }
    void divide(){
        int a=100,b=0,c;
          c=a/b;
               System.out.println(c);
    }
}
