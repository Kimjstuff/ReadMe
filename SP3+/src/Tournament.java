import java.util.ArrayList;

public class Tournament {

    private ArrayList<Team> teams;

    public Tournament() {
        this.teams = new ArrayList<Team>();
    }
    public ArrayList<Team> getTeams() {
        return teams;
    }

    /*
    @Override
    public String toString() {
        String teams = "+";
        for(Team t : getTeams()) {
            teams = t.toString();
        }
        return teams;
    }

     */
}

