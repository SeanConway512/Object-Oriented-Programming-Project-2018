import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class MainGUI extends JFrame{

    private JFrame mainFrame;
    private JLabel statusLabel;

    private JMenu file = new JMenu("File");
    private JMenu Account = new JMenu("Account");

    int cid;

    public MainGUI(String name,final int cid){
        this.cid =cid;

        file.setMnemonic('F');
        JMenuItem ItemNew = new JMenuItem("New");
        ItemNew.setMnemonic('N');
        file.add(ItemNew);
        JMenuItem ItemExit = new JMenuItem("Exit");
        ItemExit.setMnemonic('x');
        file.add(ItemExit);

        ItemExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
