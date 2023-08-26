package com.nikhil.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TobeSerialized implements Serializable
{
    public int id;
    public String name;

    public transient int roll;
    TobeSerialized(int id, String name, int roll)
    {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }
    TobeSerialized(){};

    public static void main(String[] args) {

        TobeSerialized obj = new TobeSerialized(1,"Nikhil", 12);
        String filname = "file.ser";

        try {
            FileOutputStream fo = new FileOutputStream(filname);
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(obj);
            out.close();
            fo.close();
            System.out.println("Serialization done");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
