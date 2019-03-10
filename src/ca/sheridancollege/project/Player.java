/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public abstract class Player 
{
    private String playerID; //the unique ID for this player
    protected String Samandeep;
    protected String HaNguyen;
    private int date; 
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String Samandeep, String HaNguyen, int date)
    {
       this.Samandeep = Samandeep;
       this.HaNguyen = HaNguyen;
       this.date = date;
    }
    public String getSamandeep(){
        return samandeep;
    }
    public void setSamandeep(String samandeep){
        this.Samandeep = samandeep;
    }
    public string getHaNguyen(){
        return HaNguyen;
    }
    public void setHaNguyen(String HaNguyen){
        this.HaNguyen = HaNguyen;
    }
    /**
     * @return the playerID
     */
    public  int getDate() 
    {
        return date;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setDate(int date) 
    {
        this.date = date;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
