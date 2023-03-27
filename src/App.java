import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> holydays = new HashMap<>();
        holydays.put("01/01/2023", "Confraternização mundial");
        holydays.put("21/02/2023", "Carnaval");
        holydays.put("17/04/2023", "Páscoa");

        Holydays holydaysList = new Holydays(holydays);

        System.out.println(holydaysList.getHolydaysList().values().toString());

        System.out.println(holydaysList.findHolyday("01/01/2023"));
        System.out.println(holydaysList.findHolyday("01/02/2023"));
    }
}
