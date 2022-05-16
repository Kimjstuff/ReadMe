import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }
    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

}