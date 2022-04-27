public class IncomeDataAdapter implements Customer, Contact {
    IncomeData data;

    public IncomeDataAdapter(IncomeData data) {
        this.data = data;
    }

    @Override
    public String getCompanyName() {
        return data.getCompany();
    }

    @Override
    public String getCountryName() {
        return Solution.countries.get(data.getCountryCode());
    }

    @Override
    public String getName() {
        return data.getContactLastName() + ", " + data.getContactFirstName();
    }

    @Override
    public String getPhoneNumber() {
        StringBuilder number_without_code = new StringBuilder(Integer.toString(data.getPhoneNumber()));
        while(number_without_code.length()<10){
            number_without_code.insert(0, "0");
        }
        return returnedPhoneNumber(Integer.toString(data.getCountryPhoneCode()), number_without_code.toString());
    }

    public String returnedPhoneNumber(String code, String without_code){
        StringBuilder result = new StringBuilder("+" + code);
        for (int i = 0; i < without_code.length(); i++) {
            switch (i) {
                case 0 -> result.append("(").append(without_code.charAt(i));
                case 3 -> result.append(")").append(without_code.charAt(i));
                case 6, 8 -> result.append("-").append(without_code.charAt(i));
                default -> result.append(without_code.charAt(i));
            }
        }
        return result.toString();
    }
}