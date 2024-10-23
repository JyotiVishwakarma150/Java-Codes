class Animal2{
    int age = 10;
    String color = "Black";
    void eat(){
        System.out.println("i am eating");
    }
    void run(){
        System.out.println("i am running");
    }
    public static void main(String[] args) {
        Animal2 buzo = new Animal2();
        System.out.println("Age : "+ buzo.age);
        System.out.println("Color : "+buzo.color);
        buzo.eat();
        buzo.run();
        Animal2 cat = new Animal2();
        System.out.println("Age : "+ cat.age);
        System.out.println("Color : "+cat.color);
        cat.eat();
        cat.run();
    }
}