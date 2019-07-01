package week1.exUpTo24;

import java.util.Scanner;

public class ex24NHLStatisticsP2 {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // print the top ten playes sorted by points
            } else if (command.equals("goals")) {
                // print the top ten players sorted by goals
            } else if (command.equals("assists")) {
                // print the top ten players sorted by assists
            } else if (command.equals("penalties")) {
                // print the top ten players sorted by penalties
            } else if (command.equals("player")) {
                // ask the user for the player name and print the statistics for that player
            } else if (command.equals("club")) {
                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)
            }
        }
    }
}
