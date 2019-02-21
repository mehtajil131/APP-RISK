import java.util.ArrayList;
import java.util.Scanner;

public class GameEngine {

    ArrayList<String> player_names = new ArrayList<>();

    public void initialise() {

        int i = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of players");
        int no_of_players = keyboard.nextInt();

        if (no_of_players < 2) {
            System.out.println("Minimum number of players is 2");
        } else if (no_of_players > 5) {
            System.out.println("Maximum number of players is 5");
        } else {
            for (i = 1; i <= no_of_players; i++) {
                System.out.println("Enter player name " + i + "\n");
                player_names.add(keyboard.next());
            }
        }
    }

}

