public class Sport {
    private int duration;
    private int numPlayers;

    public Sport(int d, int numPlayers){
        this.duration = d;
        this.numPlayers = numPlayers;
    }

    public String haveFun() {
        return "This sport is so fun!";
    }
}
