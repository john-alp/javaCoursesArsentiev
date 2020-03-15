package Clinic;


public class Client {
   private String clientIdName;
   private Pet petName;

   public Client(String clientIdName){
       this.clientIdName = clientIdName;
       this.petName = petName;
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
        return "Name clientC: " + clientIdName + petName;
    }

//    @Override
//    public String toString() {
//        return "Client{" +
//                "clientIdName='" + clientIdName + '\'' +
//                ", petName=" + petName +
//                '}';
//    }
}
