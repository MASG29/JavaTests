package Bank;

public class Main{
    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.getAccountOne().getBalance());
        bankOfGods.getAccountOne().setBalance(5000);
        System.out.println(bankOfGods.getAccountOne().getBalance());
        System.out.println(bankOfGods.getAccountOne().getMonthlyInterest());
        bankOfGods.getAccountOne().setClosedAccount();
        bankOfGods.getAccountOne().setBalance(9999);

    }
}
