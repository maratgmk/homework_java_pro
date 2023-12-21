package homework_java_pro.snackautomat;

public class Coin {
    private final int nominal;

    public Coin(int nominal) {
        this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                '}';
    }
}


