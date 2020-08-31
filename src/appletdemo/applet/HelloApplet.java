package appletdemo.applet;

import javax.swing.*;

/**
 * @Description 通过继承JApplet类实现一个简单的applet程序
 * @Author ***
 * @Date 2020/8/30 17:10
 */
public class HelloApplet extends JApplet {
   // <applet code="HelloApplet.class" width="200" height="80"></applet>
    /**
     * Applet中有4个主要的函数，分别为：init，start，stop和destroy，
     * init相当于普通Java程序中的main函数
     * 每一个applet程序都会从init函数开始运行
     */
    @Override
    public void init(){
        JLabel jLabel = new JLabel("Hello Applet！！！");
        add(jLabel);
    }
}
