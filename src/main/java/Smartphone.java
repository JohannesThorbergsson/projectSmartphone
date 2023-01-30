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
}
