package Com;

import com.sun.istack.internal.logging.Logger;

public class DoubleNumber {

    static Logger logger = Logger.getLogger(DoubleNumber.class);

    public void getDoubleNumber() {
        int Number = ConsoleInputRead.inputAndReadDataFromConsole();

        if (Number % 7 == 0) {
           logger.info(String.valueOf(Math.abs(Number)) + String.valueOf(Math.abs(Number)));
        } else {
            logger.info("Finish");
        }

    }

    public String getDoubleNumber(int number) {

        String result = "";
        if (number % 7 == 0) {
            result = String.valueOf(Math.abs(number)) + String.valueOf(Math.abs(number));
        }
        return result;
    }
}





