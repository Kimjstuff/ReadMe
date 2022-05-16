import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Match {
    private static String comma = ", ";
    private static int matchID = 1;
    private static Tournament t = null;

    private static Scanner scan = new Scanner(System.in);

    private static int readUserInput(String msg) {
        System.out.print(msg);
        return scan.nextInt();
    }

    public static void match(Tournament teams) throws IOException {
        System.out.print("\nFølgende hold er tilmeldte: \n");
        int i = 1;
        for (Team t : teams.getTeams()) {
            System.out.print("[" + i + "] " + t.getName() + "\n");
            i++;
        }

        for (int j = 0; j < teams.getTeams().size() / 2; j++) {
            int teamAInput = readUserInput("Vælg hold A til kamp: \n");
            Team teamAdata = teams.getTeams().get(teamAInput - 1);

            int teamBInput = readUserInput("Vælg hold B til kamp: \n");
            Team teamBdata = teams.getTeams().get(teamBInput - 1);
            System.out.println(teamAdata + " vs " + teamBdata);

            try {
                FileWriter fileWriter = new FileWriter("src/Match.txt", true);
                fileWriter.write("\n" + matchID + comma + teamAdata + comma + teamBdata + comma);
                fileWriter.close();
                matchID++;
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        // IO.menu(t);
        matchRes(t);
    }

    public static void matchRes(Tournament teams) throws IOException {
        String path = "src/Match.txt";
        String teamMatchFile = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine(); //Reads first line, so it skips the header
            while ((teamMatchFile = br.readLine()) != null) {
                String[] teamMatches = teamMatchFile.split(",");
                System.out.println(teamMatchFile);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int l = readUserInput("Choose a match!\n");

        BufferedReader br = new BufferedReader(new FileReader("src/Match.txt"));
        String ln;
        int lineIndex = 1;
        boolean found = false;
        while ((ln = br.readLine()) != null) { //Read as long as line is not null
            if (lineIndex == l) {
                System.out.println(br.readLine());
                found = true;
                int teamARes = readUserInput("Number of goals from team A?");
                int teamBRes = readUserInput("Number of goals from team B?");

                if (teamARes > teamBRes) {
                    int teamAPoint = 3;
                    int teamBPoint = 0;
                    try {
                        FileWriter fileWriter = new FileWriter("src/Match.txt", true);
                        fileWriter.write(teamARes + comma + teamBRes + comma + teamAPoint + comma + teamBPoint);
                        fileWriter.close();
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }

                if (teamARes == teamBRes) {
                    int teamAPoint = 1;
                    int teamBPoint = 1;
                    try {
                        FileWriter fileWriter = new FileWriter("src/Match.txt", true);
                        fileWriter.write(teamARes + comma + teamBRes + comma + teamAPoint + comma + teamBPoint);
                        fileWriter.close();
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
                if (teamARes < teamBRes) {
                    int teamAPoint = 0;
                    int teamBPoint = 3;
                    try {
                        FileWriter fileWriter = new FileWriter("src/Match.txt", true);
                        fileWriter.write(teamARes + comma + teamBRes + comma + teamAPoint + comma + teamBPoint);
                        fileWriter.close();
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
                System.out.println(br.readLine());
                IO.menu(t);
                break;
            }
            lineIndex++;
        }
        if (!found) {
            readUserInput("Den ønskede kamp blev ikke fundet!\n" +
                    "Tryk 9 for at vende tilbage til menuen");
            int input = scan.nextInt();
            if (input == 9) {
                IO.menu(t);
            }
        }
    }


   /* public static void newMatch(Tournament teams) {
        ArrayList<Team> getTeams = teams.getTeams();
        System.out.println("New match" + getTeams.get(0));
        System.out.println(getTeams.get(1));
    }*/

}