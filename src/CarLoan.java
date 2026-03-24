public class CarLoan {
//Setting CarLoan properties
    public int carLoan = 10000;
    public int loanLength = 3;
    public int interestRate = 5;
    public int downPayment = 2000;

    //Creating the constructor so we can have several CarLoans with different parameters.
    CarLoan(int carLoan, int loanLength,int interestRate, int downPayment){
        //Creating an verification process to see if the user can get the Loan, matching some criteria
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("You can't make a loan for 0 years, nor with 0 interest.");
            return;
        } else if (downPayment > carLoan) {
            System.out.println("The car can be paid in full.");
            return;
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Congrats you just got a Car Loan, your monthly payment is: " + monthlyPayment);
            this.carLoan = carLoan;
            this.loanLength = loanLength;
            this.interestRate = interestRate;
            this.downPayment = downPayment;
        }

    }

        public static void main(String[] args) {


        }
}
