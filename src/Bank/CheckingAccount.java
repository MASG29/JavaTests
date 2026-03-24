package Bank;

public class CheckingAccount{
    private String name;
    private int balance;
    private String id;
    private double interestRate;
    private boolean closedAccount = false;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }

    public int getBalance(){
        if (closedAccount) {
            System.out.println("This account has been closed.");
            return 0;
        }
        return this.balance;
    }

    public void setBalance(int newBalance) {
        if (closedAccount) {
            System.out.println("This account has been closed.");
            return;
        }
        this.balance = newBalance;
    }

    public double getMonthlyInterest(){
        if (closedAccount){
            System.out.println("This account has been closed.");
            return 0;
        }
        return this.interestRate * this.balance;
    }

    public void setClosedAccount(){
        System.out.println("Closing account " + this.name);
        this.closedAccount = true;
        System.out.println("Closed account " + this.name);
    }

}
