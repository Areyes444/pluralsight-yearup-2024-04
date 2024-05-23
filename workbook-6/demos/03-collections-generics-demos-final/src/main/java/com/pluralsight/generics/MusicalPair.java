package com.pluralsight.generics;

public class MusicalPair<T extends Musician> extends Pair<T>
{
    public MusicalPair(T left, T right)
    {
        super(left, right);
    }

    public void perform()
    {
        T left = getLeftThing();
        T right = getRightThing();

        left.perform();
        right.perform();
    }
}
