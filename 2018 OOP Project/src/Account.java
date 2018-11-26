import java.util.*;

public class Account extends Customer{

       ArrayList<Customer>customers=new ArrayList<>(35);

       public Person accHolder;
       public String name,accid;
       public double balance;
       public int custID;
       public double interestRate=0.05f,change;


       public Account(){this(null,"","",0.0f,0.0f,0,0.0f);}

       public Account(Person accHolder,String name,String accid,double balance,double interestRate,int custID,float change){

           this.accHolder=accHolder;
           this.name=name;
           this.accid=accid;
           this.balance=balance;
           this.interestRate=interestRate;
           this.change=change;
           this.custID=custID;
       }
       double getBalance(){
           return balance;
       }
       int getCustID(){
           return custID;
       }
       void setBalance(double balance){
           if(this.balance + balance >= 0)
               this.balance += balance;
           else
               this.balance = 0;
       }
       void setCustID(int custID){
           this.custID = custID;
       }

      public double getInterestRate(){
           return interestRate;
       }
       void setInterestRate(){
           this.interestRate = interestRate;
       }
        void adjustInterestRate(double r){
           interestRate = r;
       }

}
