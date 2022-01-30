package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public FileWrite(){

    }

    public void PrintToFile(String output){
        String fileName = "./Output/output.txt";
        try {
            FileWriter fileWriteObj = new FileWriter(fileName , true);
            BufferedWriter writer = new BufferedWriter(fileWriteObj);
            writer.append(" ");
            writer.append(output);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ClearFile() {
        String fileName = "./Output/output.txt";
        try {
            FileWriter fileWriteObj = new FileWriter(fileName , false);
            PrintWriter pwOb = new PrintWriter(fileWriteObj, false);
            pwOb.flush();
            pwOb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
