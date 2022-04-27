import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    public static void main(String[] args) {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

        IncomeData person = new Person("RU","JavaRush Ltd.","Petr","Borisov",7,14521278);
        Customer customer = new IncomeDataAdapter(person);
        Contact contact = new IncomeDataAdapter(person);

        System.out.println("Информация класса Customer:");
        System.out.println(customer.getCompanyName());
        System.out.println(customer.getCountryName()+'\n');

        System.out.println("Информация класса Contact:");
        System.out.println(contact.getName());
        System.out.println(contact.getPhoneNumber());
    }
}