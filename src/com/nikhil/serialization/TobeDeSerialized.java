package com.nikhil.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TobeDeSerialized
{

    public static void main(String[] args) {
        TobeSerialized object = null;

        try {
            FileInputStream fi = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(fi);

            object = (TobeSerialized) in.readObject();
            in.close();
            fi.close();
            System.out.println(object.id+" "+object.name+" "+object.roll);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
