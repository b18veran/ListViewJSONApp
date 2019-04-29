package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain()
    {
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
    }

    public Mountain(String n, String l, int h)
    {
        name=n;
        location=l;
        height=h;
    }
    public String info()
    {
        String tmp=new String();
        tmp+="Name " + name+"\n"+"Location "+ location+"\n"+ "Height "+ height;
        return tmp;
    }
    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }
    public String getLocation()
    {
        return location;
    }
    public int getHeight()
    {
        return height;
    }

    @Override
    public String toString(){
        return name;
    }


}

