/*
CH8 Arrays
Using Variable Subscripts with an Array
8.8.Creating a Class that Contains an Array of Strings
BowlingTeam.java
Description:creating a class named BowlingTeam that contains the name of
a bowling team and an array that holds the names of the four team members.
*/

public class BowlingTeam {
    //Create a field for the team name and an array that holds the team members’names.
    private String teamName;
    private String[] members = new String[4];

    //Create get and set methods for the teamName field
    public void setTeamName(String team) {
        teamName = team;
    }
    public String getTeamName() {
        return teamName;
    }

    //Add a method that sets a team member’s name.
    //The method requires a position and a name, and it uses the position as a subscript to the members array.
    public void setMember(int number, String name) {
        members[number] = name;
    }

    //Add a method that returns a team member’s name.
    //The method requires a value used as the subscript that determines which member’s name to return.
    public String getMember(int number) {
        return members[number];
    }


}