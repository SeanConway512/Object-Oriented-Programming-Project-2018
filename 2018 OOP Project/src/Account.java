import java.util.*;

public abstract class Account extends Customer{

       ArrayList<Customer> customers=new ArrayList<>();
       private String name,accid;
       public float balance;
       public float interestRate,change;

       public float InterestRateChange(){
          return interestRate * change;
       }
}
