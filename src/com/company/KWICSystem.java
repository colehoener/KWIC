package com.company;

import java.util.Scanner;
import java.util.Vector;

public class KWICSystem {

    public static void main(String[] args) {
        Vector<String> stopWords = new Vector();
        Vector<String> input = new Vector();
        Vector<Vector<String>> keyValuePairs = new Vector<Vector<String>>();

        System.out.println("Welcome to the KWIC system.");

        input = Read();
        System.out.println(input);

        FileWrite write = new FileWrite();
        for (Integer i = 0; i < input.size(); i++)
        {
            write.PrintToFile(input.get(i));
        }

    }

    public static Vector<String> Read(){
        FileReader reader = new FileReader();
        String fileName = reader.PromptFileName();

        return reader.ReadFile(fileName);
    }

    public static Vector<Vector<String>> Process(){
        Vector<Vector<String>> keyValuePair = new Vector<Vector<String>>();


        return keyValuePair;
    }
}
