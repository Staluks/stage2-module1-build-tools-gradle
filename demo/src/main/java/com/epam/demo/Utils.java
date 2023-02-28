package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean ok = true;
        for(String i : args){
            if(Integer.parseInt(i)<0){
                ok = false;
            }
        }
        return ok;
    }
}