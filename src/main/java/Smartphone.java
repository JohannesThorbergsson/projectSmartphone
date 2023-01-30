import java.util.List;

public class Smartphone implements Radio, GPS{
    private String modelName;
    private String manufacturer;
    private List<Contact> contactList;

    public Smartphone(String modelName, String manufacturer, List<Contact> contactList) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.contactList = contactList;
    }

    public Smartphone() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactList=" + contactList +
                '}';
    }

    @Override
    public String getPostion() {
        return "Heidelberg";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public void addContact(Contact addedContact) {
        contactList.add(addedContact);
    }

    public Contact getContact(int i) {
        return contactList.get(i);
    }

    public Contact getContactByName(String contactName) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }
    public List<Contact> removeContactByName(String removedContact) {
        for(int i =0; i<contactList.size(); i++) {
            if (contactList.get(i).getName().equals(removedContact)) {
                contactList.remove(i);
                return contactList;
            }
        }
        return null;
    }
}
