package com.chen.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        // 1. 创建游戏主界面

        // 1.1 创建窗口并设置标题
        JFrame gameJFrame = new JFrame("拼图单机版V1.0");

        // 1.2 设置窗口大小
        gameJFrame.setSize(603, 680);

        // 1.3 设置窗口是否可见
        gameJFrame.setVisible(true);


        // 2. 创建登陆界面
        JFrame loginJFrame = new JFrame("登录");
        loginJFrame.setSize(488, 430);
        loginJFrame.setVisible(true);

        // 3. 创建注册界面
        JFrame registerJFrame = new JFrame("注册");
        registerJFrame.setSize(488, 500);
        registerJFrame.setVisible(true);



    }
}
