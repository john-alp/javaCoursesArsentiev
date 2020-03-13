package Clinic;


public class Client {
   private String clientIdName;
   private Pet petName;

   public Client(String clientIdName, Pet petName){
       this.clientIdName = clientIdName;
       this.petName = petName;

   }

 public void setClientIdName(String clientIdName){
     this.clientIdName = clientIdName;
 }
 public String getClientIdName(){
     return clientIdName;
 }

    @Override
    public String toString() {
        return " "+ clientIdName + petName;
    }
}
