import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class BankGUI extends JFrame {

   private JTextField TextField,UserNameField;
   private JPasswordField PasswordField;
   private JButton LogIn;
   public JFrame jFrameWindow;

    public BankGUI() {

        JFrame jFrameWindow = new JFrame("Bank");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        setTitle("Bank");

        setSize(500, 500);

        setLocation(250, 250);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color myColor = new Color(200,220,240);

        setBackground(myColor);

        JLabel promptLabel = new JLabel("Hello sir/madam, what would you like to do today?");

        jFrameWindow.add(promptLabel);

        JButton logIn =  new JButton("Log in");

        jFrameWindow.add(logIn);

        ButtonEventHandler handler = new ButtonEventHandler();

        logIn.addActionListener(handler);

        setVisible(true);
    }

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

     BankGUI gui = new BankGUI();

    }

  private class ButtonEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
         if(e.getSource()==LogIn){
             JFrame LogIn = new JFrame("Balance");
             FlowLayout flowLayout = new FlowLayout();
             LogIn.setLayout(flowLayout);
             LogIn.setVisible(true);
             JOptionPane.showInputDialog(null,Arrays.toString(UserNameField),"UserName",JOptionPane.INFORMATION_MESSAGE);
         }
        else
            {

         }
        }
  }

}
