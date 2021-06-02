public class Mitarbeiter {

    String familyName;
    String firstName;
    String function;
    int entrenceYear;

    public Mitarbeiter(String familyName, String firstName, String function, int entrenceYear) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.function = function;
        this.entrenceYear = entrenceYear;
    }

    public String getInfo(String propertie){
        switch (propertie) {
            case "familyname":
                return this.familyName;
            case "firstname":
                return this.firstName;
            case "function":
                return this.function;
            case "entrenceYear":
                return Integer.toString(this.entrenceYear);
            default:
                return "Error";
        }
    }
}
