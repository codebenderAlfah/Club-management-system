import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Members extends JFrame implements ActionListener, MembersInterface {

    JFrame frame;
    JButton button1,button2;
    JTextField box1 ;
    JLabel label1;
    String a,b,c,d,value1;
    @Override
    public void function() {
        // TODO Auto-generated method stub
        frame = new JFrame("Members");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        box1 = new JTextField();
        box1.setBounds(150, 100, 250, 30);
        frame.getContentPane().add(box1);

        label1 = new JLabel("Name:");
        label1.setBounds(100, 100, 100, 30);
        frame.getContentPane().add(label1);

        button1 = new JButton("Search");
        button1.addActionListener(this);
        button1.setBounds(200, 150, 100, 30);
        frame.getContentPane().add(button1);

        button2 = new JButton("Delete Member");
        button2.addActionListener(this);
        button2.setBounds(150, 200, 200, 30);
        frame.getContentPane().add(button2);


        frame.setVisible(rootPaneCheckingEnabled);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String action = ((JButton) e.getSource()).getActionCommand();
        if (action.equals("Search")) {
             value1= box1.getText();
            try{
                BufferedReader in = new BufferedReader(new FileReader("D:\\list.txt"));
                String s;

                while((s = in.readLine()) != null){

                    String[] var = s.split(" ");

                    a = var[0];
                    b = var[1];
                    c = var[2];
                    d = var[3];
                    System.out.println(var[0]);
                }

            }catch(Exception ae){
                ae.printStackTrace();
            }
            Details mem1 = new Details(a, b, c, d);
            mem1.show();

            if(value1==a||value1==b||value1==c||value1==d) {
                Details mem = new Details(a, b, c, d);
                mem.show();
            }
        }

        }
    }


