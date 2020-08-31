package appletdemo.applet;

import javax.swing.*;

/**
 * @Description Applet的生命周期示例
 * @Author ***
 * @Date 2020/8/30 19:11
 */
public class LifeCyle extends JApplet {
//<applet code="LifeCycle.class" width="200" height="80"></applet>
    @Override
    public void init(){
        System.out.println("init()方法被调用");
    }
    @Override
    public void start(){
        System.out.println("start()方法被调用");
    }

    @Override
    public void stop(){
        System.out.println("stop()方法被调用");
    }
    @Override
    public void destroy(){
        System.out.println("destroy()方法被调用");
    }
}
