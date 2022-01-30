package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class FileReader {
    public FileReader(){

    }

    public String PromptFileName(){
        String fileName = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPlease enter the fileName of the file you wish to process: ");
        fileName = scan.nextLine();

        return fileName;
    }

    public Vector<String> ReadFile(String fileName){
        Vector input = new Vector();
        fileName =  "./Input/" + fileName;

        try (java.io.FileReader f = new java.io.FileReader(fileName)) {
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == ' ') {
                    String text = sb.toString().trim();
                    input.add(text);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                String correct = sb.toString().trim();

                input.add(correct);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please restart the program.");
        } catch (IOException e) {
            System.out.println("Critical error. Please restart the program.");
        }

        return input;
    }

}
