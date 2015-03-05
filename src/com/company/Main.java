package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) {
	// write your code here
        String path = "C:\\Users\\ada\\IdeaProjects\\SallaryCounter\\plik_z_danymi.txt";
        System.out.print("Enter your file path: ");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        try {
            path = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your path!");
            System.exit(1);
        }

        System.out.println(path);
        Reader reader = new Reader(path);

        reader.getLinesList();

        SallaryCounter sc = new SallaryCounter( reader.getLinesList());


        System.out.println("Sum amount of sallary in your file is:  ");
        System.out.print(sc.getSum());
    }
}
