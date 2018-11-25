import javax.swing.*;

public class CurrentAccount extends Account {
    private double amountRequired;
    private float balance;
    // public static float getBalance(){}

    public CurrentAccount(){

    }



    public double MakeDeposit(){
        return balance + amountRequired;
    }

    public double MakeWithdrawal(){
        return balance - amountRequired;
    }
}
