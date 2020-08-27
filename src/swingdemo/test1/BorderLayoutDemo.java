package swingdemo.test1;

import javax.swing.*;
import java.awt.*;

/**
 * @Description borderLayout布局示例
 * @Author yumi
 * @Date 2020/8/27 17:23
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        //1.创建窗体框架
        JFrame jFrame = new JFrame("BorderLayout示例程序");

        //2.设置窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加标签组件
        /**5个基本布局*/
        JButton northButton = new JButton("North");
        JButton sourthButton = new JButton("Sourth");
        JButton westButton = new JButton("West");
        JButton eastButton = new JButton("East");
        JButton centerButton = new JButton("Center");
        jFrame.getContentPane().add(northButton, BorderLayout.NORTH);
        jFrame.getContentPane().add(sourthButton,BorderLayout.SOUTH);
        jFrame.getContentPane().add(westButton,BorderLayout.WEST);
        jFrame.getContentPane().add(eastButton,BorderLayout.EAST);
        jFrame.getContentPane().add(centerButton,BorderLayout.CENTER);

        //4.自动选择合适的大小
        jFrame.pack();

        //5.显示窗体框架界面
        jFrame.setVisible(true);

    }
}
