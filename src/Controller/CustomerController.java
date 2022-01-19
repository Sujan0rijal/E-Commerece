package Controller;
import java.sql.*;  
import Database.DbConnection;
import model.Customer;

public class CustomerController {
    
    DbConnection db;

    public int registerCustomer(Customer customer){
       String query;
       query = "insert into customer_table(username,email,password)values('"+
       customer.getUsername()+"','"+
       customer.getemail()+"','"+
       customer.getPassword()+"');";

       db = new DbConnection();
       return db.maniulate(query);
      

    }
 
}