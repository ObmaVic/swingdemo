package swingdemo.pcdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.CubicCurve2D;

/**
 * @Description 直线线条绘制过程
 * @Author ***
 * @Date 2020/8/29 17:50
 */
public class LineDemo {
    public static void main(String[] args) {
        //1.创建窗体框架
        JFrame jFrame = new JFrame("绘制直线的程序");

        //2.设置窗体关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加组件
        PaintPanel paintPanel = new PaintPanel();
        jFrame.add(paintPanel);

        //4.设置窗体的大小和位置
        jFrame.setBounds(200, 200, 250, 120);

        //5.显示窗体框架的界面
        jFrame.setVisible(true);
    }
}

class PaintPanel extends JPanel {
    public void paintCompontent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        //绘制直线的方法
       // Line2D.Double line = new Line2D.Double(10.0, 20.0, 200.0, 80.0);
     /*   Point2D.Double begin = new Point2D.Double(10.0, 20.0);
        Point2D.Double end = new Point2D.Double(100.0, 80.0);
        Line2D.Double line = new Line2D.Double(begin, end);
        graphics2D.draw(line);*/
        //绘制曲线的方法
        CubicCurve2D.Double cubic2D = new CubicCurve2D.Double();
        /**
         * （10.0,20.0）是起点的坐标
         * （200.0,80.0）是终点的坐标
         * （60.0,70.0）和（100.0,10.0）是曲线中间经过的两个坐标
         */
        cubic2D.setCurve(10.0, 20.0, 60.0, 70.0, 100.0, 10.0, 200.0, 80.0);
        graphics2D.draw(cubic2D);
    }
}