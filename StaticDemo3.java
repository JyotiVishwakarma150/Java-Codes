class StaticDemo3 {
     int no=10;
     static void m1(){
        //static int no2=20; //error
       // int no=10;
       //System.out.println(no);
    }  
    public static void main(String[] args) {
        StaticDemo3.m1();
       // StaticDemo3 ob = new StaticDemo3();
     //   ob.m1();
        // System.out.println(ob.no);
        StaticDemo3.m1();
        //System.out.println(no);
    }  
}
