package com;


import org.apache.log4j.Logger;

public class Triangle {
    final static Logger logger = Logger.getLogger(Triangle.class);

    public void isRightAngledTriangle() {


        int SideA = ConsoleInputRead.inputAndReadDataFromConsole();
        int SideB = ConsoleInputRead.inputAndReadDataFromConsole();
        int SideC = ConsoleInputRead.inputAndReadDataFromConsole();

        if ((isLengthOfSidesMoreZero(SideA, SideB, SideC)) &&
                isTriangleExsist(SideA, SideB, SideC)) {
            if ((Math.pow(SideA, 2) == Math.pow(SideB, 2) + Math.pow(SideC, 2)) ||
                    (Math.pow(SideB, 2) == Math.pow(SideC, 2) + Math.pow(SideA, 2)) ||
                    (Math.pow(SideC, 2) == Math.pow(SideB, 2) + Math.pow(SideA, 2))) {
                logger.info("Triangle is right angled");
            } else {
                logger.info("Triangle is not right angled");
            }
        }
    }


    public boolean isLengthOfSidesMoreZero(double lengthA, double lengthB, double lengthC) {
        boolean length;
        if (lengthA > 0 && lengthB > 0 && lengthC > 0) {
            length = true;
        }else{
            length = false;
            logger.info("Length zero or less than zero");
        }
        return length;
    }

    public boolean isTriangleExsist(double lengthA, double lengthB, double lengthC) {
        boolean existingTriangle;
        if ((lengthA >= lengthB + lengthC) ||
                (lengthC >= lengthA + lengthB) ||
                (lengthB >= lengthA + lengthC)) {
            existingTriangle = false;
            logger.info("Triangle doesn't exist");
        } else {
            existingTriangle = true;
        }
        return existingTriangle;
    }


    public boolean isRightAngledTriangle(double SideA, double SideB, double SideC) {

        boolean typeOfTriangle=false;
        if ((isLengthOfSidesMoreZero(SideA, SideB, SideC)) &&
                isTriangleExsist(SideA, SideB, SideC)) {
            if ((Math.pow(SideA, 2) == Math.pow(SideB, 2) + Math.pow(SideC, 2)) ||
                    (Math.pow(SideB, 2) == Math.pow(SideC, 2) + Math.pow(SideA, 2)) ||
                    (Math.pow(SideC, 2) == Math.pow(SideB, 2) + Math.pow(SideA, 2))) {
                typeOfTriangle=true;
                logger.info("Triangle is right angled");
            } else {
                typeOfTriangle=false;
                logger.info("Triangle is not right angled");
            }
        }
     return typeOfTriangle;
    }
}
