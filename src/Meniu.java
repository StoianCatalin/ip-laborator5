import java.util.ArrayList;
import java.util.Vector;

public class Meniu {

    ArrayList <Integer> options = new ArrayList<Integer>();
    Game game;

    Meniu() {
       options.add(1);
       options.add(0);
       options.add(0);
       options.add(0);
    }

    public Vector  myAplicatie;
    public Game  myGame;

  public void newGame(String name) {
	  game = new Game(name);
  }

  public void Exit() {
	  this.game = null;
  }

  public void Continue() {
  }

  public void moveUp() {
	  int position = 0;
	  for (int i = 0; i< options.size(); i++){
		  if (options.get(i).equals(new Integer(1))){
			  position = i;
			  break;
		  }
	  }
	  
	  options.set(position, new Integer(0));
	  
	  if (position == options.size() - 1){
		  options.set(0, new Integer(1));
	  } else {
		  options.set(position +1, new Integer(1));
	  }
  }

  public void moveDown() {

	  int position = 0;
	  for (int i = 0; i< options.size(); i++){
		  if (options.get(i).equals(new Integer(1))){
			  position = i;
			  break;
		  }
	  }
	  
	  options.set(position, new Integer(0));
	  
	  if (position == 0){
		  options.set(options.size() - 1, new Integer(1));
	  } else {
		  options.set(position - 1, new Integer(1));
	  }

  }


}