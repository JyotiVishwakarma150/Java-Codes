class Account{
    private int amount;
    private String accno;
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void setAccNo(String accno){
        this.accno = accno;
    }
    public String getAccNo(){
        return accno;
    }
}
class BankFunctions{
    void deposit(Account acc,int dptamt){
        int total = (acc.getAmount())+dptamt;
        acc.setAmount(total);
    }
    void withhdraw(Account acc,int wthamt){
        int total = acc.getAmount() - wthamt;
        acc.setAmount(total);
    }
}
class AccountMain {
    public static void main(String[] args) {
        Account ob1= new Account();
        ob1.setAccNo("11111");
        ob1.setAmount(10000);
        BankFunctions bf= new BankFunctions();
        bf.deposit(ob1,5000);
        bf.withhdraw(ob1,3000);
        System.out.println("Full details : "+ob1.getAccNo()+ " : "+ob1.getAmount());
    }
}
