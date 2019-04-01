package xyz.crabapple.smart.cute;

/*
 * Copyright (c) This is zhaoxubin's Java program.
 * Copyright belongs to the crabapple organization.
 * The crabapple organization has all rights to this program.
 * No individual or organization can refer to or reproduce this program without permission.
 * If you need to reprint or quote, please post it to zhaoxubin2016@live.com.
 * You will get a reply within a week,
 */

import java.util.Random;

/**
 * This thread is used to manage the behavior of the personas.
 */
public class Direct implements Runnable{


    @Override
    public void run() {

        Random random=new Random();
        while(true){
            try {
                Thread.sleep(1000000+random.nextInt(2000000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int ran=random.nextInt(100);

            LiveStatus[] list=LiveStatus.values();
            ImageSet.toDo=list[ran<70?random.nextInt(2):2+random.nextInt(5)];
            ImageSet.willDo=true;
        }
    }
}
