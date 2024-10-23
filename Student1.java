 class Student1 {
    int rollno;
    String name;
    Student1(int rollno,String name){
        this.rollno=rollno;
        this.name= name;
    }
    void show(){
        System.out.println("Student Rollno : "+ rollno);
        System.out.println("Student name : "+name);
    }
    public static void main(String[] args) {
        Student1 s1=new Student1(101,"deepak");
        s1.show();
    }
}
