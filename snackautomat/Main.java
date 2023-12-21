package homework_java_pro.snackautomat;  /*Создайте класс или перечисление Монета. Монета должна хранить номинал.
Создайте класс Снек (перекус),
который хранит название снека и его стоимость (предположим, что стоимость снека всегда составляет одну монету).
Создайте класс «Снека-автомат». При создании автомата укажите, сколько снеков он может хранить.
Создайте метод добавления снеков в автомат. Создайте метод,
который принимает монетку и название снека, а возвращает объект снек.
 */

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(3);
        System.out.println(coin1.getNominal());
        Snack[] snacks = {
                new Snack("Burger", 5),
                new Snack("Burger1", 3),
//                new Snack("Burger2", 2),
//                new Snack("Burger3", 4),
                new Snack("Burger4", 6),
                new Snack("Burger5", 7)

        };

        SnackAutomat snackAutomat = new SnackAutomat(5);
        int index = 0;
        boolean isLoaded;
       do{
           isLoaded = snackAutomat.loadSnack(snacks[index]);
           if (isLoaded)index++;
           if(index >= snacks.length)break;

       } while (isLoaded) ;
        System.out.println(snackAutomat);
        System.out.println(snackAutomat.buySnack(new Coin(3),6));
        System.out.println(snackAutomat);
        System.out.println(snackAutomat.buySnack(new Coin(3),0));
        System.out.println(snackAutomat);
        System.out.println(snackAutomat.buySnack(new Coin(3),4));
        System.out.println(snackAutomat);
        System.out.println(snackAutomat.buySnack(new Coin(3),1));
        System.out.println(snackAutomat);
        System.out.println(snackAutomat.buySnack(new Coin(3),1));
        System.out.println(snackAutomat);
        System.out.println(snackAutomat.buySnack(new Coin(7),0));
        System.out.println(snackAutomat);
        Coin coin = new Coin(15);
        System.out.println(coin.getNominal());
        System.out.println(coin);
        Snack snack = new Snack("Cheeseburger", 8);
        System.out.println(snack);
        System.out.println(snack.getSnackPrice());
        System.out.println(snack.getSnackName());
        Pair pair = new Pair(new Snack("Cola", 2),new Coin(3));
        System.out.println(pair);
        System.out.println(pair.getCoin());
        System.out.println(pair.getSnack());


    }
}