/*
 *	Author: Branden Chung
 *  Date: 10/2/26
 * 	Collaborator:
 */

import java.util.*;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tokens = 100;
    String slotimage = "0";
    String slotimage2 = "0";
    String slotimage3 = "0";
    System.out.println("Welcome to Lucky Rolls!");
    System.out.println("Would you like to try the slot machine? (Yes or No)");
    String choice = sc.nextLine();
    System.out.println();
    if(choice.equalsIgnoreCase("yes")){
        System.out.print("Great! How much would you like to bet on this roll? (You start of with 100 tokens): ");
    }
    else{
        System.out.println("Then why are you even here! Come back when you want to roll!");
        System.exit(0);
    }
    int rollAmount = sc.nextInt();
    if((rollAmount>70)&&(rollAmount<=100)){
        System.out.println("WOW your a big spender! I wish you luck!");
    }
    else{
        if((rollAmount>40)&&(rollAmount<=100)){
            System.out.println("Thats a good amount. Good Luck!");
        }
        else if((rollAmount>0)&&(rollAmount<=100)){
            System.out.println("Only that much? You know what they say, go big or go home!");
        }
        else{
            System.out.println("You don't have that many tokens. Come back when you have that much.");
            System.exit(0);
        }
        }
    tokens = (tokens-rollAmount);
    System.out.println("Alright time to spin!");
    System.out.println();
    try {
    Thread.sleep(3000); 
    } catch (InterruptedException e) {
    }
    int roll1 = ((int)(Math.random()*6)+1);
    if(roll1==1){
       slotimage = "🍒";
    }
    if(roll1==2){
       slotimage = "🍌";
    }
    if(roll1==3){
       slotimage = "🥝";   
    }
    if(roll1==4){
       slotimage = "🍓";    
    }
    if(roll1==5){
       slotimage = "🤑";    
    }
    if(roll1==6){
       slotimage = "🍇";    
    }
    System.out.println("         🟥🟥🟥🟥🟥");
    System.out.println("       🟥🟥🟥🟥🟥🟥🟥");
    System.out.println(" 🔴  🟥🟥🟨🟨🟨🟨🟨🟥🟥");
    System.out.println(" ⬜ 🟥🟨⬛⬛⬛⬛⬛⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛        ⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛ "+slotimage+"     ⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛        ⬛🟨🟥");
    System.out.println("  ⬜🟥🟨⬛⬛⬛⬛⬛⬛🟨🟥");
    System.out.println("     🟥🟥🟨🟨🟨🟨🟨🟥🟥");
    System.out.println("     🟥🟥🟥🟥🟥🟥🟥🟥🟥");
    int roll2 = ((int)(Math.random()*6)+1);
    if(roll2==1){
       slotimage2 = "🍒";
    }
    if(roll2==2){
       slotimage2 = "🍌";
    }
    if(roll2==3){
       slotimage2 = "🥝";   
    }
    if(roll2==4){
       slotimage2 = "🍓";    
    }
    if(roll2==5){
       slotimage2 = "🤑";    
    }
    if(roll2==6){
       slotimage2 = "🍇";    
    }
    try {
    Thread.sleep(2000); 
    } catch (InterruptedException e) {
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("         🟥🟥🟥🟥🟥");
    System.out.println("       🟥🟥🟥🟥🟥🟥🟥");
    System.out.println(" 🔴  🟥🟥🟨🟨🟨🟨🟨🟥🟥");
    System.out.println(" ⬜ 🟥🟨⬛⬛⬛⬛⬛⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛        ⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛ "+slotimage+slotimage2+"   ⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛        ⬛🟨🟥");
    System.out.println("  ⬜🟥🟨⬛⬛⬛⬛⬛⬛🟨🟥");
    System.out.println("     🟥🟥🟨🟨🟨🟨🟨🟥🟥");
    System.out.println("     🟥🟥🟥🟥🟥🟥🟥🟥🟥");
    int roll3 = ((int)(Math.random()*6)+1);
    if(roll3==1){
       slotimage3 = "🍒";
    }
    if(roll3==2){
       slotimage3 = "🍌";
    }
    if(roll3==3){
       slotimage3 = "🥝";   
    }
    if(roll3==4){
       slotimage3 = "🍓";    
    }
    if(roll3==5){
       slotimage3 = "🤑";    
    }
    if(roll3==6){
       slotimage3 = "🍇";    
    }
    try {
    Thread.sleep(2000); 
    } catch (InterruptedException e) {
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("         🟥🟥🟥🟥🟥");
    System.out.println("       🟥🟥🟥🟥🟥🟥🟥");
    System.out.println(" 🔴  🟥🟥🟨🟨🟨🟨🟨🟥🟥");
    System.out.println(" ⬜ 🟥🟨⬛⬛⬛⬛⬛⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛        ⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛ "+slotimage+slotimage2+slotimage3+" ⬛🟨🟥");
    System.out.println(" ⬜ 🟥🟨⬛        ⬛🟨🟥");
    System.out.println("  ⬜🟥🟨⬛⬛⬛⬛⬛⬛🟨🟥");
    System.out.println("     🟥🟥🟨🟨🟨🟨🟨🟥🟥");
    System.out.println("     🟥🟥🟥🟥🟥🟥🟥🟥🟥");
    try {
    Thread.sleep(2000); 
    } catch (InterruptedException e) {
    }
    System.out.println();
    System.out.println();
    if(((slotimage.equals("🤑"))&&(slotimage2.equals("🤑"))&&(slotimage3.equals("🤑")))){
        System.out.println("OMG YOU WON THE SUPERJACKPOT!!!");
        System.out.println("YOU MULTIPLIED YOUR TOKENS BY 1000x");
        rollAmount = rollAmount*1000;
        tokens = tokens+rollAmount;
    }
    else if((slotimage.equals(slotimage2))&&(slotimage.equals(slotimage3))){
        System.out.println("WOOHOO YOU WON THE JACKPOT!!!");
        System.out.println("YOU MULTIPLIED YOUR TOKENS BY 100x!");
        rollAmount = rollAmount*100;
        tokens = tokens+rollAmount;
    }
    else if((slotimage.equals(slotimage2))||((slotimage.equals(slotimage3)))||((slotimage2.equals(slotimage))||((slotimage2.equals(slotimage3))))||(slotimage3.equals(slotimage2))||((slotimage3.equals(slotimage)))){
        System.out.println("WOW you won a bit of tokens back");
        System.out.println("You multiplied your tokens by 2x");
        rollAmount = rollAmount*2;
        tokens = tokens+rollAmount;
    }
    else{
        System.out.println("... you didn't win anything 😞");
    }
    try {
    Thread.sleep(2000); 
    } catch (InterruptedException e) {
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("You ended up with "+tokens+" tokens in total.");
    }

 }


