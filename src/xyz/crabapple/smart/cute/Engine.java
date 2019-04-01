package xyz.crabapple.smart.cute;

/*
 * Copyright (c) This is zhaoxubin's Java program.
 * Copyright belongs to the crabapple organization.
 * The crabapple organization has all rights to this program.
 * No individual or organization can refer to or reproduce this program without permission.
 * If you need to reprint or quote, please post it to zhaoxubin2016@live.com.
 * You will get a reply within a week,
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * this is a class for the project start.
 */
public class Engine {

    public static void main(String[] args) throws InterruptedException {

        new SmartFrame();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new ImageSet());
        executorService.submit(new Direct());
        executorService.shutdown();

    }
}
