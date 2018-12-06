package Com;


import com.sun.istack.internal.logging.Logger;

import java.util.Scanner;

public class ConsoleInputRead {

    static Logger logger = Logger.getLogger(ConsoleInputRead.class);
    public static int inputAndReadDataFromConsole() {

        Scanner scanner = new Scanner(System.in);
      logger.info(" input data:  ");
        return scanner.nextInt();
    }


}
