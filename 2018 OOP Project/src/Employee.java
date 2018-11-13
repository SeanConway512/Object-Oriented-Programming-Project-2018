public class Employee extends Person{

    private String name, address, email,userName,password;
    private float empNum;
    private int phone;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public float getEmpNum(){return empNum;}
    public void setEmpNum(float empnum){this.empNum = empNum;}

    public int getPhone(){return phone;}
    public void setPhone(int phone){this.phone = phone;}

    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName=userName;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public Employee(){this("Unknown","N/A","N/A", 0.0f,0,null,null);}

    public Employee(String name,String address,String email,float empNum,int phone,String userName,String password){
        setName(name);
        setAddress(address);
        setEmail(email);
        setEmpNum(empNum);
        setPhone(phone);
        setUserName(userName);
        setPassword(password);
    }

}
