package j1.s.p0011;



/**
 * This class have role control any method about choice which number you want to
 * convert, the method present how number base convert.
 *
 * @author HUNG
 * @version 9/10/2023
 */
public class Manager {
    
    /**
     * Method menu that display for user choosing choice from step main
     *
     */
    public static int menu() {

        //display menu
        System.out.println(Resource.MENU_CHOICE1);
        System.out.println(Resource.MENU_CHOICE2);
        System.out.println(Resource.MENU_CHOICE3);
        System.out.println(Resource.MENU_CHOICE4);

//initialized choice and checking 
        int choice = Validate.checkInputLimit(1, 4);
        return choice;
    }

    /**
     *
     * Medial step that display what the number base you want to convert to from
     * step1.
     *
     * @param from : which number base choose started
     * @param case1 : the first number base that convert to
     * @param case2 : the second number base that convert to
     */
    public static int display(String from, String case1, String case2) {

        // display what choice that you want to convert
        System.out.printf(Resource.LINE_CONVERT, from, case1);
        System.out.println();
        System.out.printf(Resource.LINE_CONVERT2, from, case2);
        System.out.println();
        System.out.printf(Resource.LINE_CONVERT3, from, from);
        System.out.println();

        //initialized choice and checking 
        int choice = Validate.checkInputLimit(1, 3);
        return choice;

    }

    /**
     *
     * this method display what the number base you want to convert to from
     * binary.
     *
     * @param choice: itinialized and return to get choice convert numberbase
     */
    public static void convertFromBina() {

        //linked to display
        int choice = display(Resource.BINA, Resource.DEC, Resource.HEX);

        //printf from choice
        switch (choice) {
            case 1:

                //binary to decimal
                System.out.printf(Resource.DEC_CONVERT, convertFromBinaToDeci());
                System.out.println();

                break;
            case 2:

                //binary to hexa
                System.out.printf(Resource.HEX_CONVERT, convertFromBinaToHexa());

                System.out.println();
                break;
            case 3:

                // binary to binary
                System.out.printf(Resource.BIN_CONVERT, convertFromBinaToBina());

                System.out.println();
                break;
        }

    }

    /**
     *
     * this method display what the number base you want to convert to from
     * decimal.
     *
     * @param choice: itinialized and return to get choice convert numberbase
     */
    public static void convertFromDeci() {

        //linked to display
        int choice = display(Resource.DEC, Resource.BINA, Resource.HEX);

        //printf from choice
        switch (choice) {
            case 1:

                // decimal to binary
                System.out.printf(Resource.BIN_CONVERT, convertFromDeciToBina());

                System.out.println();
                break;
            case 2:

                //decimal to hexa
                System.out.printf(Resource.HEX_CONVERT, convertFromDeciToHexa());
                System.out.println();
                break;
            case 3:

                //decimal to decimal
                System.out.printf(Resource.DEC_CONVERT, convertFromDeciToDeci());
                System.out.println();
                break;
        }
    }

    /**
     * this method display what the number base you want to convert to from
     * hexa.
     *
     * @param choice: itinialized and return to get choice convert numberbase
     */
    public static void convertFromHexa() {

        //linked to display
        int choice = display(Resource.HEX, Resource.BINA, Resource.DEC);

        //printf from choice
        switch (choice) {
            case 1:

                //hexa to binary
                System.out.printf(Resource.BIN_CONVERT, convertFromHexaToBina());
                System.out.println();
                break;
            case 2:

                //hexa to decimal
                System.out.printf(Resource.DEC_CONVERT, convertFromHexaToDeci());
                System.out.println();
                break;
            case 3:

                //hexa to hexa
                System.out.printf(Resource.HEX_CONVERT, convertFromHexaToHexa());

                System.out.println();
                break;
        }
    }

    /**
     * still convert from binary to binary .
     */
    public static String convertFromBinaToBina() {
        String binary = Validate.checkBina();

        return binary;
    }

    /**
     * still convert from decimal to decimal.
     */
    public static String convertFromDeciToDeci() {
        String decimal = Validate.checkDeci();

        return decimal;
    }

    /**
     * still convert from hexa to hexa .
     */
    public static String convertFromHexaToHexa() {
        String hexa = Validate.checkHexa();
        return hexa;
    }

