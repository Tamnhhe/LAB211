package j1.s.p0011;

/**
 * This class have role : control entry and run program.
 *
 *
 * @author HE171455
 * @version 9/10/2023
 */
public class Main {

    public static void main(String[] args) {

//step is linked to choice convert
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    //linked to  convert binary
                    Manager.convertFromBina();
                    break;
                case 2:
                    //linked to convert decimal
                    Manager.convertFromDeci();
                    break;

                case 3:
                    //linked to convert hexa
                    Manager.convertFromHexa();
                    break;
                //return to step before
                case 4:
                    return;

            }

        }

    }

}
