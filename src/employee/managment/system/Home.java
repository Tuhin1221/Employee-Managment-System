package employee.managment.system;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener{
    JButton view,add,update,remove;
    Home()
    {
        setLayout(null);//for not using the swing layout
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));//to add image to the window and go to file
        Image i2=i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);//As img is bigger , it is scaled
        ImageIcon i3=new ImageIcon(i2);//to readd image
        
        
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1120,630);
        add(image);
        
        JLabel heading = new JLabel("Employee Managment System");
        heading.setBounds(620,20,400,40);
        heading.setFont(new Font("TAHOMA",Font.BOLD,25));
        image.add(heading);
        
         add=new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
         view =new JButton("View Employee");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update=new JButton("Update Employee");
        update.setBounds(650, 140, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove=new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
        if(ae.getSource()==add)//get source points to source of what button is clicked
        {
            setVisible(false);
           new AddEmployee();
        }
        else if(ae.getSource()==view)
        {
            setVisible(false);
            new ViewEmployee();
        }
         else if(ae.getSource()==update)
        {
            setVisible(false);
            new ViewEmployee();
        }
         else 
        {
            setVisible(false);
            new RemoveEmployee();

        }
        }
        public static void main(String[] args)
        {
            new Home();
        }
    }
    

