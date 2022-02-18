package com.company;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class FileReaderKWIC {
    public FileReaderKWIC(){

    }

    public String PromptFileName(){
        String fileName = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPlease enter the fileName of the file you wish to process: ");
        fileName = scan.nextLine();

        return fileName;
    }

    public Vector<Vector<String>> ReadFile(String fileName){
        Vector<Vector<String>> input = new Vector<Vector<String>>();
        fileName =  "./Input/" + fileName;

        try {
            FileReader fileReader = new FileReader(fileName);


        // Convert fileReader to
        // bufferedReader
        BufferedReader buffReader = new BufferedReader(fileReader);

        while (buffReader.ready()) {
            Vector<String> line = new Vector();
            String testLine = buffReader.readLine();
            String[] test = testLine.split(" ");

            Collections.addAll(line, test);
            input.add(line);

        }

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found. Please restart the program.");
        }
        catch (IOException e) {
            System.out.println("Critical error. Please restart the program.");
        }

        return input;
    }

    public Vector<String> ReadStopWords(String fileName){
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
