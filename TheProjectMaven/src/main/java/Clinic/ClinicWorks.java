package Clinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

/**
 * @author  demiurg
 * @since  12.03.2020
 *
 *  Создать программу для обслуживания клиники домашних питомцев
 *
 * - Должна быть возможность добавлять клиентов
 * - Указывать какой питомец есть у клиента
 * - Возможность искать по кличке питомца, по имени клиента
 * - Редактировать имя клиента, имя питомца
 * - Удалять клиента и питомца
 * - Возможность проверки
 */
public class ClinicWorks {
 Pet pet = new Pet(" "," ");

    List<Client> arrayList = new ArrayList<>();

   public static void main(String[] args) throws IOException {
       ClinicWorks clinicWorks = new ClinicWorks();
       System.out.println("Pet clinic...  (c)demiurg");
       while (true) {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           System.out.println();
           System.out.println("Selected action: ");
           System.out.println("1 - add a client \n" + "2 - delete client \n" + "3 - Find client. \n" + "4 - find pet \n" + "5 - rename client \n" + "6 - rename pet \n" +
                   "7 - to watch all the clients and pets \n" + "9 - Exit to program...");
           switch (Integer.parseInt(reader.readLine())){
               case 1 : clinicWorks.addClient();
               break;
               case 2 : clinicWorks.delClient();
               break;
               case 3 : clinicWorks.findClient();
               break;
               case 4 : clinicWorks.findPet();
               break;
               case 5 : clinicWorks.renameClient();
               break;
               case 6 : clinicWorks.renamePet();
               break;
               case 7 : clinicWorks.showAll();
               break;
               case 9 :
               default:
                   System.out.println("default");
           }
       }
   }
    public void addClient(){
//         Client client = new Client(addInputScanner("Input name clients: "),
//                        new Pet (addInputScanner("Input name pets: "), addInputScanner("Input type pets: ")));
        Client client = new Client("Ta",new Pet("Bar","Cat"));

        arrayList.add(client);
    for (int i = 0; i < arrayList.size(); i++){
        System.out.println(arrayList.get(i));
    }
   }
   public void delClient(){

   }
   public void findClient(){
       ClinicWorks clinicWorks = new ClinicWorks();
       for (int i = 0; i < arrayList.size(); i++){
           if(clinicWorks.getFromKeyboard("What are we looking? ").equals(arrayList.get(i).getClientIdName())){
               System.out.println("Yes "+arrayList.get(i));
           }else{
               System.out.println("Sorry, not found...");
           }
       }
   }
   public void findPet() {
       ClinicWorks clinicWorks = new ClinicWorks();
       for (int i = 0; i < arrayList.size(); i++)
           if(clinicWorks.getFromKeyboard("Pet: What are we looking?").equals(arrayList.get(i).getPetName())){
               System.out.println("The search is successful.." + arrayList.get(i).getPetName());
           }else{
               System.out.println("Sorry, not found...");
               System.out.println("Test: " + arrayList.get(i).getPetName());

           }
 }
   public void renameClient(){}
   public void renamePet(){}

   public void showAll(){
       ClinicWorks clinicWorks = new ClinicWorks();
       for (int i = 0; i < arrayList.size(); i++){
           System.out.println(arrayList);
       }
   }

   public String getFromKeyboard(String input) {
       System.out.println(input);
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           return reader.readLine();
       } catch (IOException e) {
           return "Something went wrong.. " + e.getStackTrace();
       }
   }
}
