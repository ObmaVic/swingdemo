package swingdemo.base;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description 动作事件处理实例
 * @Author yumi
 * @Date 2020/8/27 12:10
 */
public class SimpleEvent {
    public void createUI(){
        /**1.创建窗体框架*/
        JFrame jFrame = new JFrame("简单事务事件处理示例");
        /**2.设置窗体框架关闭时的操作*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**3.创建按钮组件，并给按钮组件添加动作事件监听器*/
        JButton jButton = new JButton("单击按钮进行测试");
        //给button添加事件监听器
        jButton.addActionListener(new ClickAction());
        jFrame.getContentPane().add(jButton);
        /**4.设置窗体大小*/
        jFrame.setSize(250,120);
        /**5.显示窗体框架界面*/
        jFrame.setVisible(true);
    }
    //事件处理内部类
    class ClickAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("用户执行了单击按钮的操作");
        }
    }
    /**simpleEvent的主类*/
    public static void main(String[] args) {
        //创建SimpleEvent类的对象
        SimpleEvent simpleEvent = new SimpleEvent();
        //调用createUI（）方法，创建程序界面
        simpleEvent.createUI();
    }
}
