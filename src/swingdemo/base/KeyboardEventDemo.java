package swingdemo.base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Description 键盘事件处理示例
 * @Author yumi
 * @Date 2020/8/27 15:33
 */
public class KeyboardEventDemo {
    /**定义私有变量*/
    private JTextArea textArea;
    private JTextField textField;
    private String actions="";

    public void createUI(){
        /**创建示例框架*/
        JFrame jFrame = new JFrame("键盘事件处理示例");
        /**设置窗体框架关闭时的操作*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**添加组件并注册键盘事件监听器*/
        textArea=new JTextArea();
        textField=new JTextField(15);
        textField.addKeyListener(new KeyboardHandler());
        jFrame.add(textArea, BorderLayout.SOUTH);
        jFrame.add(textField,BorderLayout.CENTER);
        /**设置窗体大小*/
        jFrame.setSize(250,120);
        /**显示窗体框架界面*/
        jFrame.setVisible(true);
    }
    //事件处理内部类
    class KeyboardHandler implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            /**监听按键输入的动作，并把动作消息显示在文本域textArea中*/
            actions+="按键"+e.getKeyChar()+"被输入。\n";
            textArea.setText(actions);
            System.out.println(actions);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            /**监听按下按键的动作，并把动作消息显示在文本域textArea中*/
            actions+="按键"+ KeyEvent.getKeyText(e.getKeyCode())+"被按下+\n";
            textArea.setText(actions);
            System.out.println(actions);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            /**监听释放按键的动作，并把动作消息显示在文本域textArea中*/
            actions+="按下"+ KeyEvent.getKeyText(e.getKeyCode())+"被释放。\n";
            textArea.setText(actions);
            System.out.println(actions);
        }
    }
    //keyboardEvent的主函数
    public static void main(String[] args) {
        KeyboardEventDemo keyboardEventDemo = new KeyboardEventDemo();
        keyboardEventDemo.createUI();
    }
}
