//MainGUI.java
/**this is where the input for the deposits and withdrawals are processed*/

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

    public MainGUI(String name,final int custID) {
        this.cid = custID;

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

        Account.setMnemonic('A');
        JMenuItem ItemDeposits = new JMenuItem("Deposits");
        ItemDeposits.setMnemonic('D');
        Account.add(ItemDeposits);

        JMenuItem ItemWithdraws = new JMenuItem("Withdrawals");
        ItemWithdraws.setMnemonic('W');
        Account.add(ItemWithdraws);

        JMenuItem ItemView = new JMenuItem("View Account");
        ItemView.setMnemonic('W');
        Account.add(ItemView);

        ItemDeposits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double sBal = Double.parseDouble(JOptionPane.showInputDialog(
                        null, "Enter deposit amount"));

                Account accountObj = new Account();
                accountObj.setBalance(sBal);


                System.out.println(accountObj.getCustID() + accountObj.getBalance());
                File f = new File("account.dat");
                try {
                    FileWriter fw = new FileWriter(f, true);
                    fw.write(custID + " " + accountObj.getBalance() + "\n");

                    fw.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });

        ItemWithdraws.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double sBal = Double.parseDouble(JOptionPane.showInputDialog(
                        null, "Enter withdrawal amount"));

                Account accountObj = new Account();
                accountObj.setBalance(sBal);


                System.out.println(accountObj.getBalance());
                File f = new File("account.dat");
                try {
                    FileWriter fw = new FileWriter(f, true);
                    fw.write(custID + " " + accountObj.getBalance() + "\n");

                    fw.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });

        ItemView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setVisible(false);

                Vector<Vector<String>> myVector = new Vector<Vector<String>>();

                try {

                    BufferedReader file = new BufferedReader(new FileReader(
                            "account.dat"));
                    String input;
                    while ((input = file.readLine()) != null) {
                        String[] temp = input.split(" ");

                        Vector<String> v = new Vector<String>();

                        for (int i = 0; i < temp.length; i++) {
                            v.add(temp[i]);
                        }
                        myVector.add(v);
                    }
                    file.close();
                } catch (IOException e1) {
                    e1.printStackTrace(System.err);
                }

                Vector<String> columnData = new Vector<String>();
                columnData.addElement("ID");
                columnData.addElement("D/W");

                try {

                    JTable jt;

                    jt = new JTable(myVector, columnData);
                    jt.setBounds(30, 40, 200, 300);
                    JScrollPane sp = new JScrollPane(jt);

                    mainFrame.add(sp);

                } catch (Exception ex) {
                    System.out.println("There was a problem: " + ex);
                    ex.printStackTrace();
                }
            }
        });

        ItemNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        statusLabel = new JLabel();

        statusLabel.setText("Currently Logged In: " + name + " #" + custID);
        statusLabel.setHorizontalAlignment(JLabel.RIGHT);
        statusLabel.setVerticalAlignment(JLabel.TOP);

        prepareGUI();
    }
    private void prepareGUI() {
        mainFrame = new JFrame("Main");
        mainFrame.add(statusLabel);
        JMenuBar bar = new JMenuBar();
        bar.add(file);
        bar.add(Account);
        mainFrame.setJMenuBar(bar);
        mainFrame.setSize(400, 400);
        mainFrame.setVisible(true);
    }
}
