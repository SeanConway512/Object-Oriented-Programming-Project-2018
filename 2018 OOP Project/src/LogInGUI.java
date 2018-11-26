//LogInGUI.java
/**this is the driver class for my program and validates the login
* details of the user*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class LogInGUI extends JFrame{

    private JFrame main;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    int custID;

    public LogInGUI(){
        prepareGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        LogInGUI logInGUI = new LogInGUI();
        logInGUI.showTextField();
        for(Window w: Window.getWindows()){
            GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(w);
        }
    }
    private void prepareGUI(){
        main = new JFrame("Login");
        main.setLayout(new FlowLayout());
        main.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent wE) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        Color myColor = new Color(200, 220, 240);
        main.setBackground(myColor);
        main.setForeground(Color.cyan);
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

             if(userText.getText().equals("Sean")&& passwordText.getText().equals("itt"))
             {   /**closes LogInGUI opens up MainGUI */
                 main.dispose();
                 new MainGUI(userText.getText(),custID);
             }
             else{
                 String message = "Incorrect username and/or password!\nTry again!";
                 JOptionPane.showMessageDialog(null,message);
             }
            }
        });
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /**User gives their name and the system outputs back a pin number*/
                String name =JOptionPane.showInputDialog(null,"Enter your name");
                Random r = new Random();
                custID = r.nextInt(100000);
                JOptionPane.showMessageDialog(null,custID);
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
