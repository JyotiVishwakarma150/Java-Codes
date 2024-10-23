class Employee{
    int empid;
    String empname;
    static String empcomname = "Smart Programmimg";

Employee(int empid,String empname){
    this.empid=empid;
    this.empname=empname;
}

void display(){
    System.out.println("---------Employee Details---------");
    System.out.println("Employee ID : "+empid);
    System.out.println("Employee Name : "+empname);
    System.out.println("Employee Company Name : "+empcomname);
    System.out.println();
}
}
class StaticDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(101, "Deepak");
        Employee e2=new Employee(102, "Deepesh");
        Employee e3= new Employee(103, "Rahul");
        e1.display();
        e2.display();
        e3.display();
    }
}
