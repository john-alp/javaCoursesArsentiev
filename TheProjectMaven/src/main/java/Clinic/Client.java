package Clinic;


public class Client {
   private String clientIdName;
   private Pet petName;

   public Client(String clientIdName, Pet petName1){
       this.clientIdName = clientIdName;
       this.petName = petName1;

   }

 public void setClientIdName(String clientIdName){
     this.clientIdName = clientIdName;
 }
 public String getClientIdName(){
     return clientIdName;
 }
 public Pet getPetName(){
       return petName;
 }
    @Override
    public String toString() {
        return "Name client: " + clientIdName + petName;
    }

//    @Override
//    public String toString() {
//        return "Client{" +
//                "clientIdName='" + clientIdName + '\'' +
//                ", petName=" + petName +
//                '}';
//    }
}
