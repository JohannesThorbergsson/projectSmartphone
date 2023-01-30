public abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}
