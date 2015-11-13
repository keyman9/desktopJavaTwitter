package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Fileio {
    private static String fileName;
    static String[] input;

    public void fileReader() {
        ArrayList<String[]> list = new ArrayList<String[]>();
        try {
            File fileName = new File("Inventory-1.txt");//Create a new file
            Scanner scan = new Scanner(fileName);       //Create a Scanner object (Throws FileNotFoundException)
            if (scan.hasNext())                         //Check to make sure that there is actually something in the file.
            {
                do {
                    String line = scan.nextLine();      //Read the line of data
                    input = line.split(" ");            //This reads each line one part at a time
                    list.add(input);                    //Each line is iterated as the list is iterated
                    //System.out.println("YAY2");
                    //System.out.print(input[0]+" ");
                    //System.out.print(input[1]+" ");     //These are example print statements
                    //System.out.print(input[2]+" ");
                    //System.out.print(input[3]+" ");
                    System.out.println("");
                    if (input[0].contains("Oranges")){
                        System.out.println("Yay, Oranges");
                    }

                } while (scan.hasNext());
            }
            FileReader fileReader =
                    new FileReader(fileName);
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
    }
}