
package com.brainmentors.chatapp.views;


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class DashBoard extends JFrame{

    private JPanel contentPane;

    /**
     * Launch the application
     */

    // public static void main(String[] args){
    //     DashBoard frame=new DashBoard();
    //     frame.setVisible(true);
    // }

    /**
     * Create the frame
     */
        
    public DashBoard(String message){

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1231, 675);

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        JMenu chatMenu=new JMenu("Chat");
        menuBar.add(chatMenu);

        JMenuItem startChat=new JMenuItem("Start Chat");
        startChat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new ClientChatScreen();
                }
                catch(UnknownHostException e1){
                    e1.printStackTrace();
                }
                catch(IOException e1){
                    e1.printStackTrace();
                }
            }
        });
        chatMenu.add(startChat);

        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setTitle(message);

        JLabel lblNewLabel=new JLabel("");
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/images/business-chit-chat.jped")));
        contentPane.add(lblNewLabel, BorderLayout.CENTER);
    }

}
