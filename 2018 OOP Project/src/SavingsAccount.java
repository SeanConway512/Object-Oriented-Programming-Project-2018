public class SavingsAccount extends Account{

    private double interestInterval,taxRate;
    private final String TYPE="Savings";

    public double getInterestRate(){return interestRate;}

    public void setInterestRate(double InterestRate){this.interestRate = interestRate;}

    public SavingsAccount(double taxRate){
        super();
        this.taxRate = taxRate;
    }

   public static double getInterestInterval(){
        return getInterestInterval();
   }
   public SavingsAccount(Person accHolder,String name,String accid,float balance,float interestRate,int custID,float change){
        super(accHolder,name,accid,balance,interestRate,custID,change);
        this.taxRate=taxRate;
   }
   public double getTaxRate(){
        return taxRate;
   }
   public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
   }

    public double calcTax(){
        double taxamount=balance*taxRate/100;

        return 0;
   }
   @Override
    public String toString(){return "Account type: "+ TYPE+super.toString()+"\ntaxRate: " + taxRate +"\n";}
}
