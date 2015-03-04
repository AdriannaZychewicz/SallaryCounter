package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ada on 04.03.15.
 */
public class Reader {


    private String path = "/home/ada/Downloads/plik_z_danymi(1).txt";
    private List<String> linesList = new ArrayList<>();


    public List<String> getLinesList() {
        return linesList;
    }

    public void setLinesList(List<String> linesList) {
        this.linesList = linesList;
    }

    public void readFile(){

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {


                if(sCurrentLine != null && !sCurrentLine.isEmpty()) {
                    linesList.add(sCurrentLine);
                    setLinesList(linesList);


                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
