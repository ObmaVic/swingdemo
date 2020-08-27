package swingdemo.plugin;

import javax.swing.*;
import java.awt.*;

/**
 * @Description 单选按钮示例
 * @Author yumi
 * @Date 2020/8/27 18:36
 */
public class ButtonDemo {
    public static void main(String[] args) {
        //1.创建窗体框架
        JFrame jFrame = new JFrame("按钮示例程序");

        //2.设置窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加标签组件
        JRadioButton button1 = new JRadioButton("按钮一");
        JRadioButton button2 = new JRadioButton("按钮二");
        JRadioButton button3 = new JRadioButton("按钮三");

        //单选按钮
        FlowLayout flowLayout = new FlowLayout();
        jFrame.getContentPane().setLayout(flowLayout);
        jFrame.getContentPane().add(button1);
        jFrame.getContentPane().add(button2);
        jFrame.getContentPane().add(button3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);
        buttonGroup.add(button3);

        //4.自动选择合适的大小
        jFrame.pack();

        //5.显示窗体框架界面
        jFrame.setVisible(true);
    }
}
