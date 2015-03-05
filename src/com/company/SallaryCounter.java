package com.company;

import java.util.*;

/**
 * Created by ada on 04.03.15.
 */
public class SallaryCounter {

    private List<String> linesList = null;
    private List<List<String>> parsedData = new ArrayList<>();
    private float sum = 0;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public SallaryCounter(List<String> linesList) {
        this.linesList = linesList;
        attributeMapper();
        calculate();

    }


    public void setParsedData(List<List<String>> parsedData) {
        this.parsedData = parsedData;
    }

    private void attributeMapper() {


        for (String lines : linesList) {

            for (String retval : lines.split("@")) {
                List<String> pair = new ArrayList<>();
                for (String kv : retval.split(":")) {
//                    System.out.println(kv);

                    if (kv != null && !kv.isEmpty()) {
                        pair.add(kv.replace(",", "."));
                        parsedData.add(pair);
                    }

                }
            }
        }
        setParsedData(parsedData);
    }

    private void calculate() {

        for (List<String> al : parsedData) {
//        System.out.println(al.get(0) + " : " + al.get(1));
            if (al.get(0).contains("amount")) {


            float value = Float.valueOf(al.get(1).substring(0, al.get(1).length() - 3));
            sum = sum + value;
            }

        }

        setSum(sum);
    }
}


