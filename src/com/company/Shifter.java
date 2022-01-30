package com.company;

import java.util.Vector;

public class Shifter {
    public Shifter(){

    }

    public Vector<Vector<String>> Shift(Vector<String> input, Vector<String> stopWords){
        Vector<Vector<String>> keyValuePair = new Vector<Vector<String>>();
        FileWrite writer = new FileWrite();
        String key = "";
        String value = "";
        Vector<String> tempKeyValue = new Vector<String>();

        //Setup file
        writer.ClearFile();
        writer.PrintToFile("\t\tInitial Output");

        //Loop through entire input to shift
        for(int i = 0; i < input.size(); i++){
            //If word is not a stop word, mark it as a value
            if(!(stopWords.contains((input.elementAt(i)).toLowerCase()))){
                //Define key and print to file
                writer.PrintToFile("\n\nKey: ");
                for(int j = 0; j < i; j++){
                    writer.PrintToFile(input.elementAt(j));
                    key = key.concat(input.elementAt(j) + " ");
                }

                //Define value and print to file
                writer.PrintToFile("\nValue: ");
                for(int j = i; j < input.size(); j++){
                    writer.PrintToFile(input.elementAt(j));
                    value = value.concat(input.elementAt(j) + " ");
                }

                //Add key value pair to vector
                tempKeyValue.add(key);
                tempKeyValue.add(value);
                keyValuePair.add(tempKeyValue);
                //Reset key and value placeholders
                key = "";
                value = "";
                tempKeyValue = new Vector<String>();


            }
        }

        return keyValuePair;
    }
}
