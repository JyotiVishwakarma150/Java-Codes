public class OneToOneDemo2 {
    public static void main(String[] args) {
        Passport pass1 = new Passport("12345","01-01-2030");
        Person p1 = new Person("Deepak","Chandigarh",pass1);
        p1.showPersonDetails();

        Passport pass2 = new Passport("67890","02-10-2040");
        Person p2= new Person("Deepesh", "Hisar", pass2);
        p2.showPersonDetails();
    }
}
class Person{
    String name;
    String city;
    Passport pass;
    Person(String name1,String city1,Passport pass1){
        name = name1;
        city = city1;
        pass = pass1;
    }
    void showPersonDetails(){
        System.out.println("Name : "+ name);
        System.out.println("city : "+ city);
        System.out.println("Passport Details");
        System.out.println("Passport Number : "+ pass.number);
        System.out.println("Passport Number : "+ pass.validity);
        System.out.println("--------------------------------------------------");
    }
}
class Passport{
    String number;
    String validity;
    Passport(String number1,String validity1){
        number = number1;
        validity = validity1;
    }
}