package Bank_Application;

public interface BankInterface {

    public  String checkBalance(String password);

    public String addBalance(int money);

    public String withdrawMoney(int money,String password);

    public double RateOfInterest(int year);
}
