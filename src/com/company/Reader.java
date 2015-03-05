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


    private String path = null;
    private List<String> linesList = new ArrayList<>();

    public Reader(String path) {

        this.path = path;
        readFile();
    }

    public List<String> getLinesList() {
        return linesList;
    }

    public void setLinesList(List<String> linesList) {
        this.linesList = linesList;
    }

    private void readFile(){

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
