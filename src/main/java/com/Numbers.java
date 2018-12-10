package com;

import com.sun.istack.internal.logging.Logger;

import java.util.ArrayList;
import java.util.Collections;


public class Numbers {

    static Logger logger = Logger.getLogger(Number.class);

    public void getMaxNumber() {

        int value1 = ConsoleInputRead.inputAndReadDataFromConsole();
        int value2 = ConsoleInputRead.inputAndReadDataFromConsole();
        int value3 = ConsoleInputRead.inputAndReadDataFromConsole();

        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        tempArr.add(value1);
        tempArr.add(value2);
        tempArr.add(value3);

        logger.info("Maxvalue = " +String.valueOf(Collections.max(tempArr)));
    }

    public int getMaxNumber(int var1, int var2, int var3) {
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        tempArr.add(var1);
        tempArr.add(var2);
        tempArr.add(var3);

        return Collections.max(tempArr);
    }

}







