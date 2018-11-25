public abstract class Person {
   private String name,address;

   public Person(){
       this("Unknown","Unknown");
   }

   public Person(String name, String address){
       this.name = name;
       this.address = address;
   }

   @Override
    public String toString(){
       return "\nName: "+ name +"\n" + "Address: " + address;
   }

   public String getName(){
        return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getAddress(){
       return address;
   }
   public void setAddress(String address){
       this.address = address;
   }
}
