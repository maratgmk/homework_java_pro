package homework_java_pro.snackautomat;

public class Pair {
    private Snack snack;
    private Coin coin;

    public Pair(Snack snack, Coin coin) {
        this.snack = snack;
        this.coin = coin;
    }

    public Snack getSnack() {
        return snack;
    }

    public Coin getCoin() {
        return coin;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "snack=" + snack +
                ", coin=" + coin +
                '}';
    }
}
