package swingdemo.pcdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @Description 给颜色填充的demo
 * @Author ***
 * @Date 2020/8/29 23:53
 */
public class ColorDemo {
    public static void main(String[] args) {
        //1.设置窗体框架
        JFrame jFrame = new JFrame("颜色填充的示例");

        //2.设置窗体关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加组件
        ColorPanel colorPanel = new ColorPanel();
        jFrame.add(colorPanel);

        //4.显示窗体的大小和位置
        jFrame.setBounds(500,500,250,150);

        //5.显示窗体框架界面
        jFrame.setVisible(true);
    }
}
class ColorPanel extends JPanel{
    @Override
    public void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        /**渐近色的画笔工具，
         * GradientPaint类剔红了使用线性颜色渐变模式填充图形的方式。
         * 在（0，0)点和（150，0）点的连线上颜色的渐变
         */
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, 150, 0, Color.BLUE);
       //设置画笔
        graphics2D.setPaint(gradientPaint);
        //用指定画笔填充图形
        Ellipse2D ellipse = new Ellipse2D.Double(50, 10, 150, 100);
        graphics2D.fill(ellipse);
    }
}