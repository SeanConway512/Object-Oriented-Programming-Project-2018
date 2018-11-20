import javax.swing.*;

public class CurrentAccount extends Account {

       double amountRequired;
       float balance;


      // public static float getBalance(){}


    public double MakeDeposit(){
        return balance + amountRequired;
    }

    public double MakeWithdrawal(){
        return balance - amountRequired;
    }
}
