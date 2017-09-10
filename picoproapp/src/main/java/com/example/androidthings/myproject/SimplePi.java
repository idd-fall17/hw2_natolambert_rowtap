package com.example.androidthings.myproject;

import android.os.SystemClock;
import android.util.Log;

import com.google.android.things.pio.Gpio;
import com.google.android.things.pio.I2cDevice;
import com.google.android.things.pio.PeripheralManagerService;
import com.google.android.things.pio.Pwm;
import com.google.android.things.pio.SpiDevice;

import java.io.IOException;

/**
 * Created by bjoern on 7/26/17.
 */

public abstract class SimplePi extends SimpleBoard {
    private static final String TAG = SimplePi.class.getSimpleName();

    static PeripheralManagerService service = new PeripheralManagerService();
    static Gpio BCM12,BCM13, BCM16, BCM17, BCM18, BCM19, BCM20, BCM21, BCM22, BCM23, BCM24, BCM25, BCM26, BCM27, BCM4, BCM5, BCM6;
    static Pwm PWM0, PWM1;
    static I2cDevice I2C1;
    static SpiDevice SPI0,SPI1;


    public SimplePi() {
        try {
            BCM12 = service.openGpio("BCM12");
            //BCM13 = service.openGpio("BCM13"); -> PWM1
            BCM16 = service.openGpio("BCM16");
            BCM17 = service.openGpio("BCM17");
            //BCM18 = service.openGpio("BCM18"); -> PWM0
            BCM19 = service.openGpio("BCM19");
            BCM20 = service.openGpio("BCM20");
            BCM21 = service.openGpio("BCM21");
            BCM22 = service.openGpio("BCM22");
            BCM23 = service.openGpio("BCM23");
            BCM24 = service.openGpio("BCM24");
            BCM25 = service.openGpio("BCM25");
            BCM26 = service.openGpio("BCM26");
            BCM27 = service.openGpio("BCM27");
            BCM4 = service.openGpio("BCM4");
            BCM5 = service.openGpio("BCM5");
            BCM6 = service.openGpio("BCM6");
            PWM0 = service.openPwm("PWM0");
            PWM1 = service.openPwm("PWM1");
            //I2C1 = service.openI2cDevice("I2C1",0);
            SPI0 = service.openSpiDevice("SPI0.0");
            SPI1 = service.openSpiDevice("SPI0.1");

        } catch (IOException e) {
            Log.e(TAG,"preSetup",e);
        }

    }

    public void teardown() {
        try {
            BCM12.close();
            BCM13.close();
            // ...
        } catch (IOException e) {
            Log.e(TAG,"destroy",e);
        }


    }



}
