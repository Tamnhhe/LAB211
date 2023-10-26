package j1.s.p0011;

import static j1.s.p0011.Resource.BINA_INPUT;
import static j1.s.p0011.Resource.BINA_VALID;
import static j1.s.p0011.Resource.CHOICE_INPUT;
import static j1.s.p0011.Resource.DECI_VALID;
import static j1.s.p0011.Resource.DEC_INPUT;
import static j1.s.p0011.Resource.ERRO_AGAINS;
import static j1.s.p0011.Resource.ERRO_BINA;
import static j1.s.p0011.Resource.ERRO_DEC;
import static j1.s.p0011.Resource.ERRO_HEX;
import static j1.s.p0011.Resource.HEXA_VALID;
import static j1.s.p0011.Resource.HEX_INPUT;
import java.util.Scanner;

/**
 * this class have method to check input getting (binary, decimal, hexa and
 * choice )
 *
 * @author HE171455 version 9/10/2023
 */
public class Validate {

    static Scanner in = new Scanner(System.in);

    /**
     * this method that checking and return input choice from menu
     *
     * @param choice : initialized variable
     * @return choice
     */
    public static int checkInputLimit(int min, int max) {
        //initialized variable
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(in.nextLine().trim());
                //checking that return variable if check done
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                ////printf if get fails
                System.err.printf(CHOICE_INPUT, min, max);
                System.out.println();
                System.out.println(ERRO_AGAINS);
            }
        }

    }

    /**
     * this method that checking and return input binary
     *
     * @param binary : initialized variable
     * @return binary
     */
    public static String checkBina() {
        //display directory
        System.out.println(BINA_INPUT);
        // initialized variable
        String binary;
        while (true) {
            binary = in.nextLine().trim();
            //checking that return variable if check done
            if (binary.matches(BINA_VALID)) {
                return binary;
            }
            ////printf if get fails
            System.err.println(ERRO_BINA);
            System.out.println(ERRO_AGAINS);

        }

    }

    /**
     * this method that checking and return input decimal
     *
     * @param decimal : initialized variable
     * @return binary
     */
    public static String checkDeci() {  //checking input decimal
        //display directory
        System.out.println(DEC_INPUT);

        // initialized variable
        String decimal;
        while (true) {
            decimal = in.nextLine().trim();

            //checking that return variable if check done
            if (decimal.matches(DECI_VALID)) {
                return decimal;
            }

            //printf if get fails
            System.err.println(ERRO_DEC);
            System.out.println(ERRO_AGAINS);

        }

    }

    /**
     * this method that checking and return input hexa
     *
     * @param hexa : initialized variable
     * @return hexa
     */
    public static String checkHexa() {
        //display directory
        System.out.println(HEX_INPUT);

        String result;
        while (true) {
            result = in.nextLine().trim();
            result = result.toUpperCase();
            //checking that return variable if check done
            if (result.matches(HEXA_VALID)) {
                return result;
            }
            //printf if get fails
            System.err.println(ERRO_HEX);
            System.out.println(ERRO_AGAINS);

        }

    }
}
