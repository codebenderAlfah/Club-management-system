import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details implements ActionListener {
    JFrame frame;
    JButton button1;
    JLabel label1, label2, label3, label4;
    String name, id, dept, phn;

    Details(String a, String b, String c, String d) {
        name = a;
        id = b;
        dept = c;
        phn = d;
    }

    public void show() {

        frame = new JFrame("Member Details");
        frame.setSize(500, 500);
        frame.getContentPane().setLayout(null);

        label1 = new JLabel("Name:" + name);
        label1.setBounds(100, 100, 100, 30);
        frame.getContentPane().add(label1);

        label2 = new JLabel("ID:" + id);
        label2.setBounds(100, 150, 100, 30);
        frame.getContentPane().add(label2);

        label3 = new JLabel("Department:" + dept);
        label3.setBounds(100, 200, 100, 30);
        frame.getContentPane().add(label3);

        label4 = new JLabel("Phone Number:" + phn);
        label4.setBounds(100, 250, 300, 30);
        frame.getContentPane().add(label4);

        button1 = new JButton("Close");
        button1.addActionListener(this);
        button1.setBounds(100, 300, 200, 30);
        frame.getContentPane().add(button1);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String action = ((JButton) e.getSource()).getActionCommand();
        if (action.equals("Close")) {
            frame.setVisible(false);
        }

    }


}