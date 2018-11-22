import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class BankGUI extends JFrame implements ActionListener{

   private JTextField TextField,usernameField;
   private JPasswordField passwordField;
   private JButton enterButton, exitButton;
   public JFrame jFrameWindow;

    public BankGUI() {

        Container cPane = getContentPane();
        FlowLayout flowLayout = new FlowLayout();
        cPane.setLayout(new FlowLayout());
        JLabel pwLabel = new JLabel("Enter your password");
        JTextField pwText = new JPasswordField();
        JLabel usLabel = new JLabel("Enter your username");
        JTextField usText = new JTextField();
        enterButton = new JButton("Enter");
        exitButton = new JButton("Exit");
        cPane.add(pwLabel);
        cPane.add(pwText);
        cPane.add(usLabel);
        cPane.add(usText);
        cPane.add(enterButton);
        cPane.add(exitButton);

        setLayout(flowLayout);

        setTitle("Bank");

        setSize(1250,750);

        setLocation(500, 200);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color myColor = new Color(200,220,240);

        cPane.setBackground(Color.cyan);

        //jFrameWindow.setForeground(myColor);
       // JLabel promptLabel = new JLabel("Hello sir/madam, what would you like to do today?");

      //  cPane.add(promptLabel);



       // ButtonEventHandler buttonHandler = new ButtonEventHandler();

        enterButton.addActionListener(this);
        exitButton.addActionListener(this);
        //jFrameWindow.setVisible(true);
    }

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

     BankGUI gui = new BankGUI();
     gui.setVisible(true);

    }

  //private class ButtonEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
         if(e.getSource()== enterButton)

      //   {
             JOptionPane.showMessageDialog(null, "Welcome");

             JTextArea textArea = new JTextArea();
             Font font = new Font("monospaced",Font.PLAIN,12);
             String text="";
             textArea.setFont(font);
             textArea.append(text);
             JOptionPane.showMessageDialog(null,"Please enter your password");

             //passwordField=input.next();
            // System.exit(0);
             String username = usernameField.getText();
             usernameField.setSize(200,500);
             usernameField.setLocation(200,500);
             char[] password = passwordField.getPassword();
             passwordField.setSize(200,500);
             passwordField.setLocation(200,500);
            // jFrameWindow.add

             /*JFrame LogIn = new JFrame("Log in");

             FlowLayout flowLayout = new FlowLayout();

             LogIn.setLayout(flowLayout);

             LogIn.setVisible(true);

             LogIn.setSize(1250,500);


             JLabel usernameLabel = new JLabel("Username");
             LogIn.add(usernameLabel);

             usernameField = new JTextField(10);
             LogIn.add(usernameField);

             JLabel passwordLabel = new JLabel("Password");
             LogIn.add(passwordLabel);

             passwordField = (JPasswordField) new JTextField(15);
             LogIn.add(passwordField);

             LogIn.setVisible(true);

*/
        // }
   if(e.getSource()==exitButton){
       JOptionPane.showMessageDialog(null,"Goodbye,hope to see you again");

        }

        }

  }
