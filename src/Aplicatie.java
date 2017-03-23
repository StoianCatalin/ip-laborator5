import java.util.ArrayList;
import java.util.Vector;

public class Aplicatie {

  private static Aplicatie instance = new Aplicatie();
  public boolean status = false;
  Aplicatie() {}

  public static Aplicatie getInstance() {
    return instance;
  }

  public void setStatus(boolean newVal) {
    this.status = newVal;
  }

  public int dimensiune;

  public String nume;

  public String descriere;

  public ArrayList<String> context;

  public void install() {
  }

  public void uninstall() {
  }

}