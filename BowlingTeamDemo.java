/*
CH8 Arrays
Using Variable Subscripts with an Array
8.8.3.Creating a Program to Demonstrate an Instance of the BowlingTeam Class
BowlingTeamDemo.java
Description:A program in which you create an instance of the BowlingTeam
class and provide values for it.
*/

import java.util.*;

public class BowlingTeamDemo {

    public static void main(String[] args) {
        //Add five declarations. These include:
        //a String that holds user input,
        //a BowlingTeam object, an integer to use as a subscript, a constant that represents the number of members on a bowling team, and a Scanner object for input.
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int sub;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner reader = new Scanner(System.in);

        //Prompt the user for a bowling team name. Accept it, and then assign it to the BowlingTeam object:
        System.out.print("Enter team name >> ");
        name = reader.nextLine();
        bowlTeam.setTeamName(name);

        //In a loop that executes four times, prompt the user for a team member’s name.
        //Accept the name and assign it to the BowlingTeam object using the subscript to indicate the team member’s position in the array in the BowlingTeam class.
        for (sub = 0; sub < NUM_TEAM_MEMBERS; ++sub ) {
            System.out.print("Enter team member's name >> ");
            name = reader.nextLine();
            bowlTeam.setMember(sub, name);
        }

        //Display the details of the BowlingTeam object
        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for (sub = 0; sub < NUM_TEAM_MEMBERS; ++sub)
            System.out.print(bowlTeam.getMember(sub) + " ");
            System.out.println();
    }
}
