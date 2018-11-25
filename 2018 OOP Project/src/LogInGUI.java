import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class LogInGUI {

    private JFrame main;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    int cid;

    public LogInGUI(){
        prepareGUI();
    }

    public static void main(String[] args) {
        LogInGUI logInGUI = new LogInGUI();

    }
    private void prepareGUI(){
        main = new JFrame("Login");
        main.setSize(400,400);
        main.setLayout(new FlowLayout());
        main.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent wE) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);

        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        main.add(headerLabel);
        main.add(controlPanel);
        main.add(statusLabel);
        main.setVisible(true);
    }
    private void showTextField(){
        headerLabel.setText("Account Access");

        JLabel namelabel = new JLabel("CustID: ",JLabel.RIGHT);
        JLabel passwordlabel = new JLabel("Password: ",JLabel.CENTER);
        final JTextField userText = new JTextField(6);
        final JPasswordField passwordText = new JPasswordField(6);

        JButton loginButton = new JButton("Login");
        JButton createAccountButton = new JButton("Create Account");

        loginButton.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {
             if(userText.getText().equals("mister")&& passwordText.getText().equals("itt"))
             {
                 main.dispose();
                 new MainGUI(userText.getText(),cid);
             }
             else{
                 String message = "Incorrect username and/or password!\nTry again!";
                 JOptionPane.showMessageDialog(null,message);
             }
            }
        });
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name =JOptionPane.showInputDialog(null,"Enter your name");
                Random r = new Random();
                cid = r.nextInt(100000);
            }
        });
        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(passwordlabel);
        controlPanel.add(passwordText);
        controlPanel.add(loginButton);
        controlPanel.add(createAccountButton);
        main.setVisible(true);
    }
}
