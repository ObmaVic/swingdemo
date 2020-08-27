package swingdemo.panedemo;

import javax.swing.*;
import java.awt.*;

/**
 * @Description 展示Swing中基本的容器结构和原理示例
 * @Author yumi
 * @Date 2020/8/27 16:33
 */
public class ContainerDemo {
    public static void main(String[] args) {
        /**1.创建窗体框架*/
        JFrame jFrame = new JFrame("Swing容器结构示例");

        /**2.设置窗体框架关闭时的操作*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**3.创建并添加组件*/
        //3.创建标签
        JLabel label = new JLabel("位于JFrame上的标签");
        /**把标签直接添加到JFrame的容器窗格ContentPane中*/
        jFrame.getContentPane().add(label, BorderLayout.NORTH);

        //创建JPanel面板
        JPanel jPanel = new JPanel();
        //创建按钮
        JButton  button = new JButton("位于JPanel上的按钮");
        /**把按钮添加到JPanel面板*/
        jPanel.add(button);
        //把JPanel面板添加到JFrame的内容窗格ContentPane
        jFrame.getContentPane().add(jPanel,BorderLayout.CENTER);

        /**4.设置窗体的大小和位置*/
        jFrame.setBounds(200,200,200,120);

        /**5.显示窗体框架界面*/
        jFrame.setVisible(true);
    }
}
