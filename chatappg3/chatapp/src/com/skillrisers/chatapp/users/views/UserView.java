
package com.skillrisers.chatapp.users.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class UserView{

    private JFrame userViewFrame;
    private JTextField useridtxt;
    private JPasswordField passwordField;

    /**
     * Launch the application
     */

    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable(){

            public void run(){
                try{
                    UserView window=new UserView();
                    window.userViewFrame.setVisible(true);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

        });
        
    }

    /**
     * Create the application
     */

    public UserView(){
        initialize();
    }

    private void doRegister(){
        String userid=useridtxt.getText();
        char password[]=passwordField.getPassword();
    }

    /**
     * Initialize the contents of the frame
     */

    public void initialize(){

        userViewFrame=new JFrame();
        userViewFrame.setTitle("Login/Register Form");
        userViewFrame.setResizable(false);
        userViewFrame.getContentPane().setBackground(Color.WHITE);
        userViewFrame.getContentPane().setLayout(null);

        JLabel lblNewLabel=new JLabel("Register/Login");
        lblNewLabel.setForeground(Color.MAGENTA);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucia Grande", Font.BOLD, 20));
        lblNewLabel.setBounds(257, 20, 169, 25);
        userViewFrame.getContentPane().add(lblNewLabel);

        JLabel useridlbl=new JLabel("userid");
        useridlbl.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        useridlbl.setHorizontalAlignment(SwingConstants.RIGHT);
        useridlbl.setBounds(64, 95, 81, 20);
        userViewFrame.getContentPane().add(useridlbl);

        JLabel lblPassword=new JLabel("password");
        lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPassword.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        lblPassword.setBounds(64, 146, 81, 20);
        userViewFrame.getContentPane().add(lblPassword);

        useridtxt=new JTextField();
        useridtxt.setBorder(new LineBorder(Color.BLACK, 3, true));
        useridtxt.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        useridtxt.setBounds(192, 89, 262, 30);
        useridtxt.setColumns(10);
        userViewFrame.getContentPane().add(useridtxt);

        passwordField=new JPasswordField();
        passwordField.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
        passwordField.setBounds(192, 89, 262, 30);
        passwordField.setColumns(10);
        userViewFrame.getContentPane().add(passwordField);

        JButton loginBt=new JButton("Login");
        loginBt.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
        loginBt.setIcon(new ImageIcon(UserView.class.getResource("/assets/2170153.png")));
        loginBt.setFont(new Font("Lucia Grande", Font.PLAIN, 15));
        loginBt.setBounds(51, 191, 231, 130);
        userViewFrame.getContentPane().add(loginBt);

        JButton btnRegister=new JButton ("Register");
        btnRegister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });

        btnRegister.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnRegister.setIcon(new ImageIcon(UserView.class.getResource("/assets/user-png-icon-8.png")));
        btnRegister.setFont(new Font("Lucia Grande", Font.PLAIN, 15));
        btnRegister.setBounds(294, 191, 355, 130);
        userViewFrame.getContentPane().add(btnRegister);

        JLabel iconlbl=new JLabel("");
        iconlbl.setIcon(new ImageIcon(UserView.class.getResource("/assets/user.png")));
        iconlbl.setBounds(452, 18, 225, 272);
        userViewFrame.getContentPane().add(iconlbl);


        // userViewFrame.setBackground(Color.WHITE);
        userViewFrame.setBounds(100, 100, 683, 353);
        userViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userViewFrame.setLocationRelativeTo(null);


    }

}
