package methods.emptycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empty {

    public static void main(String[] args) {

        Cheese c = new Cheese(new ArrayList<>());
        for (Cheese ch: c.getCheeses()) {
            System.out.println(ch);
        }
    }
}

class Cheese{

    private final List<Cheese> cheeseInStock;
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public Cheese(List<Cheese> cheeseInStock) {
        this.cheeseInStock = cheeseInStock;
    }

    //return empty collections
/*    public List<Cheese> getCheeses() {
        return new ArrayList<>(cheeseInStock);
    }*/

    //optimized
    public List<Cheese> getCheeses() {
        return cheeseInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheeseInStock);
    }

    /*public Cheese[] getCheeses() {
        return cheeseInStock.toArray(new Cheese[0]);
    }*/

    /*public Cheese[] getCheeses() {
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }*/

}
