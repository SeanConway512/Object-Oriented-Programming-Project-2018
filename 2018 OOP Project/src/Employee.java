public class Employee extends Person {

    public String name,address,email,userName,password;
    public float empNum,ppsNo;
    public int phone;
    public Person Employee;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public float getEmpNum(){return empNum;}
    public void setEmpNum(float empNum){this.empNum = empNum;}

    public int getPhone(){return phone;}
    public void setPhone(int phone){this.phone = phone;}

    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName = userName;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public float getPpsNo(){return ppsNo;}
    public void setPpsNo(float ppsNo){this.ppsNo = ppsNo;}

    public Employee(){this("Unknown","N/A","N/A", 0.0f,0,null,null,0.0f);}

    public Employee(String name,String address,String email,float empNum,int phone,String userName,String password,float ppsNo)
    {
        setName(name);
        setAddress(address);
        setEmail(email);
        setEmpNum(empNum);
        setPhone(phone);
        setUserName(userName);
        setPassword(password);
        setPpsNo(ppsNo);
    }

   @Override
    public String toString(){
        return String.format(" Name:%20s\n Address:%20s\n Email:%20s\n Username:%20s\n Password:%20s\n EmpNum:%20s\n PPSNO:%20s\n Phone:%20s\n\n ",
                getName(),getAddress(),getEmail(),getEmpNum(),getPhone(),getUserName(),getPassword(),getPpsNo());
   }
}