    /**
     * this method display how to convert from binary to decimal
     *
     * @param Bina: itinialized variable convert to decimal
     * @return decimal : final result to user want to get
     */
    public static int convertFromBinaToDeci() {

        //itinialized  binary
        String binary = Validate.checkBina();

        //itinialized  decimal
        int decimal = 0;

        binary = binary.toUpperCase();

        System.out.printf(Resource.START_BINATODEC, binary);

        // present how to convert from binary to decimal
        for (int i = 0; i < binary.length(); i++) {
            decimal += Resource.LINE_HEX.indexOf(binary.charAt(i)) * Math.pow(2, binary.length() - 1 - i);

        }

        //return result
        return decimal;
    }

    /**
     * this method display how to convert from hexa to decimal
     *
     * @param Hexa: itinialized variable convert to dicimal
     * @return decimal : final result to user want to get
     */
    public static int convertFromHexaToDeci() {

        //itinialized  hexa
        String Hexa = Validate.checkHexa();

       //itinialized  decimal
        int decimal = 0;
        System.out.printf(Resource.START_HEXTODEC, Hexa);
        System.out.println("");
        Hexa = Hexa.toUpperCase();

        // present how to convert from hexa to decimal
        for (int i = 0; i < Hexa.length(); i++) {
            decimal += Resource.LINE_HEX.indexOf(Hexa.charAt(i)) * Math.pow(16, Hexa.length() - 1 - i);

        }

        //return result
        return decimal;
    }

    /**
     * this method display how to convert from binary to hexa
     *
     * @param binary: itinialized first variable convert to decimal
     * @param decimal: itinialized medical variable convert to hexa
     * @return hexa : final result to user want to get
     */
    public static String convertFromBinaToHexa() {
        
         //itinialized  binary
        String binary = Validate.checkBina();
      
        //itinialized  decimal
        int decimal = 0;

        binary = binary.toUpperCase();

        // present how to convert from binary to decimal
        for (int i = 0; i < binary.length(); i++) {
            decimal += Resource.LINE_HEX.indexOf(binary.charAt(i)) * Math.pow(2, binary.length() - 1 - i);

        }

        //itinialized result hexa
        String hexa = "";

        int Dec = decimal;

        // present how to convert from decimal to hexa
        while (Dec > 0) {
            hexa = Resource.LINE_HEX.charAt(Dec % 16) + hexa;
            Dec /= 16;
        }

        //return result
        return hexa;
    }

    /**
     * this method display how to convert from decimal to hexa
     *
     * @param decimal: itinialized variable convert to hexa
     * @return hexa : final result to user want to get
     */
    public static String convertFromDeciToHexa() {

       //itinialized  decimal
        String decimal = Validate.checkDeci();

        //itinialized  remainder
        int remainder = 0;

        //itinialized  hexa
        String hexa = "";

        // present how to convert from decimal to hexa
        int Dec = Integer.parseInt(decimal);
        while (Dec > 0) {
            remainder = Dec % 16;
            hexa = Resource.LINE_HEX.charAt(Dec % 16) + hexa;

            Dec /= 16;
        }

        //return result
        return decimal;
    }

    /**
     * this method display how to convert from decimal to binary
     *
     * @param decimal: itinialized variable convert to binary
     * @return binary : final result to user want to get
     */
    public static String convertFromDeciToBina() {

//itinialized  decimal
        String decimal = Validate.checkDeci();

//itinialized  remainder
        int remainder = 0;

        //itinialized  binary
        String binary = "";
        int Dec = Integer.parseInt(decimal);

        // present how to convert from decimal to binary
        while (Dec > 0) {
            remainder = Dec % 2;
            binary = Resource.LINE_HEX.charAt(Dec % 2) + binary;

            Dec /= 2;
        }

        // return result
        return binary;
    }

    /*
     * this method display how to convert from hexa to binary
     *
     * @param Hexa: itinialized variable hexa to start convert
     * @param decimal: itinialized medical variable convert to bianry
     * @return binary : final result to user want to get
     */
    public static String convertFromHexaToBina() {

        //itinialized variable hexa and checking
        String Hexa = Validate.checkHexa();

        //itinialized medical variable decimal
        int decimal = 0;

        Hexa = Hexa.toUpperCase();

//how to convert from hexa to decimal
        for (int i = 0; i < Hexa.length(); i++) {
            decimal += Resource.LINE_HEX.indexOf(Hexa.charAt(i)) * Math.pow(16, Hexa.length() - 1 - i);
        }
        int Dec = decimal;

        //final result
        String binary = "";

        //how to convert from decimal to binary
        while (Dec > 0) {
            binary = Resource.LINE_HEX.charAt(Dec % 2) + binary;
            Dec /= 2;
        }
        // return result
        return binary;
    }

}
