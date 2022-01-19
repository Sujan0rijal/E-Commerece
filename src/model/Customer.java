package model;

public class Customer {
    private int custId;
    private String email;
    private String username;
    private String password;

    public Customer(String username,String password,String email)
    {
        this.email = email;
        this.username = username;
        this.password = password;

    }
    public Customer(int custId,String email,String username,String password)
    {
        this.custId = custId;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public int getCustId() {
        return custId;
    }

   
    public void setCustId(int custId) {
        this.custId = custId;
    }

  
    public String getemail() {
        return email;
    }

   
    public void setemail(String email) {
        this.email = email;
    }

    
        public String getUsername() {
            return username;
    }

    
    public void setUsername(String username) {
            this.username = username;
     }

  
    public String getPassword() {
        return password;
    }

     public void setPassword(String password) {
        this.password = password;
    }

}
