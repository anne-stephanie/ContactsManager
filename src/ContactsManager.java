public class ContactsManager {
    Contact[] contacts;
    int totalContacts;

    public ContactsManager() {
        contacts = new Contact[100];
        totalContacts = 0;
    }

    public void addContact(Contact contact) {
        if (totalContacts < contacts.length) {
            contacts[totalContacts] = contact;
            totalContacts++;
        } else {
            System.out.println("Liste de contacts pleine !");
        }
    }

    public Contact searchContact(String name) {
        for (int i = 0; i < totalContacts; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                return contacts[i];
            }
        }
        return null;
    }
}
