public class Animal1 {
        int age = 10;
        String color = "Black";
        void eat(){
            System.out.println("i am eating");
        }
    
        public static void main(String[] args) {
            Animal1 buzo = new Animal1();
            System.out.println("Age : "+ buzo.age);
            System.out.println("Color : "+buzo.color);
            buzo.eat();
        }
    
    }
