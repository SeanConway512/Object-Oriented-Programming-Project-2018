import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class BankGUI extends JFrame {

    JTextField TextField,UserNameField;
    JPasswordField PasswordField;
    JButton ViewBalance;
    JFrame jFrameWindow;

    public BankGUI() {

        JFrame jframewindow = new JFrame("Banking app");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        setTitle("Banking app");

        setSize(750, 750);

        setLocation(250, 250);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

        setBackground(Color.blue);

        JLabel promptLabel = new JLabel("Hello sir/madam, what would you like to do today?");

        jframewindow.add(promptLabel);

        JButton viewBalance =  new JButton("View current balance");

        jFrameWindow.add(viewBalance);

        ButtonEventHandler handler = new ButtonEventHandler();

        viewBalance.addActionListener(handler);


    }

    public static void main(String[] args) {
        BankGUI gui = new BankGUI();
    }
  private class ButtonEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
         if(e.getSource()==ViewBalance){
             JFrame viewBalance = new JFrame("Balance");
             FlowLayout flowLayout = new FlowLayout();
             viewBalance.setLayout(flowLayout);
             viewBalance.setSize(500,500);
             viewBalance.setLocation(250,250);
             viewBalance.setVisible(true);
         }
        }
  }

}
