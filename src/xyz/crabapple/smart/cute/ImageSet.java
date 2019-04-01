package xyz.crabapple.smart.cute;

/*
 * Copyright (c) This is zhaoxubin's Java program.
 * Copyright belongs to the crabapple organization.
 * The crabapple organization has all rights to this program.
 * No individual or organization can refer to or reproduce this program without permission.
 * If you need to reprint or quote, please post it to zhaoxubin2016@live.com.
 * You will get a reply within a week,
 */

import javax.swing.*;
import java.awt.*;

public class ImageSet extends Thread{

    public volatile static LiveStatus toDo;

    public volatile static boolean willDo = false;


    public volatile static Object swapLoak=new Object();

    @Override
    public void run() {

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        int i=0;

        synchronized(swapLoak) {
            while (true) {

                if (willDo) {

                    ImageIcon image = new ImageIcon(Config.PET_IMAGES_PATH + toDo.name() + "\\" + "1.gif");
                    image.setImage(image.getImage().getScaledInstance(Config.FRAME_WIDTH, Config.FRAME_HEIGHT, Image.SCALE_DEFAULT));
                    SmartFrame.jLabel.setIcon(image);

                    willDo = false;

                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
