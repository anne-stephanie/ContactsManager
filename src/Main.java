import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ContactsManager myContactsManager = new ContactsManager();
        Scanner recupChaine = new Scanner(System.in);

        myContactsManager.addContact(new Contact("Aka", "0713025066"));
        myContactsManager.addContact(new Contact("Yah", "0709858927"));
        myContactsManager.addContact(new Contact("Anne", "0574146365"));
        myContactsManager.addContact(new Contact("Stéphanie", "0170446206"));
        myContactsManager.addContact(new Contact("Marc Alex", "0152368290"));

        System.out.println("Saisissez le nom de votre ami(e)");

        String nameToSearch = recupChaine.nextLine();
        Contact found = myContactsManager.searchContact(nameToSearch);

        if (found != null) {
            System.out.println("Numéro de " + found.name + " : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
