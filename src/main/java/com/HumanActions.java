package com;


import com.sun.istack.internal.logging.Logger;

public class HumanActions {
    static Logger logger = Logger.getLogger(Number.class);

    private void checkCurrentActionDependOnHourOfDay() {
        int time;
        logger.info("Please input Hours 0-24: ");
        time = ConsoleInputRead.inputAndReadDataFromConsole();
        if (time < 0 || time > 24) {
            logger.info("Wrong number");
        } else if (time >= 9 && time <= 18) {
            logger.info("I'm working");
        } else if (time < 8 || time > 18) {
            logger.info("I'm relaxing");
        }
    }

    public String checkCurrentActionDependOnHourOfDay(int time) {

        String action = "";

        if (time < 0 || time > 24) {
            action = "Wrong number";
        } else if (time >= 9 && time <= 18) {
            action = "I'm working";
        } else if (time < 8 || time > 18) {
            action = "I'm relaxing";
        }
        return action;
    }


}




