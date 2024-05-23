package com.pluralsight.generics;

public class Pair<T>
{
    private T left;
    private T right;

    public Pair(T left, T right)
    {
        this.left = left;
        this.right = right;
    }

    public T getLeftThing()
    {
        return left;
    }

    public T getRightThing()
    {
        return right;
    }

    public void swap()
    {
        T temp = left;
        left = right;
        right = temp;
    }

}
