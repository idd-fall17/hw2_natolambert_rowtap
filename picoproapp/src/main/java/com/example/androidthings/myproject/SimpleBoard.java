package com.example.androidthings.myproject;

import android.os.SystemClock;
import android.util.Log;

import com.google.android.things.pio.Gpio;
import com.google.android.things.pio.GpioCallback;

import java.io.IOException;

/**
 * This is an abstract parent class that defines utility functions for the SimpleX API.
 * Different classes for concrete boards like the Raspberry Pi or the Pico Pro subclass
 * it to define board-specific configuration.
 *
 * Students don't have to modify this file.
 *
 * Created by bjoern on 8/14/17.
 */

public abstract class SimpleBoard {
    private static final String TAG = SimpleBoard.class.getSimpleName();
    static final boolean HIGH = true;
    static final boolean LOW = false;

    void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Log.e(TAG,"delay",e);
        }
    }

    void delayMicroseconds(int micros) {
        try {
            Thread.sleep(0,micros*1000);
        }catch (InterruptedException e) {
            Log.e(TAG,"delayMicroseconds",e);
        }
    }

    long millis() {
        return SystemClock.uptimeMillis();
    }

    long micros() {
        return Math.round(SystemClock.elapsedRealtimeNanos()/1000.f);
    }

    void pinMode(Gpio pin, int mode) {
        try {
            pin.setDirection(mode);
        } catch (IOException e) {
            Log.e(TAG,"pinMode",e);
        }

    }
    void digitalWrite(Gpio pin, boolean value) {
        if(pin!=null) {
            try {
                pin.setValue(value);
            } catch (IOException e) {
                Log.e(TAG,"digitalWrite",e);
            }
        } else {
            Log.e(TAG,"digitalWrite - pin was null");
        }

    }
    boolean digitalRead(Gpio pin) {
        boolean result = false;
        if(pin!=null) {
            try {
                result = pin.getValue();
            } catch( IOException e) {
                Log.e(TAG, "digitalRead", e);
            }
        } else {
            Log.e(TAG,"digitalRead = pin was null");
        }
        return result;
    }

    void setEdgeTrigger(Gpio pin, int edgeType) {
        try {
            pin.setEdgeTriggerType(edgeType);
        } catch (IOException e) {
            Log.e(TAG,"setEdgeTrigger", e);
        }
    }

    protected GpioCallback gpioCallback = new GpioCallback() {
        @Override
        public boolean onGpioEdge(Gpio gpio) {
            boolean value = digitalRead(gpio);
            digitalEdgeEvent(gpio,value);

            // Continue listening for more interrupts
            return true;
        }

        @Override
        public void onGpioError(Gpio gpio, int error) {
            Log.w(TAG, gpio + ": Error event " + error);
        }
    };

    void print(String s) {
        Log.i(TAG,s);
    }
    void println(String s) {
        Log.i(TAG,s+"\n");
    }
    public abstract void setup();
    public abstract void loop();
    public abstract void teardown();
    void digitalEdgeEvent(Gpio pin, boolean value) {} // override this in

}
