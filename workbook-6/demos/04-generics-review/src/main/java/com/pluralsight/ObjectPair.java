package com.pluralsight;

public class ObjectPair
{
    private Object key;
    private Object value;

    public ObjectPair(Object key, Object value)
    {
        this.key = key;
        this.value = value;
    }

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }
}
