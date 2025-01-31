import java.util.ArrayList;
import java.util.List;

public class Game implements Results {
    //Properties

    List<Player> players = new ArrayList<>();

    //Constructors
    public Game() {
        Main main = new Main();
        addPlayer(main.createPlayer());
        addPlayer(main.createPlayer());
        System.out.println("player one is " + players.get(0).name + " and player two is " + players.get(1).name);

    }

    //Methods
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public Result getResults() {
        return null;
    }
    
}
