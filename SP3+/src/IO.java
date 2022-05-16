import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
    private static int teamID = 1;
    private static Scanner scan = new Scanner(System.in);

    private static String readUserInput(String msg) {
        System.out.print(msg);
        return scan.nextLine();
    }

    public static Tournament input(int numTeams) {
        Tournament tournament = new Tournament();
        for (int i = 0; i < numTeams; i++) {
            String teamName = readUserInput("Team name: ");
            Team team = new Team(teamName);
            tournament.getTeams().add(team);

            int numPlayersPerTeam = Integer.parseInt(readUserInput("How many players are on the team? "));

            for (int j = 0; j < numPlayersPerTeam; j++) {
                String playerName = readUserInput("Player name: ");
                Player player = new Player(playerName);
                team.getPlayers().add(player);
            }
        }
        return tournament;
    }

    public static void writeTeamFile(Tournament tournament) {
        try {
            FileWriter fileWriterDefault = new FileWriter("src/teamData.txt");
            fileWriterDefault.write("teamID, teamName, teamPlayer1, teamPlayer2, teamPlayer3, teamPlayer4, teamPlayer5");
            fileWriterDefault.close();
            FileWriter fileWriterMatch = new FileWriter("src/Match.txt");
            fileWriterMatch.write("matchID, teamA, teamB, teamARes, teamBRes, teamAPoint, teamBPoint");
            fileWriterMatch.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        for (Team team : tournament.getTeams()) {
            String fullPlayerNames = "";

            for (Player player : team.getPlayers()) {
                String tmpPlayer = player.getName() + ", ";
                fullPlayerNames = fullPlayerNames + tmpPlayer;
            }

            try {

                FileWriter fileWriter = new FileWriter("src/teamData.txt", true);
                fileWriter.write("\n[" + teamID + "], " + team.getName() + ", " + fullPlayerNames);
                fileWriter.close();
                teamID++;
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        System.out.println("Size of teamArray: " + tournament.getTeams().size());
    }

    public static void menu(Tournament tournament) throws IOException {
        int choice = 1;
        System.out.println(
                "Tryk 1 for at se alle tilmeldte hold" +
                        "\nTryk 2 for at sætte kampprogram" +
                        "\nTryk 3 for at indtaste kampresultat");

        choice = scan.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 9:
                    System.out.println(
                            "Tryk 1 for at se alle tilmeldte hold" +
                                    "\nTryk 2 for at sætte kampprogram" +
                                    "\nTryk 3 for at indtaste kampresultat");
                    choice = scan.nextInt();
                    break;
                case 1:
                    FileIO.showTeams();
                    System.out.println("Tryk 9 for at se menuen igen");
                    choice = scan.nextInt();
                    break;
                case 2:
                    Match.match(tournament);
                    choice = scan.nextInt();
                    break;


                default:
                    menu(tournament);
                    break;

            }
        }
    }
}