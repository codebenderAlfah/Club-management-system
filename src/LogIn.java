import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogIn {

    String a,b;

    public void guiLogin() {
        JFrame frameMain = new JFrame(" UIU Robotics Club ");
        frameMain.setSize(500, 350);


        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(null);//


        JLabel titleNameLabel = new JLabel("Admin Panel");
        titleNameLabel.setBounds(200, 20, 500, 50);


        JTextField userName = new JTextField(15);
        userName.setBounds(230, 60, 150, 25);



        JLabel userNameLabel = new JLabel("User Name:");
        userNameLabel.setBounds(150, 60, 150, 25);


        JPasswordField passField = new JPasswordField(15);
        passField.setBounds(230, 100, 150, 25);




        JLabel passFieldLabel = new JLabel("Password:");
        passFieldLabel.setBounds(150, 100, 150, 25);



        JButton submit = new JButton("Submit");
        submit.setBounds(150, 180, 100, 25);


        JButton sign_up = new JButton("Sign Up");
        sign_up.setBounds(300, 180, 100, 25);


        submit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            // TODO Auto-generated method stub
            String value1= userName.getText();
            @SuppressWarnings("deprecation")
            String value2 = passField.getText();
            System.out.println(value2);
            try{
                BufferedReader in = new BufferedReader(new FileReader("D:\\demo.txt"));
                String s;

                while((s = in.readLine()) != null){

                    String[] var = s.split(" ");

                    a = var[0];
                    b = var[1];
                    System.out.println(var[0]);
                }

            }catch(Exception e){
                e.printStackTrace();
            }

            if (value1.equals(a) && value2.equals(b)){
                Display testDisplay = new Display();
                testDisplay.start();
                frameMain.setVisible(false);

            }
            else {

                JOptionPane.showMessageDialog(panelLogin, "Incorrect Password or user name", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
    });

        sign_up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Sign_up su = new Sign_up();
                su.function();
                frameMain.setVisible(false);
            }
        });







        panelLogin.add(titleNameLabel);
        panelLogin.add(userNameLabel);
        panelLogin.add(userName);
        panelLogin.add(passFieldLabel);
        panelLogin.add(passField);
        panelLogin.add(submit);
        panelLogin.add(sign_up);


        frameMain.add(panelLogin);
        frameMain.setVisible(true);
    }
}
