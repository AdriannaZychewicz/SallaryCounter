package com.company;

import java.util.List;
import java.util.Map;

/**
 * Created by ada on 04.03.15.
 */
public class SallaryCounter {

    private List<String> linesList = null;
    private Map<String, String> atribute = null;
    public SallaryCounter(List<String> linesList) {
        this.linesList = linesList;

    }

    public void attributeMapper(){

        int i = 0;
        for(String lines : linesList){

            for(String retval : lines.split("@")) {
                for(String kv : retval.split(":")) {
//                    atribute.put(kv[i], kv(i+1) );
                    System.out.println(kv);
                }
            }
        }


    }

}