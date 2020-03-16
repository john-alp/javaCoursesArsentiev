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
 public String getPetName(){
       return petName.getPetName();
 }
 public String getPetType(){
       return petName.getPetType();
 }


    @Override
    public String toString() {
        return "Client: " + clientIdName + '\'' +  ", petName: " + petName.getPetName() + ", petType: " + petName.getPetType();
    }
}
