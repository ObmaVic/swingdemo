package swingdemo.base;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 提高程序事件的响应速度
 * @Author yumi
 * @Date 2020/8/27 16:13
 */
public class HelloWorldSwingDemo {
    private static void createAndShowGUI(){
        JFrame jFrame = new JFrame("HelloWorld");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("HelloWorld");
        jFrame.getContentPane().add(label);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        /**启动一个新的线程来处理创建、显示界面的工作*/
        //该程序的主启动类采用了多线程的方法，从而保证了对系统资源的充分利用
        javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
