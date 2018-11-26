import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class MortgageAccount extends Account {
    JTextField Mortgage = new JTextField("");
    JFrame mortgageFrame;
    int loanAmount,termInYears;
    double interestRate=0.05f;
    double monthlyRate=interestRate/12.0;
    int termInMonths = termInYears*12;

    public class mortgageInputListener implements ActionListener {

        public void calculateRepayment() {

           // double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow((1 + monthlyRate, -termInMonths)));
          //  return monthlyPayment;
         input = Mortgage.getText();
         System.out.println(input);

        }

    }
}
