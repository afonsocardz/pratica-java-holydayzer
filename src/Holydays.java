import java.util.HashMap;

public class Holydays {
  private HashMap<String, String> holydaysList;

  public Holydays(HashMap<String, String> holydaysList) {
    this.holydaysList = holydaysList;
  }

  public HashMap<String, String> getHolydaysList() {
    return holydaysList;
  }

  public String findHolyday(String date) {
    String name = this.holydaysList.get(date);
    if (name == null) {
      return "Não existe feriado na data " + date;
    } else {
      return date + "=>" + name;
    }
  }
}
