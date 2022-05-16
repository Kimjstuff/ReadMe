import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

    public static void readGameData() {

        String path = "src/teamData.txt";
        String teamNamesFile = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine(); //Reads first line, so it skips the header
            while ((teamNamesFile = br.readLine()) != null) {
                String[] teamNames = teamNamesFile.split(",");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showTeams() {

        String path = "src/teamData.txt";
        String teamNamesFile = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine(); //Reads first line, so it skips the header
            while ((teamNamesFile = br.readLine()) != null) {
                String[] teamNames = teamNamesFile.split(",");
                System.out.println(teamNamesFile);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
