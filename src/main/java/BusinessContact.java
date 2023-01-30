public class BusinessContact extends Contact{
private String companyName;

    public BusinessContact(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}
