import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Game {

	String name = "";
	
    Game(String name) {
        obstacole = new ArrayList<Obstacole>();
        myVietati = new ArrayList<Vietati>();
        obstacole.add(new Sticla());
        obstacole.add(new Lemne());
        obstacole.add(new Piatra());

        myVietati.add(new Red(10, 20));
        myVietati.add(new Blue(10, 20));
        myVietati.add(new Black(10, 20));
        
        this.name = name;
        
        
    }

    public List<Vietati>  myVietati;
    public List<Obstacole> obstacole;
    public Meniu myMeniu;
    /**
   * 
   * @element-type Level
   */
  public Level myLevel;

  public void StartGame() {
  }

  public void Pause() {
  }

  public void Exit() {
  }

  public void Continue() {
  }

}