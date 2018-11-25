
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class BankGUI extends JFrame{

    public JTextField TextField, usernameField;
    public JPasswordField pin;
    public String custID[] = new String[50];
    public JButton enterButton, exitButton;
    public JFrame jFrameWindow;
    public boolean authenticated;

    public BankGUI() {

        Container cPane = getContentPane();

        JFrame jFrame = new JFrame();

        JTextField textField = new JTextField();

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

        setSize(750, 750);

        setLocation(500, 200);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color myColor = new Color(200, 220, 240);

        cPane.setBackground(myColor);

        cPane.setForeground(Color.cyan);
        // JLabel promptLabel = new JLabel("Hello sir/madam, what would you like to do today?");

        //  cPane.add(promptLabel);


         ButtonEventHandler buttonHandler = new ButtonEventHandler();

        enterButton.addActionListener(buttonHandler);
        exitButton.addActionListener(buttonHandler);

    }

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        BankGUI gui = new BankGUI();
        gui.setVisible(true);
      /*  for(Window w: Window.getWindows()){
            GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(w);
    }*/

    }



    private class ButtonEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource()==enterButton)

            {
                enter(custID);
                JOptionPane.showMessageDialog(null, "Welcome");

            }


            if (event.getSource()==exitButton) {
                JOptionPane.showMessageDialog(null, "Good luck and thanks!");
            }

        }

    }
    private static void enter(String custID[]){

        for(int i=0;i<custID.length;i++)
        {
          //  if()

        }

    }
}
