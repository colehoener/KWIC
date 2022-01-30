package com.company;

import java.util.Collections;
import java.util.Locale;
import java.util.Vector;

public class Alphabetizer {
    public Alphabetizer(){

    }

    public void Alphabetize(Vector<Vector<String>> keyValuePair){
        Vector<String> sortedAlphabetical = new Vector<String>();
        FileWrite writer = new FileWrite();

        //Sort alphabetically
        for(int i = 0; i < keyValuePair.size(); i++){
            sortedAlphabetical.add((keyValuePair.elementAt(i)).elementAt(1).toLowerCase());
        }

        Collections.sort(sortedAlphabetical);

        writer.PrintToFile("\n\n\t\tAfter Sorting in Alphabetical Order");

        //Matches alphabetical list and orginal keyvalue pairs
        for(int i = 0; i < sortedAlphabetical.size(); i++){
            for(int j = 0; j < sortedAlphabetical.size(); j++){
                if(sortedAlphabetical.elementAt(i).equals(keyValuePair.elementAt(j).elementAt(1).toLowerCase())){

                    writer.PrintToFile("\n\nKey: ");
                    writer.PrintToFile(keyValuePair.elementAt(j).elementAt(0));

                    writer.PrintToFile("\nValue: ");
                    writer.PrintToFile(keyValuePair.elementAt(j).elementAt(1));
                }
            }

        }

    }
}
