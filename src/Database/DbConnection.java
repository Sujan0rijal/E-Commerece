package Database;
import java.sql.*;

public  class DbConnection{
    Connection con;
    Statement st;
    ResultSet rows;
    int val;

public DbConnection() {
    //register the driver class
    try {
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        //create the connection object
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/e_Commerce?characterEncoding=utf8&useSSL=false&autoReconnect=true",
            username,password);
        if (con != null){
            System.out.print("Connected to E-commerce database");
        }else{
            System.out.print("Error connectiog to the database");
        }  
        //Creating statement object
        st = con.createStatement();     
    }catch (Exception e)
    {
        e.printStackTrace();
    }
}
//used for insert,update,delete
    public int maniulate(String query)
    {
    try {
        val = st.executeUpdate(query);
        con.close();
    }catch (SQLException throwables)
    {
        throwables.printStackTrace();
    }
    return val;
}
public ResultSet retrive(String query)
{
    try {
        rows = st.executeQuery(query);
        // con.close();
    }catch ( SQLException throwables)
    {
        throwables.printStackTrace();
    }
    return rows;
}
public static void main(String[]args)
{
    new DbConnection();
}
    
}