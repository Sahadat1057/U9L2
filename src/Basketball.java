public class Basketball extends Sport {
    private int amountofThrees;
    public Basketball(int d, int n, int a) {
        super(d, n);
        this.amountofThrees = a;
    }

    public String scoreThree() {
        return "I've scored a three!!";
    }
}
