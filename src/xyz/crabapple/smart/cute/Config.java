package xyz.crabapple.smart.cute;

/*
 * Copyright (c) This is zhaoxubin's Java program.
 * Copyright belongs to the crabapple organization.
 * The crabapple organization has all rights to this program.
 * No individual or organization can refer to or reproduce this program without permission.
 * If you need to reprint or quote, please post it to zhaoxubin2016@live.com.
 * You will get a reply within a week,
 */

import java.awt.*;


/**
 * There are many global variables that can be configured and basic information set.
 */
public class Config {

    /**
     * the images parent directory path.
     */
    public static final String PET_IMAGES_PATH = "C:\\Users\\Think\\Documents\\project_file\\smart\\img\\";

    /**
     * must named in logo.png.
     */
    public static final String TRAY_ICON_PATH = "C:\\Users\\Think\\Documents\\project_file\\smart\\img\\logo.png";

    /**
     * frame's width and height.
     */
    public static final int FRAME_WIDTH = 160;
    public static final int FRAME_HEIGHT = 130;

    /**
     * frame location in computer ration
     */
    public static final float FRAME_LOCAL_X_RATIO = 0.8F;
    public static final float FRAME_LOCAL_Y_RATIO = 0.75F;

    /**
     * computer's window width.
     */
    public static final int WINDOW_WIDTH = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

    /**
     * computer's window height.
     */
    public static final int WINDOWS_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    /**
     * frame's location x and y
     */
    public static final int FRAME_LOCAT_X = (int) (WINDOW_WIDTH * FRAME_LOCAL_X_RATIO);
    public static final int FRAME_LOCAT_Y = (int) (WINDOWS_HEIGHT * FRAME_LOCAL_Y_RATIO);


}
