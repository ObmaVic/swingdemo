package swingdemo.plugin;

import javax.swing.*;
import java.awt.*;

/**
 * @Description
 * @Author ***
 * @Date 2020/8/27 17:41
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        //1.创建窗体框架
        JFrame jFrame = new JFrame("FlowLayout示例程序");

        //2.设置窗体关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加标签组件
        JButton northButton = new JButton("North");
        JButton sourthButton = new JButton("Sourth");
        JButton westButton = new JButton("West");
        JButton eastButton = new JButton("East");
        JButton centerButton = new JButton("Center");

        FlowLayout layout = new FlowLayout();
        jFrame.getContentPane().setLayout(layout);
        jFrame.getContentPane().add(northButton);
        jFrame.getContentPane().add(sourthButton);
        jFrame.getContentPane().add(westButton);
        jFrame.getContentPane().add(eastButton);
        jFrame.getContentPane().add(centerButton);

        //4.自动选择合适的大小
        jFrame.pack();

        //5.显示窗体框架界面
        jFrame.setVisible(true);

    }
}
