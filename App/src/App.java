public class App {

    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Martin", "Jan-Daniel", "CEO", 2000);
        ausgabe("Mitarbeiter1 familyName: " + mitarbeiter1.getInfo("familyname"));
        ausgabe("Mitarbeiter1 firstName: " + mitarbeiter1.getInfo("firstname"));
        ausgabe("Mitarbeiter1 function: " + mitarbeiter1.getInfo("function"));
        ausgabe("Mitarbeiter1 entrenceYear: " + mitarbeiter1.getInfo("entrenceYear"));
        ausgabe("------------------------------------------------------------------------");

        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Mustermann", "Max", "Office", 2010);
        ausgabe("Mitarbeiter1 familyName: " + mitarbeiter2.getInfo("familyname"));
        ausgabe("Mitarbeiter1 firstName: " + mitarbeiter2.getInfo("firstname"));
        ausgabe("Mitarbeiter1 function: " + mitarbeiter2.getInfo("function"));
        ausgabe("Mitarbeiter1 entrenceYear: " + mitarbeiter2.getInfo("entrenceYear"));
        ausgabe("------------------------------------------------------------------------");

        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Musterfrau", "Martina", "Office", 2020);
        ausgabe("Mitarbeiter1 familyName: " + mitarbeiter3.getInfo("familyname"));
        ausgabe("Mitarbeiter1 firstName: " + mitarbeiter3.getInfo("firstname"));
        ausgabe("Mitarbeiter1 function: " + mitarbeiter3.getInfo("function"));
        ausgabe("Mitarbeiter1 entrenceYear: " + mitarbeiter3.getInfo("entrenceYear"));
        ausgabe("------------------------------------------------------------------------");
    }

    public static void ausgabe (String outputStr) {
        System.out.println(outputStr);
    }

}
