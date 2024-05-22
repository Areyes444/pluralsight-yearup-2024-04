package com.pluralsight.models.interfaces;

import com.pluralsight.models.Point;

public interface Movable
{
    Point move(int x, int y);
    void moveTo(Point point);
    void goHome();
}
