package objectmethods.liskovviolation;

public class Test {

    public static void main(String[] args) {

        CounterPoint counterPoint = new CounterPoint(1, 0);
        System.out.println(Point.onUnitCircle(counterPoint));

    }

}
