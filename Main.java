
class Main{
    public static void main(String[] args) {
      Animall buzo = new Animall();
      buzo.eat();
      Birds crow = new Birds();
      crow.fly();
    }
}
class Birds {
    void fly(){
        System.out.println("I am flying");
    }
}
class Animall{
    void eat(){
        System.out.println("I am eating");
    }
}
