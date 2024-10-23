public class Animal3 {
    int age;
    String color;
    void eat(){
        System.out.println("i am eating");
    }
    void run(){
        System.out.println("i am running");
    }
    public static void main(String[] args) {
        Animal3 buzo = new Animal3();
        buzo.age=10;
        buzo.color="Brown";
        System.out.println("Age : "+ buzo.age);
        System.out.println("Color : "+buzo.color);
        buzo.eat();
        buzo.run();
        System.out.println("-----------------------------------------");
        Animal3 cat = new Animal3();
        cat.age=5;
        cat.color="Black";
        System.out.println("Age : "+ cat.age);
        System.out.println("Color : "+cat.color);
        cat.eat();
        cat.run();
    }
}
