public class CurrentAccount extends Account {

       double amountRequired;

    public double MakeDeposit(){
        return balance + amountRequired;
    }

    public double MakeWithdrawal(){
        return balance - amountRequired;
    }
}
