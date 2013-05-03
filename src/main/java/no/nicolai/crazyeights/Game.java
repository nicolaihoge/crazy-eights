package no.nicolai.crazyeights;

import java.io.Console;
import java.util.Scanner;

/**
 * Msin game entry point
 */
public class Game {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of getPlayers: ");
        int numOfPlayers = scanner.nextInt();
        System.out.println(numOfPlayers + " getPlayers");
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.print("Name player " + i + " : ");
            String name = scanner.next();
        }
    }
}
