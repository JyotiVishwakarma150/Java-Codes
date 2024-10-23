public class InheritanceMain {
    public static void main(String[] args) {
        Humans deepak = new Humans();
        deepak.eat();
    }
}
class Animal{
    void eat(){
        //------1000 lines of code------
        System.out.println("i am eating");
        //-------1000 lines of codes
    }
}
class Humans extends Animal{

}