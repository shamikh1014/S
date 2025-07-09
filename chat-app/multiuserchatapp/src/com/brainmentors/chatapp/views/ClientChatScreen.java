
package com.brainmentors.chatapp.views;


import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.brainmentors.chatapp.network.Client;
import com.brainmentors.chatapp.utils.UserInfo;


public class ClientChatScreen extends JFrame{

    private JPanel contentPane;
    private JTextField textField;
    private JTextArea textArea;
    private Client client;

    /**
     * Launch the application
     */

    public static void main(String[] args){

        try{
            ClientChatScreen frame=new ClientChatScreen();
            frame.setVisible(true);
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    private void sendIt(){
        String message=textField.getText();
        try{
            client.sendMessage(UserInfo.USER_NAME+"- "+message);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Create the frame.
     * @throws IOException
     * @throws UnknownHostException
     */

    public class ClientChatScreen() throws UnknownHostException, IOException{

        textArea=new JTextArea();
        client=new Client(textArea);

        setTitle("Chit Chat");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 799, 425);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane=new JScrollPane();
        scrollPane.setBounds(10, 6, 768, 313);
        contentPane.add(scrollPane);

        textArea.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        textArea.setBounds(10, 24, 713, 280);
        scrollPane.getViewport().add(textArea);

        textField=new JTextField();
        textField.setFont(new Font("Lucia Grande", Font.PLAIN, 16));
        textField.setBounds(20, 339, 602, 52);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton sendIt=new JButton("Send Message");
        sendIt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sendIt();
            }
        });

        sendIt.setBounds(627, 352, 132, 29);
        contentPane.add(sendIt);
        setVisible(true);

    }


}


