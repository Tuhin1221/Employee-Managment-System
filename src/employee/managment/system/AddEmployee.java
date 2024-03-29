
package employee.managment.system;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
public class AddEmployee extends JFrame implements ActionListener{
    Random ran= new Random();
    int number=ran.nextInt(999999);
    JTextField tfname,tfaddress,tfphone,tfaadhar,tfemail,tffname,tfsalary,tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add,back;

AddEmployee()
{
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    JLabel heading=new JLabel("Add Employee Detail");
    heading.setBounds(320,30,500,50);
    heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
    add(heading);
    
    
    JLabel labelname=new JLabel("Name");
    labelname.setBounds(50, 150, 150, 30);
     labelname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelname);
    
     tfname=new JTextField();// to create input box
    tfname.setBounds(200,150,150,30);
    add(tfname);
    
    ////////////////////////////////
    
    JLabel labelfname=new JLabel("Father's Name");
    labelfname.setBounds(400, 150, 150, 30);
     labelfname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelfname);
    
     tffname=new JTextField();// to create input box
    tffname.setBounds(600,150,150,30);
    add(tffname);
    
    ///////////////////////////////////////
    
    JLabel labeldob=new JLabel("Date of Birth");
    labeldob.setBounds(50, 200, 150, 30);
     labeldob.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labeldob);
    
    JTextField tfdob=new JTextField();// to create input box
    tfdob.setBounds(200,150,150,30);
    add(tfdob);
    
     dcdob = new JDateChooser();
    dcdob.setBounds(200, 200, 150, 30);
    add(dcdob);
    
    //////////////////////////////////////////
    
    JLabel labelsalary=new JLabel("Salary");
    labelsalary.setBounds(400, 200, 150, 30);
     labelsalary.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelsalary);
    
     tfsalary=new JTextField();// to create input box
    tfsalary.setBounds(600,200,150,30);
    add(tfsalary);
    
    ///////////////////////////////////////
    
    JLabel labeladdress=new JLabel("Address");
    labeladdress.setBounds(50, 250, 150, 30);
     labeladdress.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labeladdress);
    
     tfaddress=new JTextField();// to create input box
    tfaddress.setBounds(200,250,150,30);
    add(tfaddress);
    ////////////////////////////////////////
    JLabel labelphone=new JLabel("Phone");
    labelphone.setBounds(400, 250, 150, 30);
     labelphone.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelphone);
    
     tfphone=new JTextField();// to create input box
    tfphone.setBounds(600,250,150,30);
    add(tfphone);
    ///////////////////////////////////////
     JLabel labelemail=new JLabel("Email");
    labelemail.setBounds(50, 300, 150, 30);
     labelemail.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelemail);
    
     tfemail=new JTextField();// to create input box
    tfemail.setBounds(200,300,150,30);
    add(tfemail);
    
    ////////////////////////////////////////
    
    JLabel labeledu=new JLabel("Highest Education");
    labeledu.setBounds(400, 300, 150, 30);
     labeledu.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labeledu);
    
    String courses[]={"BBA","BCA","BA","BSC","B.COM","B.Tech","MBA","MCA","MA","M.TECH","M.SC","PHD"};
    
     cbeducation=new JComboBox(courses);// to create drop down
    cbeducation.setBackground(Color.WHITE);
    cbeducation.setBounds(600,300,150,30);
    add(cbeducation);
    
    ////////////////////////////////////////
    
    JLabel labeldesignation=new JLabel("Designation");
    labeldesignation.setBounds(50, 350, 150, 30);
     labeldesignation.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labeldesignation);
    
     tfdesignation=new JTextField();// to create input box
    tfdesignation.setBounds(200,350,150,30);
    add(tfdesignation);
    
    ////////////////////////////////////////
    
    JLabel labelaadhar =new JLabel("Aadhar Number");
    labelaadhar.setBounds(400, 350, 150, 30);
     labelaadhar.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelaadhar);
    
     tfaadhar=new JTextField();// to create input box
    tfaadhar.setBounds(600,350,150,30);
    add(tfaadhar);
    
    ////////////////////////////////////////////
    
    JLabel labelempId =new JLabel("Employee ID");
    labelempId.setBounds(50, 400, 150, 30);
     labelempId.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    add(labelempId);
    
     lblempId=new JLabel("" + number);// to create random id here doing " "+ int convert to string
    lblempId.setBounds(200,400,150,30);
    lblempId.setFont(new Font("serif",Font.PLAIN,20));
    add(lblempId);
    
    ///////////////////////////////////////////
    
     add=new JButton(" Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
         back =new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
    
    setSize(900,700);
    setLocation(300,50);
    setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()== add)
    {
        String name=tfname.getText();
        String fname=tffname.getText();
        String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
        String salary =tfsalary.getText();
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        String education=(String)cbeducation.getSelectedItem();
        String designation=tfdesignation.getText();
        String aadhar=tfaadhar.getText();
        String empId=lblempId.getText();
        
        try{
           // Conn conn=new Conn();
            conn c =new conn();
            String query="insert into employee1 values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empId+"')";
            c.s.executeUpdate(query);//dml command of query
            JOptionPane.showMessageDialog(null,"Details added Successfully");
            setVisible(false);
            new Home();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    else
    {
        setVisible(false);
        new Home();
    }
}
public static void main(String []args)
{
    new AddEmployee();
  
}
}

