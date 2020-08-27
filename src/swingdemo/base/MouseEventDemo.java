package swingdemo.base;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @Description 鼠标事件处理基本流程
 * @Author yumi
 * @Date 2020/8/27 13:46
 */
public class MouseEventDemo {
    /**
     * 定义私有变量，这个变量在整个类中都可以访问
     */
    private JLabel label;

    public void createUI() {
        /**1.创建窗体框架JFrame*/
        JFrame jFrame = new JFrame("鼠标事件处理示例");
        /**2.设置窗体框架关闭的操作*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**3.添加组件并注册鼠标事件监听器*/
        label = new JLabel();
        jFrame.add(label);
        jFrame.addMouseListener(new MouseHandler());
        /**4.设置字体大小*/
        jFrame.setSize(250, 120);
        /**5.显示窗体框架界面*/
        jFrame.setVisible(true);
    }

    //事务处理内部类
    class MouseHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            /**监听单击鼠标的动作，并把动作消息显示在标签label上*/
            label.setText("执行了单击鼠标的操作");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            /**监听按下鼠标按键的动作，并把动作消息显示在标签label上*/
            label.setText("执行了按下鼠标按键的动作");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            /**监听释放鼠标按键的动作，并把动作消息显示在标签label上*/
            label.setText("执行了释放鼠标按键的动作");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            /**监听鼠标是否进入监听区域，并把动作消息显示在标签label上*/
            label.setText("鼠标进入监听区域");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            /**监听鼠标是否离开监听区域，并把动作消息显示在标签label上*/
            label.setText("鼠标离开监听区域");
        }
    }

    //MouseEventDemo主函数
    public static void main(String[] args) {
        /**创建主类的对象*/
        MouseEventDemo mouseEventDemo = new MouseEventDemo();
        /**调用createdUI方法，创建程序应用*/
        mouseEventDemo.createUI();
    }
}
