package BasePackage;

/**
 *
 * @author Minh Nguyen
 */
public abstract class Score {
   
    private double playerScore; 
    
    public Score(double score)
    {
        playerScore= score;
    }
    public double getPlayerScore() 
    {
        return playerScore;
    }

    public void setPlayerID(double outcome) 
    {
        playerScore += outcome;
    }
    
}

