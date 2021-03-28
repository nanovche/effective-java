package objectmethods.transitivity.wrong;

import objectmethods.transitivity.Point;

import java.awt.*;

public class Test {

    public static void main(String[] args) {

        objectmethods.transitivity.Point p = new objectmethods.transitivity.Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        //violation of symmetry
        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));

        //violation of transitivity
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        objectmethods.transitivity.Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        //symmetry works
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

        //transitivity doesn't
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));

        //infinite recursion with another subclass
        ClickablePoint clickablePoint = new ClickablePoint(1, 2, true);
        ColorPoint colorPoint = new ColorPoint(1, 2 , Color.BLUE);
        System.out.println(clickablePoint.equals(colorPoint));


    }
}
