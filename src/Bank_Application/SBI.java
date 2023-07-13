package Bank_Application;

public class SBI implements BankInterface{

    private String accountNo;
    private String passcode;

    private double RateOfInterest= 6;

    private Double  balance;

    private Integer minBalance=500;


    //constructor
    public SBI(String accountNo,String passcode,Double balance){
        this.accountNo=accountNo;
        this.passcode=passcode;
        this.balance=balance;
    }


    public String checkBalance(String password) {
        if(this.passcode.equals(password)){
            return "balance is "+ this.balance ;
        }else{
            return "wrong password";
        }
    }


    public String addBalance(int money) {
        if(money>0){
            balance=balance+money;
            return "Money :"+money+"is credited and total balnce"+ balance ;
        }
        else{
            return "Money is negative";
        }
    }


    public String withdrawMoney(int money, String password) {
        if(this.passcode.equals(password)){
            if(balance-minBalance>=money){
                balance=balance-money;
                return "Money deducted"+money+"remaining balance"+balance;
            }
            else{
                return "insufficient balance";
            }
        }
        else{
            return "wrong passcode";
        }
    }


    public double RateOfInterest(int year) {
         double si=(balance*RateOfInterest*year)/100 ;
         return si;
    }
}
