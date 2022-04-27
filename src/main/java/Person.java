public class Person implements IncomeData {
    String countryCode;
    String company;
    String contactFirstName;
    String contactLastName;
    int countryPhoneCode;
    int phoneNumber;

    public Person(String countryCode, String company, String contactFirstName, String contactLastName, int countryPhoneCode, int phoneNumber) {
        this.countryCode = countryCode;
        this.company = company;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.countryPhoneCode = countryPhoneCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getContactFirstName() {
        return contactFirstName;
    }

    @Override
    public String getContactLastName() {
        return contactLastName;
    }

    @Override
    public int getCountryPhoneCode() {
        return countryPhoneCode;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }
}