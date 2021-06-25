import javax.swing.*;
import java.awt.event.*;

public class Projects extends JFrame implements ActionListener, ProjectInterface {

    JFrame frame;
    JButton button1, button;
    JTextField box1, box2;
    JLabel label1, label2;

    @Override
    public void function() {
        // TODO Auto-generated method stub
        frame = new JFrame("Projects");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        label1 = new JLabel("Project Name");
        label1.setBounds(50, 50, 100, 30);
        frame.getContentPane().add(label1);

        box1 = new JTextField();
        box1.setBounds(250, 50, 100, 30);
        frame.getContentPane().add(box1);

        label2 = new JLabel("Team Name");
        label2.setBounds(50, 100, 100, 30);
        frame.getContentPane().add(label2);

        box2 = new JTextField();
        box2.setBounds(250, 100, 100, 30);
        frame.getContentPane().add(box2);

        button1 = new JButton("Search");
        button1.addActionListener(this);
        button1.setBounds(100, 150, 100, 30);
        frame.getContentPane().add(button1);

        button = new JButton("Display");
        button.addActionListener(this);
        button.setBounds(100, 200, 100, 30);
        frame.getContentPane().add(button);

        frame.setVisible(rootPaneCheckingEnabled);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String action = ((JButton) e.getSource()).getActionCommand();
        if (action.equals("Search")) {
            JOptionPane.showMessageDialog(null, "Search");
        }
        if (action.equals("Dislpay")) {
            JOptionPane.showMessageDialog(null, "Dislpay");
        }
    }

}

