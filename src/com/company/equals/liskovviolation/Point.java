package com.company.equals.liskovviolation;

import java.util.Set;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static final Set<com.company.equals.liskovviolation.Point> unitCircle = Set.of(
            new com.company.equals.liskovviolation.Point( 1, 0), new com.company.equals.liskovviolation.Point( 0, 1),
            new com.company.equals.liskovviolation.Point(-1, 0), new com.company.equals.liskovviolation.Point( 0, -1));

    public static boolean onUnitCircle(com.company.equals.liskovviolation.Point p) {
        return unitCircle.contains(p);
    }

    // Broken - violates Liskov substitution principle (page 43)
    @Override public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()){
            return false;
        }
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}
