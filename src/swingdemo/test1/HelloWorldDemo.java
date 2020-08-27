package swingdemo.test1;

import javax.swing.*;
import java.awt.*;

/**
 * @Description helloWorldDemo 案例测试
 * @Author yumi
 * @Date 2020/8/27 11:44
 */
public class HelloWorldDemo {

    public static void main(String[] args) {
        /**创建窗体框架JFrame*/
        JFrame jFrame = new JFrame("HelloWorld示例程序");
        /**1.设置窗体关闭时的操作*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**2.创建并添加标签组件；后面可以添加事务*/
        JLabel jLabel = new JLabel("HelloWorldDemo");
        jFrame.getContentPane().add(jLabel, BorderLayout.CENTER);
        /**3.自动选择合适的大小*/
        jFrame.pack();
        /**4.显示窗体的框架*/
        jFrame.setVisible(true);
    }
}
