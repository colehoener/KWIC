package com.company;

import java.util.Scanner;
import java.util.Vector;

public class KWICSystem {

    public static void main(String[] args) {
        //Declare all variables and objects
        Vector<String> stopWords = new Vector();
        Vector<String> input = new Vector();
        Vector<Vector<String>> keyValuePairs = new Vector<Vector<String>>();

        System.out.println("Welcome to the KWIC system.");

        //1. Read input file and stop words
        input = ReadInput();
        stopWords = ReadStopWords();

        //2. Process and shift input
        keyValuePairs = Process(input, stopWords);

        //3. Alphabetize
        Alphabetize(keyValuePairs);

        System.out.println("\nProcess complete. Results have been written to 'output.txt'");

    }

    public static Vector<String> ReadInput(){
        FileReader reader = new FileReader();
        String fileName = reader.PromptFileName();

        return reader.ReadFile(fileName);
    }

    public static Vector<String> ReadStopWords(){
        FileReader reader = new FileReader();

        return reader.ReadFile("stopWords.txt");
    }

    public static Vector<Vector<String>> Process(Vector<String> input, Vector<String> stopWords){
        Shifter shift = new Shifter();
        Vector<Vector<String>> keyValuePairs = new Vector<Vector<String>>();
        keyValuePairs = shift.Shift(input, stopWords);
        return keyValuePairs;
    }

    public static void Alphabetize(Vector<Vector<String>> keyValuePairs){
        Alphabetizer alphabetizer = new Alphabetizer();

        alphabetizer.Alphabetize(keyValuePairs);
    }
}
