package objectmethods.transitivity.wrong;

import objectmethods.transitivity.Point;

import java.awt.*;

public class ColorPoint extends objectmethods.transitivity.Point {

    private final Color color;
    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates symmetry!
/*    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }*/

    // Broken - violates transitivity!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
// If o is a normal Point, do a color-blind comparison
        if (!(o instanceof ColorPoint))
            return o.equals(this);
// o is a ColorPoint; do a full comparison
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    // Remainder omitted
}