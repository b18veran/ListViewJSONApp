package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;
    private String company;
    private String auxdata;

    public Mountain()
    {
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
        company="Saknar sport";
        auxdata="Saknar information";
    }

    public Mountain(String n, String l, int h, String s, String a)
    {
        name=n;
        location=l;
        height=h;
        company=s;
        auxdata=a;
    }
    public String info()
    {
        String tmp=new String();
        tmp+="Name: " + name+"\n"+"Location: "+ location+"\n"+ "Year of birth: "+ height+"\n"+ "Sport: "+ company+"\n"+ "Info: "+ auxdata;
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
    public String getCompany()
    {
        return company;
    }

    @Override
    public String toString(){
        return name;
    }


}

