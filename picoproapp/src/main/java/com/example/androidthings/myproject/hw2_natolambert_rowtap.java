package com.example.androidthings.myproject;

import com.google.android.things.pio.Gpio;

/**
 * Template for IDD Fall 2017 HW2 (text entry device)
 * Created by bjoern on 9/5/17.
 */


public class Hw2TemplateApp extends SimplePicoPro {
//    Defines some variables
    int typestate = 0;
    boolean shiftval = false;

    // Letter Keys
    Gpio butA = GPIO_128;
    Gpio butB = GPIO_39;
    Gpio butC = GPIO_37;
    Gpio butD = GPIO_35;
    Gpio butE = GPIO_34;
    Gpio butF = GPIO_33;
    Gpio butG = GPIO_32;

    // Special keys
    Gpio selUP = GPIO_10;
    Gpio selDW = GPIO_172;
    Gpio SHIFT = GPIO_173;

    //Led Pins
    Gpio LED1 = GPIO_174;
    Gpio LED2 = GPIO_175;


    @Override
    public void setup() {
        //sets GPIOs to input (10 buttons)
        pinMode(butA,Gpio.DIRECTION_IN);
        setEdgeTrigger(butA,Gpio.EDGE_BOTH);

        pinMode(butB,Gpio.DIRECTION_IN);
        setEdgeTrigger(butB,Gpio.EDGE_BOTH);

        pinMode(butC,Gpio.DIRECTION_IN);
        setEdgeTrigger(butC,Gpio.EDGE_BOTH);

        pinMode(butD,Gpio.DIRECTION_IN);
        setEdgeTrigger(butD,Gpio.EDGE_BOTH);

        pinMode(butE,Gpio.DIRECTION_IN);
        setEdgeTrigger(butE,Gpio.EDGE_BOTH);

        pinMode(butF,Gpio.DIRECTION_IN);
        setEdgeTrigger(butF,Gpio.EDGE_BOTH);

        pinMode(butG,Gpio.DIRECTION_IN);
        setEdgeTrigger(butG,Gpio.EDGE_BOTH);

        pinMode(selUP,Gpio.DIRECTION_IN);
        setEdgeTrigger(selUP,Gpio.EDGE_BOTH);

        pinMode(selDW,Gpio.DIRECTION_IN);
        setEdgeTrigger(selDW,Gpio.EDGE_BOTH);

        pinMode(SHIFT,Gpio.DIRECTION_IN);
        setEdgeTrigger(SHIFT,Gpio.EDGE_BOTH);

//        // Sets output pins for LEDs
        // Did not connect in demo, future implementation for
        // indicating row beyond user memory
        pinMode(LED1,Gpio.DIRECTION_OUT_INITIALLY_LOW);
        pinMode(LED2,Gpio.DIRECTION_OUT_INITIALLY_LOW);

        // Initialization test
        printStringToScreen("Initializing");
        delay(500);
        clearStringOnScreen();
    }

    @Override
    public void loop() {
        //nothing to do here

    }

    @Override
    void digitalEdgeEvent(Gpio pin, boolean value) {
        println("digitalEdgeEvent"+pin+", "+value);
        // when 128 goes from LOW to HIGH
        // this is on button button release for pull-up resistors

        // A column
        if(pin==butA && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen('V');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('O');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('H');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('A');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen('v');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('o');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('h');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('a');
                }
            }

        }

        // B column
        if (pin==butB && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen('W');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('P');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('I');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('B');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen('w');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('p');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('i');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('b');
                }
            }

        }

        // C column
        if (pin==butC && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen('X');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('Q');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('J');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('C');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen('x');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('q');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('j');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('c');
                }
            }
        }

        // D column
        if (pin==butD && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen('Y');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('R');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('K');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('D');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen('y');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('r');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('k');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('d');
                }
            }
        }

        // E column
        if (pin==butE && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen('Z');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('S');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('L');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('E');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen('z');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('s');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('l');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('e');
                }
            }
        }

        // F column
        if (pin==butF && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen(' ');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('T');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('M');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('F');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen(' ');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('t');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('m');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('f');
                }
            }
        }

        // G Column
        if (pin==butG && value==LOW) {
            if (shiftval){
                if (typestate == 0){
                    printCharacterToScreen(',');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('U');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('O');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('G');
                }
            }
            if (!shiftval){
                if (typestate == 0){
                    printCharacterToScreen('.');;
                }
                else if (typestate == 1){
                    printCharacterToScreen('u');;
                }
                else if (typestate == 2){
                    printCharacterToScreen('o');;
                }
                else if (typestate == 3){
                    printCharacterToScreen('g');
                }
            }
        }

        // State updater for column of letters
        // Row 0 = bottom
        // Row 3 = top


        // Row up
        if (pin==selUP && value==LOW) {
            if (typestate == 0){
                typestate = 1;
            }
            else if (typestate == 1){
                typestate = 2;
            }
            else if (typestate == 2){
                typestate = 3;
            }
            else if (typestate == 3){
                typestate = 0;
            }
        }

        // Row down
        if (pin==selDW && value==LOW) {
            if (typestate == 1){
                typestate = 0;
            }
            else if (typestate == 2){
                typestate = 1;
            }
            else if (typestate == 3){
                typestate = 2;
            }
            else if (typestate == 0){
                typestate = 3;
            }
        }


        // SHIFT key logic
        if (pin==SHIFT && value==LOW) {
            boolean check1 = digitalRead(selUP);
            boolean check2 = digitalRead(selDW);
            shiftval = ! shiftval;
//            if (!check1){
//                printStringToScreen("Checked1 Low");
//            }
//            if (!check2){
//                printStringToScreen("Checked2 Low");
//            }

            // if both select buttons pressed, clears screen
            if (!check1 && !check2){
                clearStringOnScreen();
            }
        }

        // PRINT STATEMENTS FOR DIAG ROW SWITCH
//        if (pin==selUP && value==LOW) {
//            printCharacterToScreen('U');
//            printCharacterToScreen('P');
//        }
//        if (pin==selDW && value==LOW) {
//            printCharacterToScreen('D');
//            printCharacterToScreen('W');
//        }

        // Most basic debounce idea
        // Did not update to more complex state machine because this
        // functions for at least 9/10 button presses
        delay(60);

    }
}
