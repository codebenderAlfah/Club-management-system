import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

public class Sign_up implements ActionListener {


    JFrame frame;
    JButton button1;
    JTextField box1, box2, box3, box4;
    JLabel label1, label2, label3, label4;


    public void function() {


        // TODO Auto-generated method stub
        frame = new JFrame("SIGN UP");
        frame.setSize(500, 500);
        frame.getContentPane().setLayout(null);

        label1 = new JLabel("Name:");
        label1.setBounds(50, 50, 100, 30);
        frame.getContentPane().add(label1);

        box1 = new JTextField();
        box1.setBounds(250, 50, 100, 30);
        frame.getContentPane().add(box1);

        label2 = new JLabel("ID:");
        label2.setBounds(50, 100, 100, 30);
        frame.getContentPane().add(label2);

        box2 = new JTextField();
        box2.setBounds(250, 100, 100, 30);
        frame.getContentPane().add(box2);

        label3 = new JLabel("User Name");
        label3.setBounds(50, 150, 100, 30);
        frame.getContentPane().add(label3);

        box3 = new JTextField();
        box3.setBounds(250, 150, 100, 30);
        frame.getContentPane().add(box3);

        label4 = new JLabel("Password");
        label4.setBounds(50, 200, 100, 30);
        frame.getContentPane().add(label4);

        box4 = new JTextField();
        box4.setBounds(250, 200, 100, 30);
        frame.getContentPane().add(box4);


        button1 = new JButton("Confirm");
        button1.addActionListener(this);
        button1.setBounds(150, 250, 100, 30);
        frame.getContentPane().add(button1);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String action = ((JButton) e.getSource()).getActionCommand();
        if (action.equals("Confirm")) {
            String value1= box3.getText();

            String value2 = box4.getText();
            try{
                //FileWriter admin = new FileWriter("admin.txt");
                FileWriter admin = new FileWriter("D:\\demo.txt");

                admin.write(value1);
                admin.write(" ");
                admin.write(value2);
                admin.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Sign Up Completed");
            LogIn obj = new LogIn();
            obj.guiLogin();
            frame.setVisible(false);
        }

    }

}

