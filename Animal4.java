public class Animal4 {
    int age ;
    String color;
    void eat(){
        System.out.println("I am eating");
    }
    void run(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        Animal4 buzo = new Animal4();
        System.out.println("Age : "+ buzo.age);
        System.out.println("color : "+ buzo.color);
        buzo.eat();
        buzo.run();
    }
}
