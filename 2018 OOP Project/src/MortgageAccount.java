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


}
