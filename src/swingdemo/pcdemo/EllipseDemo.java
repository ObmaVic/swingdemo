package swingdemo.pcdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @Description 圆形绘制demo
 * @Author ***
 * @Date 2020/8/29 23:41
 */
public class EllipseDemo {
    public static void main(String[] args) {
        //1.创建框架
        JFrame jFrame = new JFrame("绘制圆形的程序");

        //2.窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加组件
        EllipsePanel ellipsePanel = new EllipsePanel();
        jFrame.add(ellipsePanel);

        //4.设置窗体的大小和位置
        jFrame.setBounds(500,500,250,120);

        //5.显示窗体床架界面
        jFrame.setVisible(true);
    }
}
class EllipsePanel extends JPanel{
    @Override
    public void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        /**（x,y)是⚪的定位
         * （w，h）是图形的属性
         * 即椭圆的左上角坐标为（100，50）；椭圆的宽为150；高度为50
         */
        Ellipse2D ellipse = new Ellipse2D.Double(100, 50, 150, 50);
        graphics2D.draw(ellipse);
    }
}