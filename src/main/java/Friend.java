public class Friend extends Contact{
    private int phoneNumber;


    public Friend(String name, int phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name=" + super.getName() +
                " phoneNumber=" + phoneNumber +
                '}';
    }
}
