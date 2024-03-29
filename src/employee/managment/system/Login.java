package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername,tfpassword;
     Login(){ 

         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
         JLabel lblusername = new JLabel("Username");
         lblusername.setBounds(40, 20,100, 30);
         add(lblusername);
         
         //for making the boxes for input beside username and password
         tfusername = new JTextField();
         tfusername.setBounds(150, 20 , 150, 30);
         add(tfusername);
         
         JLabel lblpassword = new JLabel("Password");
         lblpassword.setBounds(40, 70,100, 30);
         add(lblpassword);
         
         //for making the boxes for input beside username and password
         tfpassword = new JTextField();
         tfpassword.setBounds(150, 70 , 150, 30);
         add(tfpassword);
         
        
         
         
         
         JButton login=new JButton("LOGIN");//for button
         login.setBounds(150, 140,150,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);
        
         
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));//to add image to the window
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);//As img is bigger , it is scaled
        ImageIcon i3=new ImageIcon(i2);//to readd image
        
        
        JLabel image=new JLabel(i3);
        image.setBounds(50, 100, 1050,500);
        add(image);
      
     }
     public void actionPerformed(ActionEvent ae)//to find the values
     {
         try{
             String username = tfusername.getText();//get value of username
             String password = tfpassword.getText();//get nalue of password
             conn c =new conn();
             
             String query = "select * from login where username='"+username+"'and password ='"+password+"'";//to take out matching username and password creating sql query
             ResultSet rs=c.s.executeQuery(query);//to  execute query
             if(rs.next()){//if rs has value
                 setVisible(false);
                 new Home();//to open next class on successful login
             }else
             {
                 JOptionPane.showMessageDialog(null, "Invalid username or password ");
                 setVisible(false);
             }
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
     }
        public static void main(String[] args)
        {
            new Login();
        }
      
          
 }
    

