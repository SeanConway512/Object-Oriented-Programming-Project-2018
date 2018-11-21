import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class BankGUI extends JFrame {

   private JTextField TextField,usernameField;
   private JPasswordField passwordField;
   private JButton LogIn;
   public JFrame jFrameWindow;

    public BankGUI() {

        JFrame jFrameWindow = new JFrame("Bank");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setTitle("Bank");

        jFrameWindow.setSize(1250,750);

        jFrameWindow.setLocation(500, 200);

        jFrameWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color myColor = new Color(200,220,240);

        jFrameWindow.setBackground(myColor);

        JLabel promptLabel = new JLabel("Hello sir/madam, what would you like to do today?");

        jFrameWindow.add(promptLabel);

        JButton LogIn =  new JButton("Log in");

        jFrameWindow.add(LogIn);

        ButtonEventHandler handler = new ButtonEventHandler();

        LogIn.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

     BankGUI gui = new BankGUI();

    }

  private class ButtonEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
         if(e.getSource()==LogIn)

         {
             String username = usernameField.getText();
             char[] password = passwordField.getPassword();

             JFrame LogIn = new JFrame("Log in");

             FlowLayout flowLayout = new FlowLayout();

             LogIn.setLayout(flowLayout);

             LogIn.setVisible(true);

             JLabel usernameLabel = new JLabel("Username");
             LogIn.add(usernameLabel);

             usernameField = new JTextField(10);
             LogIn.add(usernameField);

             JLabel passwordLabel = new JLabel("Password");
             LogIn.add(passwordLabel);

             passwordField = (JPasswordField) new JTextField(15);
             LogIn.add(passwordField);

             LogIn.setVisible(true);



         }

        }
  }

}
