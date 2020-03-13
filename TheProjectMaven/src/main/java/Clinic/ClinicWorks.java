package Clinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    List<Client> arrayList = new ArrayList<>();

   public static void main(String[] args) throws IOException {
       ClinicWorks clinicWorks = new ClinicWorks();
       System.out.println("Pet clinic...  (c)demiurg");
       while (true) {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("1 - add client..");
           System.out.println("2 - find client..");
           switch (Integer.parseInt(reader.readLine())){
               case 1 : clinicWorks.addClient();
               break;
               case 2 : clinicWorks.findClient();
               break;
               default:
                   System.out.println("default");
           }
       }
   }
    public void addClient(){
    //     Client client = new Client(addInputScanner("Input name clients: "),
      //                  new Pet (addInputScanner("Input name pets: "), addInputScanner("Input type pets: ")));
        Client client = new Client("Tatiana",new Pet("Barsik","Cat"));

        arrayList.add(client);
    for(int i = 0; i < arrayList.size(); i++){
        System.out.println(arrayList.get(i));
}
   }
   public void findClient(){
       ClinicWorks clinicWorks = new ClinicWorks();
       String find = clinicWorks.addInputScanner("What are we looking: ");
       for(int i = 0; i < arrayList.size(); i++){
           if(find.equals(arrayList.get(i).getClientIdName())){
               System.out.println("Yes "+arrayList.get(i));
           }
       }
   }

   public String addInputScanner(String input){
        System.out.println(input);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
