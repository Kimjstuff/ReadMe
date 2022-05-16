import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException {

        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql//localhost:3306/jdbc-test","root","Kimjensen101");
            //Statement statement = connection.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }



    // Tournament tournament = IO.input(2);
    //  IO.writeTeamFile(tournament);
    //  IO.menu(tournament);
    //  FileIO.readGameData();


    //TO-DO Måske ha en seperat class til at læse/scanne txt.filerne og uploade alt i et loop
}
}