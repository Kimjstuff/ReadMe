import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan =  new Scanner(System.in);
        System.out.println("How many teams?");
        int input;
        input = scan.nextInt();

        Tournament tournament = IO.input(input);
        IO.writeTeamFile(tournament);
        IO.menu(tournament);
          //  FileIO.readGameData();


        //TO-DO Måske ha en seperat class til at læse/scanne txt.filerne og uploade alt i et loop
    }
}