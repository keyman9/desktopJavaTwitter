import java.util.*; 
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import java.awt.*;
 import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Account {



 public static void main(String args[]){

 
    JLabel       username = new JLabel("Username: ");
        JLabel       password = new JLabel("Password : ");

     JButton register= new JButton("Register: ");
      JFrame frame = new JFrame();
      final int FIELD_WIDTH = 20;
      JTextField textField = new JTextField(FIELD_WIDTH);
      
            JTextField textField2 = new JTextField(FIELD_WIDTH);

     frame.setLayout(new FlowLayout());

frame.add(username);
                frame.add(textField);

frame.add(password);
                                frame.add(textField2);

     frame.add(register);

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    
    frame.setVisible(true);

String s1=textField.getText();

  
    
    }
    }
