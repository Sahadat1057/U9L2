public class Soccer extends Sport{
    private int goals;

    public Soccer(int d, int n, int g){
        super(d, n);
        this.goals = g;
    }

    public String goal() {
        return "GOALLLLLLL!";
    }
}
