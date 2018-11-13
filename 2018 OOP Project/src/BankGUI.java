import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class MainGUI extends JFrame {
    JTextField TextField,UserNameField;
    JPasswordField PasswordField;
    JButton ViewBalance;
    JFrame jFrameWindow;

    public MainGUI() {

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

        ViewBalance = new JButton("View current balance");

      //  ButtonEventHandler buttonEventHandler = new ButtonEventHandler();

       // ViewBalance.addActionListener(buttonEventHandler);


    }

    public static void main(String[] args) {
        MainGUI gui = new MainGUI();
    }

    private class ButtomEventHandler implements ActionListener {

        public void actionperformed(ActionEvent e) {
            if (e.getSource() == ViewBalance) {
                JFrame BalanceWindow = new JFrame("Balance Details");

                FlowLayout flowLayout = new FlowLayout();

                BalanceWindow.setLayout(flowLayout);

                BalanceWindow.setSize(500,250);

                JLabel UserNameLabel = new JLabel("UserName");
                BalanceWindow.add(UserNameLabel);

                UserNameField = new JTextField(10);
                BalanceWindow.add(UserNameField);

                JLabel PasswordLabel = new JLabel("Password");
                BalanceWindow.add(PasswordLabel);

                PasswordField = new JPasswordField(10);
                BalanceWindow.add(PasswordField);

                BalanceWindow.setLocation(200,200);

                BalanceWindow.setVisible(true);
            }
            else if()
        }
    }
}
