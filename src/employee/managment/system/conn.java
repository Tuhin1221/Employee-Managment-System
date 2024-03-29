
package employee.managment.system;
import java.sql.*;
public class conn {
    Connection c;//?
    Statement s;
    public conn(){
        
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");//her the class loads the data base driver 
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","TuSa09@");//employee
    s=c.createStatement();
    } catch(Exception e){
            e.printStackTrace();//prints all throwable class 
            }
    
}
}


