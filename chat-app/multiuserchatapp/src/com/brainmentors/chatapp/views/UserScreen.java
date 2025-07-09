
package com.brainmentors.chatapp.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.brainmentors.chatapp.dao.UserDAO;
import com.brainmentors.chatapp.dto.UserDTO;
import com.brainmentors.chatapp.utils.UserInfo;


public class UserScreen extends JFrame{

    private JTextField useridtxt;
    private JPasswordField passwordField;

    public static void main(String[] args){

        UserScreen window=new UserScreen();
        
    }

    UserDAO userDAO=new UserDAO();

    private void doLogin(){

        String userid=useridtxt.getText();
        // String password=passwordField.getPassword();
        char[] password=passwordField.getPassword(); // ClassName @Hashcode(Hexadecimal)
        // UserDAO userDAO=new UserDAO();
        UserDTO userDTO=new UserDTO(userid, password);

        try{
            String message="";
            if(userDAO.isLogin(userDTO)){

                message="Welcome "+userid;
                UserInfo.USER_NAME=userid;
                JOptionPane.showMessageDialog(this, message);
                setVisible(false);
                dispose();
                DashBoard dashBoard=new DashBoard(message);
                dashBoard.setVisible(true);

            }
            else{
                message="Invalid Userid or Password";
                JOptionPane.showMessageDialog(this, message);

            }
            // JOptionPane.showMessageDialog(this, message);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    private void register(){

        String userid=useridtxt.getText();
        // String password=passwordField.getPassword();
        char[] password=passwordField.getPassword(); // ClassName @Hashcode(Hexadecimal)
        // UserDAO userDAO=new UserDAO();
        UserDTO userDTO=new UserDTO(userid, password);

        try{
            int result=userDAO.add(userDTO);
            if(result>0){
                JOptionPane.showMessageDialog(this, "Register Successfully");
                // System.out.println("Record Added...");
            }
            else{
                JOptionPane.showMessageDialog(this, "Register Fail");
                // System.out.println("Record not Added...");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("DB Issue....");
            ex.printStackTrace();
        }
        catch(Exception ex){
            System.out.println("Some Generic Exception Raised...");
            ex.printStackTrace(); // Where is the Exception
        }

        System.out.println("userid "+userid+"Password "+password); // ClassName @Hashcode[Hexa]

    }

    /**
     * Create the application
     */

    public UserScreen(){

        setResizable(false);
        setTitle("LOGIN");
        getContentPane().setBackgroundColor(Color.WHITE);
        getContentPane().setLayout(null);

        JLabel lblNewLabel=new JLabel("LOGIN");
        lblNewLabel.setFont(new Font("Lucia Grande", Font.BOLD, 40));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(319, 40, 175, 75);
        getContentPane().add(lblNewLabel);

        useridtxt=new JTextField();
        useridtxt.setBounds(409, 134, 301, 50);
        getContentPane().add(useridtxt);
        useridtxt.setColumns(10);

        JLabel pwdlbl=new JLabel("Password");
        pwdlbl.setFont(new Font("Lucia Grande", Font.PLAIN, 18));
        pwdlbl.setBounds(196, 214, 107, 33);
        getContentPane().add(pwdlbl);

        JLabel useridlbl=new JLabel("Userid");
        useridlbl.setFont(new Font("Lucia Grande", Font.PLAIN, 18));
        useridlbl.setBounds(196, 151, 107, 33);
        getContentPane().add(useridlbl);

        passwordField=new JPasswordField();
        passwordField.setBounds(409, 219, 311, 41);
        getContentPane().add(passwordField);

        JButton registerbt=new JButton("Register");

        registerbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                register();
            }

        });

        registerbt.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        registerbt.setBounds(436, 324, 132, 41);
        getContentPane().add(registerbt);

        JButton loginbt=new JButton("Login");

        loginbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                doLogin();
            }

        });

        loginbt.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        loginbt.setBounds(278, 324, 132, 41);
        getContentPane().add(loginbt);

        setBackgroundColor(Color.WHITE);
        setSize(833, 440);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    

}
