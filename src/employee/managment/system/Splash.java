package employee.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener {

    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading=new JLabel("EMPLOYEE MANAGMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));//to add image to the window
        Image i2=i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);//As img is bigger , it is scaled
        ImageIcon i3=new ImageIcon(i2);//to readd image
        
        
        JLabel image=new JLabel(i3);
        image.setBounds(50, 100, 1050,500);
        add(image);
      
        
     
       JButton clickhere=new JButton("CLICK HERE TO CONTINUE");//for button
       clickhere.setBounds(400, 400,300,70);
      clickhere.setBackground(Color.BLACK);
       clickhere.setBackground(Color.WHITE);
       clickhere.addActionListener(this);// adding the part where the page changes to the next
       image.add(clickhere);
       
        
        setSize(1170,650);
        setLocation(200,500);
        setVisible(true);
    }
       public void actionPerformed(ActionEvent ae){
           setVisible(false);//to close current window
           new Login();// to call next window and open it
       }
    public static void main(String args[])
    {
        new Splash();
    }
}
