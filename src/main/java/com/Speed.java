package com;

import org.apache.log4j.Logger;

public class Speed {
 final   static Logger logger = Logger.getLogger(Speed.class);

    private double SpeedKmPerHour = 0;
    private double SpeedMetersPerSecond = 0;

    public double getSpeedKmPerHour() {
        return SpeedKmPerHour;
    }
    public void setSpeedKmPerHour(double speedKmPerHour) {
        this.SpeedKmPerHour = speedKmPerHour;
    }
    public double getSpeedMetersPerSecond() {
        return SpeedMetersPerSecond;
    }
    public void setSpeedMetersPerSecond(double speedMetersPerSecond) {
        this.SpeedMetersPerSecond = speedMetersPerSecond;
    }

    public void compareDifferentSpeedsAndOutputBigger() {
        int i = 0;
        String unit = "";
        double MaxValue=0;

        logger.info("Speed KM/h ");
        setSpeedKmPerHour(ConsoleInputRead.inputAndReadDataFromConsole());
        logger.info("Speed M/s ");
        setSpeedMetersPerSecond(ConsoleInputRead.inputAndReadDataFromConsole());
        double SpeedTrasnsform = SpeedKmPerHour * 0.27777777;

        if (SpeedKmPerHour < 0 || SpeedMetersPerSecond < 0) {
           logger.info("Speed can;t be less 0");

        } else if (SpeedTrasnsform < SpeedMetersPerSecond) {
            MaxValue = SpeedMetersPerSecond;
            i = 1;

        } else {
            MaxValue = SpeedKmPerHour;
            i = 2;
        }

        switch (i) {
            case 1:
                unit = " Km/h";
                break;
            case 2:
                unit = " M/h";
                break;
        }
        logger.info("Max Speed = " + MaxValue + unit);

    }


    public double compareDifferentSpeedsAndOutputBigger(int SpeedKmPerHour, int SpeedMetersPerSecond) {

        double SpeedTrsnsform = SpeedKmPerHour * 0.27777777;
        double MaxValue = 0;

        if (SpeedKmPerHour < 0 || SpeedMetersPerSecond < 0) {
            logger.info("Speed can;t be less 0");
        } else if (SpeedTrsnsform < SpeedMetersPerSecond) {
            MaxValue = SpeedMetersPerSecond;
            logger.info(MaxValue);
        } else {
            MaxValue = SpeedKmPerHour;
            logger.info(MaxValue);
        }
        return MaxValue;

    }
}
