
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

/**
 * The purpose of this class is to set up the graphical skeleton.
 */
public class SmartFrame {

    public JFrame frame;

    public static JLabel jLabel;


    public SmartFrame() {

        // Main frame.
        frame = new JFrame();

        // for show images.
        jLabel = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setUndecorated(true);

        frame.setBackground(new Color(0, 0, 0, 0));

        frame.setBounds(Config.FRAME_LOCAT_X, Config.FRAME_LOCAT_Y, Config.FRAME_WIDTH, Config.FRAME_HEIGHT);

        frame.setAlwaysOnTop(true);

        frame.setType(JFrame.Type.UTILITY);

        setTray(frame);
        frame.add(jLabel);

        frame.setVisible(true);

        ImageSet.toDo = LiveStatus.SLEEP;
        ImageSet.willDo = true;
    }


    //设置托盘菜单
    private static void setTray(JFrame frame) {

        //Determine whether the system supports the system tray.
        if (SystemTray.isSupported()) {

            // Gets the pallet of the current system
            SystemTray tray = SystemTray.getSystemTray();

            // Add a right-click pop-up menu to the tray
            PopupMenu popMenu = new PopupMenu();

            MenuItem itemOpen = new MenuItem("Open");
            itemOpen.addActionListener(e -> frame.setVisible(true));

            MenuItem itemHide = new MenuItem("Hide");
            itemHide.addActionListener(e -> frame.setVisible(false));

            MenuItem itemExit = new MenuItem("Exit");
            itemExit.addActionListener(e -> System.exit(0));

            popMenu.add(itemOpen);
            popMenu.add(itemHide);
            popMenu.add(itemExit);

            // Set tray icon
            ImageIcon icon = new ImageIcon(Config.TRAY_ICON_PATH);
            Image image = icon.getImage().getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT);

            TrayIcon trayIcon = new TrayIcon(image, "牛妞妞", popMenu);

            //Adaptive size, this property is critical
            trayIcon.setImageAutoSize(true);

            try {
                tray.add(trayIcon);
            } catch (AWTException e1) {
                e1.printStackTrace();
            }
        }
    }
}