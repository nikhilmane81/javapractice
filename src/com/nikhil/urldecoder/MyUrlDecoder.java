package com.nikhil.urldecoder;

import java.io.*;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class MyUrlDecoder {

    public static void main(String[] args) {
        String filePath = null;
       try {
            filePath = args[0];
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Empty file path");
       }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null)
            {
                String decodeLine = URLDecoder.decode(line, StandardCharsets.UTF_8);
                content.append(decodeLine).append(System.lineSeparator());
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("File decoded !");
        }
        catch (IOException | NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
