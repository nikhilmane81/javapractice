package com.nikhil.Test;
/*
Given a sentence with numbers representing a word's location embedded within each word, return the sorted sentence.
Note: We are using a maximum of 0 - 9 numbers only for 1 sentence
Test Cases:
Rearrange ("is1 Thi0s T3est 2a") ➞ This is a Test
Rearrange ("t2o j3oin 4WonderBiz I0 Technolog5ies wan1t") ➞ I want to join WonderBiz Technologies
 */
public class StringProblem
{
    static String func(String str)
    {
        String [] arr = str.split(" ");
        int size = arr.length;
        String [] finalstr = new String[size];
        for(int i=0;i< arr.length;++i)
        {
            for(int j=0;j<arr[i].length();++j)
            {
                if(Character.isDigit(arr[i].charAt(j)))
                {
                    int index = (arr[i].charAt(j))-('0');
                    arr[i] = arr[i].replaceAll("[^a-zA-Z]", "");
                    finalstr[index] =arr[i];
                }
            }
        }
        String finalstr1 ="";

        for(String ele : finalstr)
        {
            finalstr1 +=  ele+" ";
        }
        return  finalstr1;
        //return Arrays.toString(finalstr);
    }

    public static void main(String[] args) {
        String Test1 = "is1 Thi0s T3est 2a";
        String Test2 = "t2o j3oin 4WonderBiz I0 Technolog5ies wan1t";
        System.out.println(func(Test1));
        System.out.println(func(Test2));
    }
}
