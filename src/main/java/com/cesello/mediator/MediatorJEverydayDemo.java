package com.cesello.mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorJEverydayDemo {
    Toolkit toolkit;
    Timer timer;

    public MediatorJEverydayDemo(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }



    class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time's up!");
            toolkit.beep();
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("Now time's really up!");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new MediatorJEverydayDemo(3);
        System.out.println("Task scheduled. ");
    }
}


