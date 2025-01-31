public class Result {

    //Properties
    int wins;
    int losses;
    int ties;
    Results results;

    //Constructors
    
    public Result() {
    }
    //Methods
    public void addWin() {
        wins++;
    }
    public void addLoss() {
        losses++;
    }
    public void addTie() {
        ties++;
    }
}
