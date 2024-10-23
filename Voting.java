class Voting {
    public static void main(String[] args) {
        int age = 10;
        Voting  v = new Voting();
        v.checkaAge(age);
    }
    void checkaAge(int age){
        if(age>=18){
            youCanVote();
        }
        else{
            throw new RuntimeException("You cannot vote");
        }
    }
    void youCanVote(){
        System.out.println("You can vote successfully");
    }
}
