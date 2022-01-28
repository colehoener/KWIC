package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public FileWrite(){

    }

    public void PrintToFile(String output){
        String fileName = "./Output/output.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName , true));
            writer.append(" ");
            writer.append(output);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
