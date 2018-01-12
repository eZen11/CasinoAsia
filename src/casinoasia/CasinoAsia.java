package casinoasia;

import java.util.Scanner;

/* Jungtae Kim, Gavin Pham, Cody Somerville, Ethan Zheng
 * January 2018
 * CasinoAsia
 * 
 */
public class CasinoAsia {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    

    public static void main(String[] args) {
        int gameChoice = 0;
        int balance = 1000;
        System.out.println(ANSI_YELLOW + "Hello!");
        System.out.println(ANSI_YELLOW + "Welcome to CasinoAsia!" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Your starting balance is $1000." + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Please select what game you would like to play: " + ANSI_RESET);
        System.out.println(ANSI_WHITE + "(1) Poker" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "(2) Blackjack" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "(3) Roulette" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "(4) War" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "(5) Slots" + ANSI_RESET);

        Scanner input = new Scanner(System.in);
        gameChoice = input.nextInt();

        while (gameChoice >= 1 && gameChoice <= 5) {
            switch (gameChoice) {
                case 1: //Poker 
                    System.out.println();
                    break;
                case 2: //Blackjack
                    System.out.println();
                    break;
                case 3: //Roulette

                    break;
                case 4: //War
                    System.out.println();
                    break;
                case 5: //Slots
                    System.out.println();
                    break;
            }            
            
            System.out.println(ANSI_YELLOW + "Please select what game you would like to play: " + ANSI_RESET);
            System.out.println(ANSI_WHITE + "(1) Poker" + ANSI_RESET);
            System.out.println(ANSI_WHITE + "(2) Blackjack" + ANSI_RESET);
            System.out.println(ANSI_WHITE + "(3) Roulette" + ANSI_RESET);
            System.out.println(ANSI_WHITE + "(4) War" + ANSI_RESET);
            System.out.println(ANSI_WHITE + "(5) Slots" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Enter 101 to exit the casino.");
            
            gameChoice = input.nextInt();
        }

    }

}
