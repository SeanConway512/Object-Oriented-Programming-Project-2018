import java.util.*;

public abstract class Account extends Customer{

       ArrayList<Customer> customers=new ArrayList<>(35);
       private Person accHolder;
       private String name,accid;
       public float balance;
       public float interestRate,change;

       public float InterestRateChange(){
          return interestRate * change;
       }

       public Account(){this(null,"","",0.0f,0.0f,0.0f);}

       public Account(Person accHolder,String name,String accid,float balance,float interestRate,float change){
           this.accHolder=accHolder;
           this.name=name;
           this.accid=accid;
           this.balance=balance;
           this.interestRate=interestRate;
           this.change=change;
       }

}
