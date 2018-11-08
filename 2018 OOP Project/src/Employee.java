public class Employee {

    private String name, address, email;
    private float empnum;
    private int phone;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public float getEmpNum(){return empnum;}
    public void setEmpNum(float empnum){this.empnum = empnum;}

    public int getPhone(){return phone;}
    public void setPhone(int phone){this.phone = phone;}

    public Employee(){this("Unknown","N/A","N/A", 0.0f,0);}

    public Employee(String name,String address,String email,float empnum,int phone){
        setName(name);
        setAddress(address);
        setEmail(email);
        setEmpNum(empnum);
        setPhone(phone);
    }

}
