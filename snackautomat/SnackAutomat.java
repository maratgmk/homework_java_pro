package homework_java_pro.snackautomat;

import java.util.Arrays;

/*Создайте класс или перечисление Монета. Монета должна хранить номинал.
Создайте класс Снек (перекус),
который хранит название снека и его стоимость (предположим, что стоимость снека всегда составляет одну монету).
Создайте класс «Снека-автомат». При создании автомата укажите, сколько снеков он может хранить.
Создайте метод добавления снеков в автомат. Создайте метод,
который принимает монетку и название снека, а возвращает объект снек.
 */
public class SnackAutomat {

    private Snack[] cells;


    public SnackAutomat(int snackQuantity) {

        this.cells = new Snack[snackQuantity];
    }

    public boolean loadSnack(Snack snack) {
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == null) {
                cells[i] = snack;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SnackAutomat{" +
                "cells=" + Arrays.toString(cells) +
                '}';
    }

    public Pair buySnack(Coin coin, int index) {
        if (index < 0 || index >= cells.length) {
            System.out.printf("Указан неправильный номер ячейки %d \n", index);
            return new Pair(null, coin);
        }
        Snack snack = cells[index];
        if (snack == null) {
            System.out.printf("Ячейка с указанным %d пуста\n", index);
            return new Pair(null, coin);
        }
        if(coin.getNominal() < snack.getSnackPrice()){
            System.out.println("Недостаточно средств для покупки");
            return new Pair(null, coin);
        }
        Coin change = coin.getNominal() - snack.getSnackPrice() == 0? null: new Coin(coin.getNominal() - snack.getSnackPrice());
        cells[index] = null;
        return new Pair(snack,change);

    }
}
