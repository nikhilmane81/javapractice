package com.nikhil.collection;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProblem
{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;++i)
        {
            list.add(sc.nextInt());
        }
        int iteration = sc.nextInt();
        for(int i=0;i<iteration;++i)
        {
            String s = sc.next();
            switch (s) {
                case "Insert" -> {
                    int index = sc.nextInt();
                    int element = sc.nextInt();
                    list.add(index, element);
                }
                case "Delete" -> {
                    int delindex = sc.nextInt();
                    list.remove(delindex);
                }
            }
        }

        for(Integer ele: list)
            System.out.print(ele+" ");


    }
}
