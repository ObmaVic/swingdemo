package swingdemo.pcdemo;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * @Description 矩形绘制demo
 * @Author ***
 * @Date 2020/8/29 23:15
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //1.设置窗体框架
        JFrame jFrame = new JFrame("绘制矩形框架示例程序");

        //2.设置窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加组件
        RectanglePenel penel = new RectanglePenel();
        jFrame.add(penel);

        //4.设置窗体的大小和位置
        jFrame.setBounds(500,500,250,120);

        //5.显示窗体框架界面
        jFrame.setVisible(true);
    }
}
class  RectanglePenel extends JPanel{
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        Rectangle2D.Double rect = new Rectangle2D.Double(20.0, 10.0, 200.0, 60.0);
        graphics2D.draw(rect);
    }
}
