package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here

        Reader reader = new Reader();
        reader.readFile();
        reader.getLinesList();

        SallaryCounter sc = new SallaryCounter( reader.getLinesList());

        sc.attributeMapper();

    }
}
