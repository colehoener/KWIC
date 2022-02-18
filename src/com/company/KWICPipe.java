package com.company;

import java.util.Vector;

public class KWICPipe {

    //Main pipe for KWIC process. Handle all data manipulation and function calls.
    public void pipeProcess(){
        //Declare all variables and objects
        Vector<String> stopWords;
        Vector<Vector<String>> input;
        Vector<Vector<String>> keyValuePairs;
        FileWrite writer = new FileWrite();

        //1. Read input file and stop words
        input = ReadInput();
        stopWords = ReadStopWords();

        writer.ClearFile();

        //Runs pipe for each line
        for(int i = 0; i < input.size(); i++) {
            writer.PrintToFile("\n\n---Line " + (i + 1) + "---\n");

            //2. Process and shift input
            keyValuePairs = Process(input.elementAt(i), stopWords);

            //3. Alphabetize
            Alphabetize(keyValuePairs);
        }
        System.out.println("\nProcess complete. Results have been written to 'output.txt'");
    }


    public static Vector<Vector<String>> ReadInput(){
        FileReaderKWIC reader = new FileReaderKWIC();
        String fileName = reader.PromptFileName();

        return reader.ReadFile(fileName);
    }

    public static Vector<String> ReadStopWords(){
        FileReaderKWIC reader = new FileReaderKWIC();

        return reader.ReadStopWords("stopWords.txt");
    }

    public static Vector<Vector<String>> Process(Vector<String> input, Vector<String> stopWords){
        Shifter shift = new Shifter();
        FileWrite writer = new FileWrite();
        Vector<Vector<String>> keyValuePairs;
        keyValuePairs = shift.Shift(input, stopWords, writer);
        return keyValuePairs;
    }

    public static void Alphabetize(Vector<Vector<String>> keyValuePairs){
        Alphabetizer alphabetizer = new Alphabetizer();
        FileWrite writer = new FileWrite();
        alphabetizer.Alphabetize(keyValuePairs, writer);
    }

}
