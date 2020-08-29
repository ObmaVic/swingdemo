package swingdemo.pcdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * @Description 边框设置demo
 * @Author ***
 * @Date 2020/8/30 0:11
 */
public class BorderDemo {
    public static void main(String[] args) {
        //1.设置窗体的框架
        JFrame jFrame = new JFrame("边框框架的示例");

        //2.设置窗体关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加组件
        BorderPanel borderPanel = new BorderPanel();
        jFrame.add(borderPanel);

        //4.设置窗体框架的大小和位置
        jFrame.setBounds(500,500,250,150);

        //5.显示窗体框架
        jFrame.setVisible(true);
    }
}
class BorderPanel extends JPanel{
    @Override
    public void paintComponent(Graphics graphics){

        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        float[] dash={10.0f};

        /**指定边框属性，
         * 如果设置图形边框架线条的属性，需要stroke接口
         * @Width：BaiscStroke的宽度。此宽度必须大于等于0.0f。如果将宽度设置为0.0f，则将笔画呈现为可用于目标设备和抗锯齿提示设置的最细线条
         * @Cap:BasicStroke端点的装饰
         * @join：应用在路径线段交汇处的装饰
         * @miterlimit：斜解除的剪裁限制。miterlimit必须大于等于1.0f
         * @dash：表示虚线模式的数组
         * @dash_phase:开始虚线模式的偏移量
         */
        BasicStroke basicStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f);
        graphics2D.setStroke(basicStroke);

       Rectangle2D.Double rect = new Rectangle2D.Double(20.0,10.0,80.0,60.0);
        graphics2D.draw(rect);
       /* RoundRectangle2D.Double roundrect = new RoundRectangle2D.Double(20, 10, 200, 80, 10, 10);
        graphics2D.draw(roundrect);*/
    }
}