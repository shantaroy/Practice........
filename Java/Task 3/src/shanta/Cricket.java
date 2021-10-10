package shanta;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;
    Cricket( String matchType, int over, Player player )
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void dispaly()
    {
        System.out.println("The match type is: "+matchType);
        System.out.println("Over of the match is: "+over);
        System.out.println("The name of the player is: "+player.playerName);
        System.out.println("Jersey number of a player is: "+player.jerseyNumber);
    }



}

         /*
               Name: Shotabdi Roy Shanta
               Id: 2012020165
               Sec: D
               Email: cse_2012020165@lus.ac.bd
               Date: 11.09.2021
                */
