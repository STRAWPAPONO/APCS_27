/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {

    public static String getObject(){
        int chance = (int)((Math.random()*3)+1);
        String rps = "";
        if(chance==1){
        rps = "rock";
        } 
        if(chance==2){
        rps = "paper";
        }
        if(chance==3){
        rps = "scissor";
        }
        return rps;
    }
    public static int compare2(String a, String b){
        int wtl = 0;
        if(a.equalsIgnoreCase(b)){
            wtl = 0;
        }
        if((a.equalsIgnoreCase("rock"))&&b.equalsIgnoreCase("scissor")){
            wtl = 1;
        }
        if((a.equalsIgnoreCase("paper"))&&b.equalsIgnoreCase("rock")){
            wtl = 1;
        }
        if((a.equalsIgnoreCase("scissor"))&&b.equalsIgnoreCase("paper")){
            wtl = 1;
        }
        if((b.equalsIgnoreCase("rock"))&&a.equalsIgnoreCase("scissor")){
            wtl = 2;
        }
        if((b.equalsIgnoreCase("paper"))&&a.equalsIgnoreCase("rock")){
            wtl = 2;
        }
        if((b.equalsIgnoreCase("scissor"))&&a.equalsIgnoreCase("paper")){
            wtl = 2;
        }
        return wtl;
    }
    public static void main(String[] args) {
        int Player1wins = 0;
        int Player2wins = 0;
        int PlayerTies = 0;
        String rockpaperscissors;
        int wintieloss;
        String computerschoice;
        int numberoftimes = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Would you like to play Rock, Papers, or Scissors (no/yes/done)");
        Player1wins = 0;
        Player2wins = 0;
        PlayerTies = 0;
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Choose (Rock, Paper, or Scissor)");
            rockpaperscissors = sc.nextLine();
            while(true){
                if((rockpaperscissors.equalsIgnoreCase("rock"))||(rockpaperscissors.equalsIgnoreCase("paper"))||(rockpaperscissors.equalsIgnoreCase("scissor"))){
                    break;
                }
                System.out.println("That was not a valid choice. Please choose again (Rock, Paper, Scissor)!");
                rockpaperscissors = sc.nextLine();
            }
            computerschoice = getObject();
            wintieloss = compare2(computerschoice, rockpaperscissors);
            if(wintieloss==0){
                System.out.println();
                System.out.println("You chose "+rockpaperscissors+" but the computer also chose "+computerschoice);
                System.out.println("You tied!");
                System.out.println();
            }
            if(wintieloss==1){
                System.out.println();
                System.out.println("You chose "+rockpaperscissors+" but the computer chose "+computerschoice);
                System.out.println("You lost!");
                System.out.println();
            }
            if(wintieloss==2){
                System.out.println();
                System.out.println("You chose "+rockpaperscissors+" and the computer chose "+computerschoice);
                System.out.println("You won!");
                System.out.println();
            }
        }
        if(choice.equalsIgnoreCase("no")){
            System.out.println("How many times should the computer play itself");
            numberoftimes = sc.nextInt();
            while(true){
                if(numberoftimes>=1){
                    break;
                }
                System.out.println("Please choose a valid number of times.");
                numberoftimes = sc.nextInt();
            }
            System.out.println("Okay the computer will face of against itself "+numberoftimes+" times.");
            while(numberoftimes!=0){
                rockpaperscissors = getObject();
                computerschoice = getObject();
                wintieloss = compare2(computerschoice, rockpaperscissors);
                if(wintieloss==0){
                    System.out.println("Player 1 chose "+rockpaperscissors+" but Player 2 also chose "+computerschoice);
                    System.out.println("They tied!");
                    System.out.println();
                    PlayerTies++;
                }
                if(wintieloss==1){
                    System.out.println("Player 1 chose "+rockpaperscissors+" but Player 2 chose "+computerschoice);
                    System.out.println("Player 1 lost!");
                    System.out.println();
                    Player1wins++;
                }
                if(wintieloss==2){
                    System.out.println("Player 1 chose "+rockpaperscissors+" and Player 2 chose "+computerschoice);
                    System.out.println("Player 2 won!");
                    System.out.println();
                    Player2wins++;
                }
                numberoftimes--;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Player 1 won "+Player1wins+" times!");
            System.out.println("Player 2 won "+Player2wins+" times!");
            System.out.println("Player 1 and Player 2 tied "+PlayerTies+" times!");
            sc.nextLine();
            System.out.println();
        }
        if(choice.equalsIgnoreCase("done")){
           break; 
        }
        }
    }
}
