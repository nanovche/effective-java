package com.company.equals.transitivity.wrong;

import com.company.equals.transitivity.Point;

public class ClickablePoint extends Point {

    private boolean clickable;

    public ClickablePoint(int x, int y, boolean clickable) {
        super(x, y);
        this.clickable = clickable;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        if (!(o instanceof ClickablePoint))
            return o.equals(this);

        return super.equals(o) && ((ClickablePoint) o).clickable == clickable;

    }
}
