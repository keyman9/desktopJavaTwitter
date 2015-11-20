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



public void actionPerformed(ActionEvent e){

}

 public static void main(String args[]){

 
    JLabel       username = new JLabel("Username: ");
        JLabel       password = new JLabel("Password : ");

     JButton register= new JButton("Register: ");
      JFrame frame = new JFrame();
      final int FIELD_WIDTH = 20;
      final JTextField textField = new JTextField(FIELD_WIDTH);
      
       final     JTextField textField2 = new JTextField(FIELD_WIDTH);
            JTextField textField3 = new JTextField(FIELD_WIDTH);
            
            final JButton login=new JButton("Login");


     frame.setLayout(new FlowLayout());

frame.add(username);
                frame.add(textField);

frame.add(password);
try{
   String fileName = "inventory.txt";
      FileReader file = new FileReader(fileName);

                Scanner scan = new Scanner(file);
                                frame.add(textField2);
                                 FileReader file1 = new FileReader(fileName);

                Scanner scan1 = new Scanner(file);
                                final String get=textField.getText();
                                final JLabel get2= new JLabel();
                                get2.setText(textField.getText());
final String the=textField2.getText();

                    final ArrayList<String> Users=new ArrayList<String>();

                                
   register.addActionListener(new
         ActionListener()
         {

            public void actionPerformed(ActionEvent event)
           {
       if (!Users.contains(textField.getText())){
       Users.add(textField.getText());
       Users.add(textField2.getText());
       }
      else
      System.out.print("Username already exists.");
          for (int y=0;y<Users.size();y++){
               
               System.out.println(Users.get(y));
               }
               }
               }); 
               
               login.addActionListener(new
         ActionListener()
         {  
          public void actionPerformed(ActionEvent event)
           {
  
             if (Users.contains(textField.getText()) && Users.contains(textField2.getText())){
       System.out.print("Welcome back!");
       }
      else
      System.out.print("Username already exists.");
      }
         });
     
     frame.add(register);

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    
    frame.setVisible(true);
frame.add(login);

String s1=textField.getText();

  String thing=textField.getText();
  String thing2= new String(thing);
  System.out.print(thing2);
    }
    
    catch(FileNotFoundException ex) {
            System.out.print("File Not Found Exception");                
        }
        catch(IOException ex) {  
            System.out.print("IOException");   
            
        }
    }
    }
