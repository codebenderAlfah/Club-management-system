
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Display implements ActionListener{
    JButton button1, button2, button3,button4,button5;


    public void start() {

        JFrame frame = new JFrame("UIU Robotics Club");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        button1 = new JButton("Projects");
        button1.addActionListener(this);
        button1.setBounds(100,150,200,30);
        frame.getContentPane().add(button1);


        button2 = new JButton("Members Add");
        button2.addActionListener(this);
        button2.setBounds(100,100,200,30);
        frame.getContentPane().add(button2);


        button3 = new JButton("Members");
        button3.addActionListener(this);
        button3.setBounds(100,50,200,30);
        frame.getContentPane().add(button3);

        button4 = new JButton("Email Members");
        button4.addActionListener(this);
        button4.setBounds(100,200,200,30);
        frame.getContentPane().add(button4);


        button5 = new JButton("Close");
        button5.addActionListener(this);
        button5.setBounds(100,300,200,30);
        frame.getContentPane().add(button5);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = ((JButton) e.getSource()).getActionCommand();
        if(action.equals("Projects"))
        {
            Projects obj1 = new Projects();
            obj1.function();

        }
        if(action.equals("Members Add"))
        {
            Members_Add obj2 = new Members_Add();
            obj2.function();
        }
        if(action.equals("Members"))
        {
            Members obj3 = new Members();
            obj3.function();
        }

        if(action.equals("Email Members"))
        {
//            Email obj0 = new Email();
            //obj0.send();
        }


        else if (action.equals("Close"))
        {
            System.exit(0);
        }

    }

}

