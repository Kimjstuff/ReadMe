import java.util.Scanner;

public class UserInput {

    public static void menu() {
        System.out.println("\nVelkommen til 8-holds turning i bordtennis\n");
        System.out.println(menuString);
    }

        public static String getUserInput(String msg) {
            System.out.print(msg);
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            return input;
        }
        private static String menuString =
                "Tryk 2 for at indtaste holdnavn\n" +
                        "Tryk 3 for at indtaste spilletider\n" +
                        "Tryk 4 for at indtaste kampprogram\n" +
                        "Tryk 5 for at indtaste semifinaler\n" +
                        "Tryk 6 for at indtaste resultater\n" +
                        "Tryk 7 for at få en oversigt over kampprograam, stilling og resultater";
    }
