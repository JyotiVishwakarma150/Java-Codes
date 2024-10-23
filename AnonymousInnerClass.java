 class Vehicle{

  void start(){
    //abstract void showName();
    System.out.println("1");
}

 }
class AnonymousInnerClass {
     public static void main(String[] args) {
        Vehicle v = new Vehicle(){
            void start(){
                System.out.println("starts with key");
            }
            // void showName(){
            //     System.out.println("Tata nexom");
            // }
        }; 
        v.start();
       // v.showName();
     }    
}
