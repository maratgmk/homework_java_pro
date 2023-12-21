package homework_java_pro.snackautomat;

public class Snack {
    private String snackName;
    private int snackPrice;


    public Snack(String snackName, int snackPrice) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;

    }


    public String getSnackName() {
        return snackName;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", snackPrice=" + snackPrice +
                '}';
    }


}
